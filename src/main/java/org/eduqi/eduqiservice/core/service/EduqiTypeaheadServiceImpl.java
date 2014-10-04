package org.eduqi.eduqiservice.core.service;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eduqi.eduqiservice.core.dao.DadosEscolaDAO;
import org.eduqi.eduqiservice.core.domain.EduQIElement;
import org.eduqi.eduqiservice.core.domain.SchoolName;
import org.eduqi.eduqiservice.core.domain.SchoolNameList;
import org.eduqi.eduqiservice.core.entity.DadosEscola;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EduqiTypeaheadServiceImpl implements EduqiTypeaheadService{

	@Autowired
	private DadosEscolaDAO resultadoEscolaDAO;
	private static EduQIGenericTypeaheadInstance<EduQIElement> instance;
	private static final Logger LOG = Logger.getLogger(EduqiTypeaheadServiceImpl.class);

	@Override
	public List<SchoolName> searchSchoolName(String query) {
		return null;
	}

	@Override
	public void startTypeAhead() throws Exception {
		if(instance == null){
			instance = new EduQIGenericTypeaheadInstance<EduQIElement>("eduqitypeahead", getFile());
		}

		LOG.info("starting indexation ...");
		List<DadosEscola> tempEscolaResult = resultadoEscolaDAO.listAll();

		for (int i = 0 ;i < tempEscolaResult.size(); i++) {
			DadosEscola dadosEscola = tempEscolaResult.get(i);
			EduQIElement element = new EduQIElement();
			element.setElementId(i+1);
			element.setSchoolId(dadosEscola.getIdEscola());
			element.setSchoolName(dadosEscola.getNomeEscola());
			element.setTerms(dadosEscola.getNomeEscola().split("\\s+"));

			if(instance.getIndexer().index(element)){
				LOG.debug("Indexing "+ dadosEscola.getNomeEscola());
			}else{
				LOG.debug(dadosEscola.getNomeEscola()+" not Indexed!!!!!!");
			}
		}
		LOG.info("indexation finished ...");
	}

	private File getFile(){
		URL url = getClass().getResource("/config");
		return new File(url.getPath());
	}

	public EduQIGenericTypeaheadInstance<EduQIElement> getInstance() {
		return instance;
	}

	public SchoolNameList search(int number,int limit, String[] terms){
		List<SchoolName> result = new ArrayList<SchoolName>();
		List<EduQIElement> elements = instance.getSearcher().search(number, terms);
		if(limit == 0){
			for (EduQIElement eduQIElement : elements) {
				result.add(new SchoolName(eduQIElement.getSchoolId(), eduQIElement.getSchoolName()));
			}
		}else{
			for (int i = 0; i < elements.size(); i++) {
				if(i == limit ){
					break;
				}
				EduQIElement eduQIElement = elements.get(i);
				result.add(new SchoolName(eduQIElement.getSchoolId(), eduQIElement.getSchoolName()));
			}
		}
		return new SchoolNameList(result);
	}
}

package org.eduqi.eduqiservice.core.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eduqi.eduqiservice.core.dao.DescricaoQuestionarioEscolaDAO;
import org.eduqi.eduqiservice.core.dao.DescricaoQuestionarioEscolaDAOImpl;
import org.eduqi.eduqiservice.core.dao.QuestEscolaDAOImpl;
import org.eduqi.eduqiservice.core.dao.ResultadoEscolaDAOImpl;
import org.eduqi.eduqiservice.core.domain.Form;
import org.eduqi.eduqiservice.core.domain.Formanswers;
import org.eduqi.eduqiservice.core.entity.DescricaoQuestionarioEscola;
import org.eduqi.eduqiservice.core.entity.QuestEscola;
import org.eduqi.eduqiservice.core.entity.ResultadoEscola;
import org.eduqi.eduqiservice.core.util.EduqiQuestParser;


public class EduqiSchoolServiceImpl implements EduqiSchoolService{

	private static final Logger LOG = Logger.getLogger(EduqiEscolaCEPServiceImpl.class);

	public static Formanswers getSchoolAnswers(int id){
		DescricaoQuestionarioEscolaDAO questDAO = new DescricaoQuestionarioEscolaDAOImpl();
		QuestEscolaDAOImpl escolaDAO = new  QuestEscolaDAOImpl();
		List<Form> answers = new ArrayList<Form>();

		List<DescricaoQuestionarioEscola> descQuest = questDAO.listAll();	
		QuestEscola questResult = escolaDAO.findById(id);

		if(questResult != null){
			LOG.debug("adding info ... ");
			//Just infrastructure questions
			answers.add(new Form("7", descQuest.get(0).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ007())));
			answers.add(new Form("8", descQuest.get(1).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ008())));
			answers.add(new Form("9", descQuest.get(2).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ009())));
			answers.add(new Form("10", descQuest.get(3).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ010())));
			answers.add(new Form("11", descQuest.get(4).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ011())));
			answers.add(new Form("12", descQuest.get(5).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ012())));
			answers.add(new Form("13", descQuest.get(6).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ013())));
			answers.add(new Form("14", descQuest.get(7).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ014())));
			answers.add(new Form("15", descQuest.get(8).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ015())));
			answers.add(new Form("16", descQuest.get(9).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ016())));
			answers.add(new Form("17", descQuest.get(10).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ017())));
			answers.add(new Form("18", descQuest.get(11).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ018())));
			answers.add(new Form("19", descQuest.get(12).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ019())));
			answers.add(new Form("20", descQuest.get(13).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ020())));
			answers.add(new Form("21", descQuest.get(14).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ021())));
			answers.add(new Form("22", descQuest.get(15).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ022())));
			answers.add(new Form("23", descQuest.get(16).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ023())));
			answers.add(new Form("24", descQuest.get(17).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ024())));
			answers.add(new Form("25", descQuest.get(18).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ025())));
			answers.add(new Form("26", descQuest.get(19).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ026())));
			answers.add(new Form("27", descQuest.get(20).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ027())));
			answers.add(new Form("28", descQuest.get(21).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ028())));
			answers.add(new Form("29", descQuest.get(22).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ029())));
			answers.add(new Form("30", descQuest.get(23).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ030())));
			answers.add(new Form("31", descQuest.get(24).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ031())));
			answers.add(new Form("32", descQuest.get(25).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ032())));
			answers.add(new Form("33", descQuest.get(26).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ033())));
			answers.add(new Form("34", descQuest.get(27).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ034())));
			answers.add(new Form("35", descQuest.get(28).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ035())));
			answers.add(new Form("36", descQuest.get(29).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ036())));
			answers.add(new Form("37", descQuest.get(30).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ037())));
			answers.add(new Form("38", descQuest.get(31).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ038())));
			answers.add(new Form("39", descQuest.get(32).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ039())));
			answers.add(new Form("40", descQuest.get(33).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ040())));
			answers.add(new Form("41", descQuest.get(34).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ041())));
			answers.add(new Form("42", descQuest.get(35).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ042())));
			answers.add(new Form("43", descQuest.get(36).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ043())));
			answers.add(new Form("44", descQuest.get(37).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ044())));
			answers.add(new Form("45", descQuest.get(38).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ045())));
			answers.add(new Form("46", descQuest.get(39).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ046())));
			answers.add(new Form("47", descQuest.get(40).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ047())));
			answers.add(new Form("48", descQuest.get(41).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ048())));
			answers.add(new Form("49", descQuest.get(42).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ049())));
			answers.add(new Form("50", descQuest.get(43).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ050())));
			answers.add(new Form("51", descQuest.get(44).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ051())));
			answers.add(new Form("52", descQuest.get(45).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ052())));
			answers.add(new Form("53", descQuest.get(46).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ053())));
			answers.add(new Form("54", descQuest.get(47).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ054())));
			answers.add(new Form("55", descQuest.get(48).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ055())));
			answers.add(new Form("56", descQuest.get(49).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ056())));
			answers.add(new Form("57", descQuest.get(50).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ057())));
			answers.add(new Form("58", descQuest.get(51).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ058())));
			answers.add(new Form("59", descQuest.get(52).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ059())));
			answers.add(new Form("60", descQuest.get(53).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ060())));
			answers.add(new Form("61", descQuest.get(54).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ061())));
			answers.add(new Form("62", descQuest.get(55).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ062())));
			answers.add(new Form("63", descQuest.get(56).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ063())));
			answers.add(new Form("64", descQuest.get(57).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ064())));
			answers.add(new Form("65", descQuest.get(58).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ065())));
			answers.add(new Form("66", descQuest.get(58).getDescricaoPergunta(), EduqiQuestParser.matchString(questResult.getTxRespQ066())));	
			
			LOG.debug("Info added. ");
			return new Formanswers(answers);
		}
		else{
			LOG.info("School record not found for id="+id);
		}
		return null;
	}

	public static List<QuestEscola> buildStat(){
		ResultadoEscolaDAOImpl escolaDAOImpl = new ResultadoEscolaDAOImpl();
		List<ResultadoEscola> mt = escolaDAOImpl.getMilPrimeirosMat();
		List<ResultadoEscola> lp = escolaDAOImpl.getMilPrimeirosLp();
		List<Integer> idEscolas = new ArrayList<Integer>();

		for (ResultadoEscola resultadoEscola : lp) {
			idEscolas.add(resultadoEscola.getIdEscola());
		}
		for (ResultadoEscola resultM : mt) {
			idEscolas.add(resultM.getIdEscola());
		}

		QuestEscolaDAOImpl escolaDAO = new  QuestEscolaDAOImpl();
		List<QuestEscola> questEscola = new ArrayList<QuestEscola>();

		for (Integer id : idEscolas) {
			questEscola.add(escolaDAO.findById(id));
		}
		//utiliza dos valores coletados
		return questEscola;	
	}
}
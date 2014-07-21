package org.eduqi.eduqiservice.core.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eduqi.eduqiservice.core.dao.DescricaoQuestionarioEscolaDAO;
import org.eduqi.eduqiservice.core.dao.DescricaoQuestionarioEscolaDAOImpl;
import org.eduqi.eduqiservice.core.dao.QuestEscolaDAOImpl;
import org.eduqi.eduqiservice.core.dao.ResultadoEscolaDAOImpl;
import org.eduqi.eduqiservice.core.entity.DescricaoQuestionarioEscola;
import org.eduqi.eduqiservice.core.entity.QuestEscola;
import org.eduqi.eduqiservice.core.entity.ResultadoEscola;
import org.eduqi.eduqiservice.core.util.EduqiQuestParser;
import org.eduqiservice.domain.QuestStatistics;
import org.eduqiservice.domain.SchoolError;

import com.google.gson.Gson;

public class EduqiSchoolServiceImpl implements EduqiSchoolService{
	
	private static final Logger LOG = Logger.getLogger(EduqiEscolaCEPServiceImpl.class);
	
	public static String giveSchoolStatistics(int id){
		Gson gson = new Gson();
		String result = "";
		DescricaoQuestionarioEscolaDAO questDAO = new DescricaoQuestionarioEscolaDAOImpl();
		QuestEscolaDAOImpl escolaDAO = new  QuestEscolaDAOImpl();
		QuestStatistics qe = new QuestStatistics();


		List<DescricaoQuestionarioEscola> descQuest = questDAO.listAll();	
		QuestEscola questResult = escolaDAO.findById(id);

		if(questResult != null){
			LOG.debug("adding info to build JSON ... ");
			qe.setQuest7(new String[]{descQuest.get(0).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ007())});
			qe.setQuest8(new String[]{descQuest.get(1).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ008())});
			qe.setQuest9(new String[]{descQuest.get(2).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ009())});
			qe.setQuest10(new String[]{descQuest.get(3).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ010())});
			qe.setQuest11(new String[]{descQuest.get(4).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ011())});
			qe.setQuest12(new String[]{descQuest.get(5).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ012())});
			qe.setQuest13(new String[]{descQuest.get(6).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ013())});
			qe.setQuest14(new String[]{descQuest.get(7).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ014())});
			qe.setQuest15(new String[]{descQuest.get(8).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ015())});
			qe.setQuest16(new String[]{descQuest.get(9).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ016())});
			qe.setQuest17(new String[]{descQuest.get(10).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ017())});
			qe.setQuest18(new String[]{descQuest.get(11).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ018())});
			qe.setQuest19(new String[]{descQuest.get(12).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ019())});
			qe.setQuest20(new String[]{descQuest.get(13).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ020())});
			qe.setQuest21(new String[]{descQuest.get(14).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ021())});
			qe.setQuest22(new String[]{descQuest.get(15).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ022())});
			qe.setQuest23(new String[]{descQuest.get(16).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ023())});
			qe.setQuest24(new String[]{descQuest.get(17).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ024())});
			qe.setQuest25(new String[]{descQuest.get(18).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ025())});
			qe.setQuest26(new String[]{descQuest.get(19).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ026())});
			qe.setQuest27(new String[]{descQuest.get(20).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ027())});
			qe.setQuest28(new String[]{descQuest.get(21).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ028())});
			qe.setQuest29(new String[]{descQuest.get(22).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ029())});
			qe.setQuest30(new String[]{descQuest.get(23).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ030())});
			qe.setQuest31(new String[]{descQuest.get(24).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ031())});
			qe.setQuest32(new String[]{descQuest.get(25).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ032())});
			qe.setQuest33(new String[]{descQuest.get(26).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ033())});
			qe.setQuest34(new String[]{descQuest.get(27).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ034())});
			qe.setQuest35(new String[]{descQuest.get(28).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ035())});
			qe.setQuest36(new String[]{descQuest.get(29).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ036())});
			qe.setQuest37(new String[]{descQuest.get(30).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ037())});
			qe.setQuest38(new String[]{descQuest.get(31).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ038())});
			qe.setQuest39(new String[]{descQuest.get(32).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ039())});
			qe.setQuest40(new String[]{descQuest.get(33).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ040())});
			qe.setQuest41(new String[]{descQuest.get(34).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ041())});
			qe.setQuest42(new String[]{descQuest.get(35).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ042())});
			qe.setQuest43(new String[]{descQuest.get(36).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ043())});
			qe.setQuest44(new String[]{descQuest.get(37).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ044())});
			qe.setQuest45(new String[]{descQuest.get(38).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ045())});
			qe.setQuest46(new String[]{descQuest.get(39).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ046())});
			qe.setQuest47(new String[]{descQuest.get(40).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ047())});
			qe.setQuest48(new String[]{descQuest.get(41).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ048())});
			qe.setQuest49(new String[]{descQuest.get(42).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ049())});
			qe.setQuest50(new String[]{descQuest.get(43).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ050())});
			qe.setQuest51(new String[]{descQuest.get(44).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ051())});
			qe.setQuest52(new String[]{descQuest.get(45).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ052())});
			qe.setQuest53(new String[]{descQuest.get(46).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ053())});
			qe.setQuest54(new String[]{descQuest.get(47).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ054())});
			qe.setQuest55(new String[]{descQuest.get(48).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ055())});
			qe.setQuest56(new String[]{descQuest.get(49).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ056())});
			qe.setQuest57(new String[]{descQuest.get(50).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ057())});
			qe.setQuest58(new String[]{descQuest.get(51).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ058())});
			qe.setQuest59(new String[]{descQuest.get(52).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ059())});
			qe.setQuest60(new String[]{descQuest.get(53).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ060())});
			qe.setQuest61(new String[]{descQuest.get(54).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ061())});
			qe.setQuest62(new String[]{descQuest.get(55).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ062())});
			qe.setQuest63(new String[]{descQuest.get(56).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ063())});
			qe.setQuest64(new String[]{descQuest.get(57).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ064())});
			qe.setQuest65(new String[]{descQuest.get(58).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ065())});
			qe.setQuest66(new String[]{descQuest.get(59).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ066())});
			LOG.debug("Info added. ");
			LOG.debug("parsing to JSON");
			result = gson.toJson(qe);
			LOG.debug("parsed.");
		}
		else{
			LOG.info("School record not found for id="+id);
			SchoolError  error = new SchoolError(
					id,"SCHOOL NOT FOUND");
			result = gson.toJson(error);
		}
		return result;
	}
	
	public static List<QuestEscola> buildProb(){
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
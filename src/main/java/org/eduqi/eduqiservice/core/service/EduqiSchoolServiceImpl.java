package org.eduqi.eduqiservice.core.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eduqi.eduqiservice.core.dao.DescricaoQuestionarioEscolaDAO;
import org.eduqi.eduqiservice.core.dao.DescricaoQuestionarioEscolaDAOImpl;
import org.eduqi.eduqiservice.core.dao.QuestEscolaDAOImpl;
import org.eduqi.eduqiservice.core.dao.ResultadoEscolaDAOImpl;
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
		Formanswers answers = null;

		List<DescricaoQuestionarioEscola> descQuest = questDAO.listAll();	
		QuestEscola questResult = escolaDAO.findById(id);

		if(questResult != null){
			answers = new Formanswers();
			LOG.debug("adding info ... ");
			answers.setQuest7(new String[]{descQuest.get(0).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ007())});
			answers.setQuest8(new String[]{descQuest.get(1).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ008())});
			answers.setQuest9(new String[]{descQuest.get(2).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ009())});
			answers.setQuest10(new String[]{descQuest.get(3).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ010())});
			answers.setQuest11(new String[]{descQuest.get(4).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ011())});
			answers.setQuest12(new String[]{descQuest.get(5).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ012())});
			answers.setQuest13(new String[]{descQuest.get(6).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ013())});
			answers.setQuest14(new String[]{descQuest.get(7).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ014())});
			answers.setQuest15(new String[]{descQuest.get(8).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ015())});
			answers.setQuest16(new String[]{descQuest.get(9).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ016())});
			answers.setQuest17(new String[]{descQuest.get(10).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ017())});
			answers.setQuest18(new String[]{descQuest.get(11).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ018())});
			answers.setQuest19(new String[]{descQuest.get(12).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ019())});
			answers.setQuest20(new String[]{descQuest.get(13).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ020())});
			answers.setQuest21(new String[]{descQuest.get(14).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ021())});
			answers.setQuest22(new String[]{descQuest.get(15).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ022())});
			answers.setQuest23(new String[]{descQuest.get(16).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ023())});
			answers.setQuest24(new String[]{descQuest.get(17).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ024())});
			answers.setQuest25(new String[]{descQuest.get(18).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ025())});
			answers.setQuest26(new String[]{descQuest.get(19).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ026())});
			answers.setQuest27(new String[]{descQuest.get(20).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ027())});
			answers.setQuest28(new String[]{descQuest.get(21).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ028())});
			answers.setQuest29(new String[]{descQuest.get(22).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ029())});
			answers.setQuest30(new String[]{descQuest.get(23).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ030())});
			answers.setQuest31(new String[]{descQuest.get(24).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ031())});
			answers.setQuest32(new String[]{descQuest.get(25).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ032())});
			answers.setQuest33(new String[]{descQuest.get(26).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ033())});
			answers.setQuest34(new String[]{descQuest.get(27).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ034())});
			answers.setQuest35(new String[]{descQuest.get(28).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ035())});
			answers.setQuest36(new String[]{descQuest.get(29).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ036())});
			answers.setQuest37(new String[]{descQuest.get(30).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ037())});
			answers.setQuest38(new String[]{descQuest.get(31).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ038())});
			answers.setQuest39(new String[]{descQuest.get(32).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ039())});
			answers.setQuest40(new String[]{descQuest.get(33).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ040())});
			answers.setQuest41(new String[]{descQuest.get(34).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ041())});
			answers.setQuest42(new String[]{descQuest.get(35).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ042())});
			answers.setQuest43(new String[]{descQuest.get(36).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ043())});
			answers.setQuest44(new String[]{descQuest.get(37).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ044())});
			answers.setQuest45(new String[]{descQuest.get(38).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ045())});
			answers.setQuest46(new String[]{descQuest.get(39).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ046())});
			answers.setQuest47(new String[]{descQuest.get(40).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ047())});
			answers.setQuest48(new String[]{descQuest.get(41).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ048())});
			answers.setQuest49(new String[]{descQuest.get(42).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ049())});
			answers.setQuest50(new String[]{descQuest.get(43).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ050())});
			answers.setQuest51(new String[]{descQuest.get(44).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ051())});
			answers.setQuest52(new String[]{descQuest.get(45).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ052())});
			answers.setQuest53(new String[]{descQuest.get(46).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ053())});
			answers.setQuest54(new String[]{descQuest.get(47).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ054())});
			answers.setQuest55(new String[]{descQuest.get(48).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ055())});
			answers.setQuest56(new String[]{descQuest.get(49).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ056())});
			answers.setQuest57(new String[]{descQuest.get(50).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ057())});
			answers.setQuest58(new String[]{descQuest.get(51).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ058())});
			answers.setQuest59(new String[]{descQuest.get(52).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ059())});
			answers.setQuest60(new String[]{descQuest.get(53).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ060())});
			answers.setQuest61(new String[]{descQuest.get(54).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ061())});
			answers.setQuest62(new String[]{descQuest.get(55).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ062())});
			answers.setQuest63(new String[]{descQuest.get(56).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ063())});
			answers.setQuest64(new String[]{descQuest.get(57).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ064())});
			answers.setQuest65(new String[]{descQuest.get(58).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ065())});
			answers.setQuest66(new String[]{descQuest.get(59).getDescricaoPergunta(),EduqiQuestParser.matchString(questResult.getTxRespQ066())});
			LOG.debug("Info added. ");
			return answers;
		}
		else{
			LOG.info("School record not found for id="+id);
		}
		return answers;
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

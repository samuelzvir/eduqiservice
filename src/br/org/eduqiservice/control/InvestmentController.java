package br.org.eduqiservice.control;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import br.org.eduqiservice.dao.DescricaoQuestionarioEscolaDAO;
import br.org.eduqiservice.dao.DescricaoQuestionarioEscolaDAOImpl;
import br.org.eduqiservice.dao.QuestEscolaDAOImpl;
import br.org.eduqiservice.dao.ResultadoEscolaDAOImpl;
import br.org.eduqiservice.domain.QuestStatistics;
import br.org.eduqiservice.model.DescricaoQuestionarioEscola;
import br.org.eduqiservice.model.QuestEscola;
import br.org.eduqiservice.model.ResultadoEscola;
import br.org.eduqiservice.util.QuestParser;

public class InvestmentController {

	public static String giveSchoolStatistics(int id){
		
		DescricaoQuestionarioEscolaDAO questDAO = new DescricaoQuestionarioEscolaDAOImpl();
		List<DescricaoQuestionarioEscola> descQuest = questDAO.listAll();
		
		QuestEscolaDAOImpl escolaDAO = new  QuestEscolaDAOImpl();
		QuestEscola result = escolaDAO.findById(id);
		
			
			QuestStatistics qe = new QuestStatistics();
			qe.setQuest7(new String[]{descQuest.get(0).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ007())});
			qe.setQuest8(new String[]{descQuest.get(1).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ008())});
			qe.setQuest9(new String[]{descQuest.get(2).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ009())});
			qe.setQuest10(new String[]{descQuest.get(3).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ010())});
			qe.setQuest11(new String[]{descQuest.get(4).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ011())});
			qe.setQuest12(new String[]{descQuest.get(5).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ012())});
			qe.setQuest13(new String[]{descQuest.get(6).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ013())});
			qe.setQuest14(new String[]{descQuest.get(7).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ014())});
			qe.setQuest15(new String[]{descQuest.get(8).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ015())});
			qe.setQuest16(new String[]{descQuest.get(9).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ016())});
			qe.setQuest17(new String[]{descQuest.get(10).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ017())});
			qe.setQuest18(new String[]{descQuest.get(11).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ018())});
			qe.setQuest19(new String[]{descQuest.get(12).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ019())});
			qe.setQuest20(new String[]{descQuest.get(13).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ020())});
			qe.setQuest21(new String[]{descQuest.get(14).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ021())});
			qe.setQuest22(new String[]{descQuest.get(15).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ022())});
			qe.setQuest23(new String[]{descQuest.get(16).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ023())});
			qe.setQuest24(new String[]{descQuest.get(17).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ024())});
			qe.setQuest25(new String[]{descQuest.get(18).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ025())});
			qe.setQuest26(new String[]{descQuest.get(19).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ026())});
			qe.setQuest27(new String[]{descQuest.get(20).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ027())});
			qe.setQuest28(new String[]{descQuest.get(21).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ028())});
			qe.setQuest29(new String[]{descQuest.get(22).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ029())});
			qe.setQuest30(new String[]{descQuest.get(23).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ030())});
			qe.setQuest31(new String[]{descQuest.get(24).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ031())});
			qe.setQuest32(new String[]{descQuest.get(25).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ032())});
			qe.setQuest33(new String[]{descQuest.get(26).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ033())});
			qe.setQuest34(new String[]{descQuest.get(27).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ034())});
			qe.setQuest35(new String[]{descQuest.get(28).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ035())});
			qe.setQuest36(new String[]{descQuest.get(29).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ036())});
			qe.setQuest37(new String[]{descQuest.get(30).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ037())});
			qe.setQuest38(new String[]{descQuest.get(31).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ038())});
			qe.setQuest39(new String[]{descQuest.get(32).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ039())});
			qe.setQuest40(new String[]{descQuest.get(33).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ040())});
			qe.setQuest41(new String[]{descQuest.get(34).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ041())});
			qe.setQuest42(new String[]{descQuest.get(35).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ042())});
			qe.setQuest43(new String[]{descQuest.get(36).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ043())});
			qe.setQuest44(new String[]{descQuest.get(37).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ044())});
			qe.setQuest45(new String[]{descQuest.get(38).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ045())});
			qe.setQuest46(new String[]{descQuest.get(39).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ046())});
			qe.setQuest47(new String[]{descQuest.get(40).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ047())});
			qe.setQuest48(new String[]{descQuest.get(41).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ048())});
			qe.setQuest49(new String[]{descQuest.get(42).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ049())});
			qe.setQuest50(new String[]{descQuest.get(43).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ050())});
			qe.setQuest51(new String[]{descQuest.get(44).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ051())});
			qe.setQuest52(new String[]{descQuest.get(45).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ052())});
			qe.setQuest53(new String[]{descQuest.get(46).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ053())});
			qe.setQuest54(new String[]{descQuest.get(47).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ054())});
			qe.setQuest55(new String[]{descQuest.get(48).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ055())});
			qe.setQuest56(new String[]{descQuest.get(49).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ056())});
			qe.setQuest57(new String[]{descQuest.get(50).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ057())});
			qe.setQuest58(new String[]{descQuest.get(51).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ058())});
			qe.setQuest59(new String[]{descQuest.get(52).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ059())});
			qe.setQuest60(new String[]{descQuest.get(53).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ060())});
			qe.setQuest61(new String[]{descQuest.get(54).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ061())});
			qe.setQuest62(new String[]{descQuest.get(55).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ062())});
			qe.setQuest63(new String[]{descQuest.get(56).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ063())});
			qe.setQuest64(new String[]{descQuest.get(57).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ064())});
			qe.setQuest65(new String[]{descQuest.get(58).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ065())});
			qe.setQuest66(new String[]{descQuest.get(59).getDescricaoPergunta(),QuestParser.matchString(result.getTxRespQ066())});
			
			
		
		Gson gson = new Gson();
		return gson.toJson(qe);
		
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

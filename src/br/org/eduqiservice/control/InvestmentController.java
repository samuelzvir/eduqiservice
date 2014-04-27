package br.org.eduqiservice.control;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.gson.Gson;

import br.org.eduqiservice.dao.DescricaoQuestionarioEscolaDAO;
import br.org.eduqiservice.dao.DescricaoQuestionarioEscolaDAOImpl;
import br.org.eduqiservice.dao.QuestEscolaDAOImpl;
import br.org.eduqiservice.dao.ResultadoEscolaDAOImpl;
import br.org.eduqiservice.domain.QuestStatistics;
import br.org.eduqiservice.domain.SchoolError;
import br.org.eduqiservice.model.DescricaoQuestionarioEscola;
import br.org.eduqiservice.model.QuestEscola;
import br.org.eduqiservice.model.ResultadoEscola;
import br.org.eduqiservice.util.QuestParser;

public class InvestmentController {

	private static final Logger LOG = Logger.getLogger(InvestmentController.class.getName());

	public static String giveSchoolStatistics(int id){
		Gson gson = new Gson();
		String result = "";
		DescricaoQuestionarioEscolaDAO questDAO = new DescricaoQuestionarioEscolaDAOImpl();
		QuestEscolaDAOImpl escolaDAO = new  QuestEscolaDAOImpl();
		QuestStatistics qe = new QuestStatistics();


		List<DescricaoQuestionarioEscola> descQuest = questDAO.listAll();	
		QuestEscola questResult = escolaDAO.findById(id);

		if(questResult != null){
			LOG.log(Level.FINE, "adding info to build JSON ... ");
			qe.setQuest7(new String[]{descQuest.get(0).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ007())});
			qe.setQuest8(new String[]{descQuest.get(1).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ008())});
			qe.setQuest9(new String[]{descQuest.get(2).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ009())});
			qe.setQuest10(new String[]{descQuest.get(3).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ010())});
			qe.setQuest11(new String[]{descQuest.get(4).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ011())});
			qe.setQuest12(new String[]{descQuest.get(5).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ012())});
			qe.setQuest13(new String[]{descQuest.get(6).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ013())});
			qe.setQuest14(new String[]{descQuest.get(7).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ014())});
			qe.setQuest15(new String[]{descQuest.get(8).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ015())});
			qe.setQuest16(new String[]{descQuest.get(9).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ016())});
			qe.setQuest17(new String[]{descQuest.get(10).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ017())});
			qe.setQuest18(new String[]{descQuest.get(11).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ018())});
			qe.setQuest19(new String[]{descQuest.get(12).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ019())});
			qe.setQuest20(new String[]{descQuest.get(13).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ020())});
			qe.setQuest21(new String[]{descQuest.get(14).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ021())});
			qe.setQuest22(new String[]{descQuest.get(15).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ022())});
			qe.setQuest23(new String[]{descQuest.get(16).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ023())});
			qe.setQuest24(new String[]{descQuest.get(17).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ024())});
			qe.setQuest25(new String[]{descQuest.get(18).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ025())});
			qe.setQuest26(new String[]{descQuest.get(19).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ026())});
			qe.setQuest27(new String[]{descQuest.get(20).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ027())});
			qe.setQuest28(new String[]{descQuest.get(21).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ028())});
			qe.setQuest29(new String[]{descQuest.get(22).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ029())});
			qe.setQuest30(new String[]{descQuest.get(23).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ030())});
			qe.setQuest31(new String[]{descQuest.get(24).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ031())});
			qe.setQuest32(new String[]{descQuest.get(25).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ032())});
			qe.setQuest33(new String[]{descQuest.get(26).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ033())});
			qe.setQuest34(new String[]{descQuest.get(27).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ034())});
			qe.setQuest35(new String[]{descQuest.get(28).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ035())});
			qe.setQuest36(new String[]{descQuest.get(29).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ036())});
			qe.setQuest37(new String[]{descQuest.get(30).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ037())});
			qe.setQuest38(new String[]{descQuest.get(31).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ038())});
			qe.setQuest39(new String[]{descQuest.get(32).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ039())});
			qe.setQuest40(new String[]{descQuest.get(33).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ040())});
			qe.setQuest41(new String[]{descQuest.get(34).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ041())});
			qe.setQuest42(new String[]{descQuest.get(35).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ042())});
			qe.setQuest43(new String[]{descQuest.get(36).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ043())});
			qe.setQuest44(new String[]{descQuest.get(37).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ044())});
			qe.setQuest45(new String[]{descQuest.get(38).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ045())});
			qe.setQuest46(new String[]{descQuest.get(39).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ046())});
			qe.setQuest47(new String[]{descQuest.get(40).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ047())});
			qe.setQuest48(new String[]{descQuest.get(41).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ048())});
			qe.setQuest49(new String[]{descQuest.get(42).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ049())});
			qe.setQuest50(new String[]{descQuest.get(43).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ050())});
			qe.setQuest51(new String[]{descQuest.get(44).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ051())});
			qe.setQuest52(new String[]{descQuest.get(45).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ052())});
			qe.setQuest53(new String[]{descQuest.get(46).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ053())});
			qe.setQuest54(new String[]{descQuest.get(47).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ054())});
			qe.setQuest55(new String[]{descQuest.get(48).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ055())});
			qe.setQuest56(new String[]{descQuest.get(49).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ056())});
			qe.setQuest57(new String[]{descQuest.get(50).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ057())});
			qe.setQuest58(new String[]{descQuest.get(51).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ058())});
			qe.setQuest59(new String[]{descQuest.get(52).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ059())});
			qe.setQuest60(new String[]{descQuest.get(53).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ060())});
			qe.setQuest61(new String[]{descQuest.get(54).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ061())});
			qe.setQuest62(new String[]{descQuest.get(55).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ062())});
			qe.setQuest63(new String[]{descQuest.get(56).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ063())});
			qe.setQuest64(new String[]{descQuest.get(57).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ064())});
			qe.setQuest65(new String[]{descQuest.get(58).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ065())});
			qe.setQuest66(new String[]{descQuest.get(59).getDescricaoPergunta(),QuestParser.matchString(questResult.getTxRespQ066())});
			LOG.log(Level.FINE, "Info added. ");
			LOG.log(Level.FINE,"parsing to JSON");
			result = gson.toJson(qe);
			LOG.log(Level.FINE,"parsed.");
		}
		else{
			LOG.log(Level.INFO, "School record not found.");
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

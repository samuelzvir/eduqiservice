package br.org.eduqiservice.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.org.eduqiservice.control.InvestmentController;
import br.org.eduqiservice.dao.DescricaoQuestionarioEscolaDAOImpl;
import br.org.eduqiservice.model.DescricaoQuestionarioEscola;
import br.org.eduqiservice.model.QuestEscola;

public class AnswerStats {

	int bom;
	int regular;
	int ruim;
	int inexistente;
	
	
	private static List<ProbAnswers> probAnswers = new ArrayList<ProbAnswers>();
	
	private static Map<Integer,DescricaoQuestionarioEscola> descricaoQuestionarioEscola;
	
	public static List<ProbAnswers> getProbAnswers() {
		return probAnswers;
	}

	public static void setProbAnswers(List<ProbAnswers> probAnswers) {
		AnswerStats.probAnswers = probAnswers;
	}

	public void buildProAnswers(){
	
		
		List<QuestEscola> data = InvestmentController.buildProb();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ007();
			addNum(r);	
		}
		getProbAnswers(data.size(), 7);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ008();
			addNum(r);	
		}
		getProbAnswers(data.size(), 8);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ009();
			addNum(r);	
		}
		getProbAnswers(data.size(), 9);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ010();
			addNum(r);	
		}
		getProbAnswers(data.size(), 10);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ011();
			addNum(r);	
		}
		getProbAnswers(data.size(), 11);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ012();
			addNum(r);	
		}
		getProbAnswers(data.size(), 12);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ013();
			addNum(r);	
		}
		getProbAnswers(data.size(), 13);
		cleanNumbers();
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ014();
			addNum(r);	
		}
		getProbAnswers(data.size(), 14);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ015();
			addNum(r);	
		}
		getProbAnswers(data.size(), 15);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ016();
			addNum(r);	
		}
		getProbAnswers(data.size(), 16);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ017();
			addNum(r);	
		}
		getProbAnswers(data.size(), 17);
		cleanNumbers();
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ018();
			addNum(r);	
		}
		getProbAnswers(data.size(), 18);
		cleanNumbers();
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ019();
			addNum(r);	
		}
		getProbAnswers(data.size(), 19);
		cleanNumbers();
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ020();
			addNum(r);	
		}
		getProbAnswers(data.size(), 20);
		cleanNumbers();
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ021();
			addNum(r);	
		}
		getProbAnswers(data.size(), 21);
		cleanNumbers();
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ022();
			addNum(r);	
		}
		getProbAnswers(data.size(), 22);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ023();
			addNum(r);	
		}
		getProbAnswers(data.size(), 23);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ024();
			addNum(r);	
		}
		getProbAnswers(data.size(), 24);
		cleanNumbers();
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ025();
			addNum(r);	
		}
		getProbAnswers(data.size(), 25);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ026();
			addNum(r);	
		}
		getProbAnswers(data.size(), 26);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ027();
			addNum(r);	
		}
		getProbAnswers(data.size(), 27);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ028();
			addNum(r);	
		}
		getProbAnswers(data.size(), 28);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ029();
			addNum(r);	
		}
		getProbAnswers(data.size(), 29);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ030();
			addNum(r);	
		}
		getProbAnswers(data.size(), 30);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ031();
			addNum(r);	
		}
		getProbAnswers(data.size(), 31);
		cleanNumbers();
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ032();
			addNum(r);	
		}
		getProbAnswers(data.size(), 32);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ033();
			addNum(r);	
		}
		getProbAnswers(data.size(), 33);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ034();
			addNum(r);	
		}
		getProbAnswers(data.size(), 34);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ035();
			addNum(r);	
		}
		getProbAnswers(data.size(), 35);
		cleanNumbers();
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ036();
			addNum(r);	
		}
		getProbAnswers(data.size(), 36);
		cleanNumbers();
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ037();
			addNum(r);	
		}
		getProbAnswers(data.size(), 37);
		cleanNumbers();
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ038();
			addNum(r);	
		}
		getProbAnswers(data.size(), 38);
		cleanNumbers();
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ039();
			addNum(r);	
		}
		getProbAnswers(data.size(), 39);
		cleanNumbers();
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ040();
			addNum(r);	
		}
		getProbAnswers(data.size(), 40);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ041();
			addNum(r);	
		}
		getProbAnswers(data.size(), 41);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ042();
			addNum(r);	
		}
		getProbAnswers(data.size(), 42);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ043();
			addNum(r);	
		}
		getProbAnswers(data.size(), 43);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ044();
			addNum(r);	
		}
		getProbAnswers(data.size(), 44);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ045();
			addNum(r);	
		}
		getProbAnswers(data.size(), 45);
		cleanNumbers();
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ046();
			addNum(r);	
		}
		getProbAnswers(data.size(), 46);
		cleanNumbers();
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ047();
			addNum(r);	
		}
		getProbAnswers(data.size(), 47);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ048();
			addNum(r);	
		}
		getProbAnswers(data.size(), 48);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ049();
			addNum(r);	
		}
		getProbAnswers(data.size(), 49);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ050();
			addNum(r);	
		}
		getProbAnswers(data.size(), 50);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ051();
			addNum(r);	
		}
		getProbAnswers(data.size(), 51);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ052();
			addNum(r);	
		}
		getProbAnswers(data.size(), 52);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ053();
			addNum(r);	
		}
		getProbAnswers(data.size(), 53);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ054();
			addNum(r);	
		}
		getProbAnswers(data.size(), 54);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ055();
			addNum(r);	
		}
		getProbAnswers(data.size(), 55);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ056();
			addNum(r);	
		}
		getProbAnswers(data.size(), 56);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ057();
			addNum(r);	
		}
		getProbAnswers(data.size(), 57);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ058();
			addNum(r);	
		}
		getProbAnswers(data.size(), 58);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ059();
			addNum(r);	
		}
		getProbAnswers(data.size(), 59);
		cleanNumbers();
		
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ060();
			addNum(r);	
		}
		getProbAnswers(data.size(), 60);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ061();
			addNum(r);	
		}
		getProbAnswers(data.size(), 61);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ062();
			addNum(r);	
		}
		getProbAnswers(data.size(), 62);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ063();
			addNum(r);	
		}
		getProbAnswers(data.size(), 63);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ064();
			addNum(r);	
		}
		getProbAnswers(data.size(), 64);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ065();
			addNum(r);	
		}
		getProbAnswers(data.size(), 65);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			String r = questEscola.getTxRespQ066();
			addNum(r);	
		}
		getProbAnswers(data.size(), 66);
		cleanNumbers();
	}
	
	private void addNum(String r){
		if(r.equalsIgnoreCase("a")){
			bom++;
		}
		else if(r.equalsIgnoreCase("b")){
			regular++;
		}
		else if(r.equalsIgnoreCase("c")){
			ruim++;
		}
		else{
			inexistente++;
		}
	}
	
	private void cleanNumbers(){
		bom=0;
		regular=0;
		ruim=0;
		inexistente=0;
	}
	
	private double calcProp(int size, int occu){
		double result = (occu * 100)/size;
		return result;
	}
	
	private void getProbAnswers(int size, int idQuest){
		ProbAnswers prob = new ProbAnswers();
		prob.setBom(calcProp(size, bom));
		prob.setBom(calcProp(size, regular));
		prob.setBom(calcProp(size, ruim));
		prob.setBom(calcProp(size, inexistente));
		
		if(descricaoQuestionarioEscola == null){
			descricaoQuestionarioEscola = new HashMap<>();
			
			DescricaoQuestionarioEscolaDAOImpl dao = new DescricaoQuestionarioEscolaDAOImpl();
			
			List<DescricaoQuestionarioEscola> temp= dao.listAll();
			for (DescricaoQuestionarioEscola descricaoQuestionarioEscola : temp) {
				this.descricaoQuestionarioEscola.put(descricaoQuestionarioEscola.getIdResposta(), descricaoQuestionarioEscola);
			}
		}
		DescricaoQuestionarioEscola quest = descricaoQuestionarioEscola.get(idQuest);		
		prob.setQuestion(quest.getDescricaoPergunta());
		probAnswers.add(prob);
		
	}
	
}

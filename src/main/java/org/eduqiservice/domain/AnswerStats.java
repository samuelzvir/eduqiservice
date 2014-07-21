package org.eduqiservice.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

import org.eduqi.eduqiservice.core.dao.DescricaoQuestionarioEscolaDAOImpl;
import org.eduqi.eduqiservice.core.domain.AnswerResult;
import org.eduqi.eduqiservice.core.entity.DescricaoQuestionarioEscola;
import org.eduqi.eduqiservice.core.entity.QuestEscola;
import org.eduqi.eduqiservice.core.service.EduqiSchoolServiceImpl;

@XmlRootElement
public class AnswerStats {

	int bom;
	int regular;
	int ruim;
	int inexistente;
	
	private static List<AnswerResult> statAnswers = new ArrayList<AnswerResult>();
	
	private static Map<Integer,DescricaoQuestionarioEscola> descricaoQuestionarioEscola;
	
	public static List<AnswerResult> getAverageAnswers() {
		return statAnswers;
	}

	public static void setProbAnswers(List<AnswerResult> probAnswers) {
		AnswerStats.statAnswers = probAnswers;
	}

	public void buildAnswersStat(){
		List<QuestEscola> data = EduqiSchoolServiceImpl.buildProb();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ007();
			addNum(r);	
		}
		getProbAnswers(data.size(), 7);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ008();
			addNum(r);	
		}
		getProbAnswers(data.size(), 8);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ009();
			addNum(r);	
		}
		getProbAnswers(data.size(), 9);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ010();
			addNum(r);	
		}
		getProbAnswers(data.size(), 10);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ011();
			addNum(r);	
		}
		getProbAnswers(data.size(), 11);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ012();
			addNum(r);	
		}
		getProbAnswers(data.size(), 12);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ013();
			addNum(r);	
		}
		getProbAnswers(data.size(), 13);
		cleanNumbers();
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ014();
			addNum(r);	
		}
		getProbAnswers(data.size(), 14);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ015();
			addNum(r);	
		}
		getProbAnswers(data.size(), 15);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ016();
			addNum(r);	
		}
		getProbAnswers(data.size(), 16);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ017();
			addNum(r);	
		}
		getProbAnswers(data.size(), 17);
		cleanNumbers();
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ018();
			addNum(r);	
		}
		getProbAnswers(data.size(), 18);
		cleanNumbers();
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ019();
			addNum(r);	
		}
		getProbAnswers(data.size(), 19);
		cleanNumbers();
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ020();
			addNum(r);	
		}
		getProbAnswers(data.size(), 20);
		cleanNumbers();
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ021();
			addNum(r);	
		}
		getProbAnswers(data.size(), 21);
		cleanNumbers();
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ022();
			addNum(r);	
		}
		getProbAnswers(data.size(), 22);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ023();
			addNum(r);	
		}
		getProbAnswers(data.size(), 23);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ024();
			addNum(r);	
		}
		getProbAnswers(data.size(), 24);
		cleanNumbers();
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ025();
			addNum(r);	
		}
		getProbAnswers(data.size(), 25);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ026();
			addNum(r);	
		}
		getProbAnswers(data.size(), 26);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ027();
			addNum(r);	
		}
		getProbAnswers(data.size(), 27);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ028();
			addNum(r);	
		}
		getProbAnswers(data.size(), 28);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ029();
			addNum(r);	
		}
		getProbAnswers(data.size(), 29);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ030();
			addNum(r);	
		}
		getProbAnswers(data.size(), 30);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ031();
			addNum(r);	
		}
		getProbAnswers(data.size(), 31);
		cleanNumbers();
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ032();
			addNum(r);	
		}
		getProbAnswers(data.size(), 32);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ033();
			addNum(r);	
		}
		getProbAnswers(data.size(), 33);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ034();
			addNum(r);	
		}
		getProbAnswers(data.size(), 34);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ035();
			addNum(r);	
		}
		getProbAnswers(data.size(), 35);
		cleanNumbers();
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ036();
			addNum(r);	
		}
		getProbAnswers(data.size(), 36);
		cleanNumbers();
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ037();
			addNum(r);	
		}
		getProbAnswers(data.size(), 37);
		cleanNumbers();
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ038();
			addNum(r);	
		}
		getProbAnswers(data.size(), 38);
		cleanNumbers();
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ039();
			addNum(r);	
		}
		getProbAnswers(data.size(), 39);
		cleanNumbers();
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ040();
			addNum(r);	
		}
		getProbAnswers(data.size(), 40);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ041();
			addNum(r);	
		}
		getProbAnswers(data.size(), 41);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ042();
			addNum(r);	
		}
		getProbAnswers(data.size(), 42);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ043();
			addNum(r);	
		}
		getProbAnswers(data.size(), 43);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ044();
			addNum(r);	
		}
		getProbAnswers(data.size(), 44);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ045();
			addNum(r);	
		}
		getProbAnswers(data.size(), 45);
		cleanNumbers();
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ046();
			addNum(r);	
		}
		getProbAnswers(data.size(), 46);
		cleanNumbers();
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ047();
			addNum(r);	
		}
		getProbAnswers(data.size(), 47);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ048();
			addNum(r);	
		}
		getProbAnswers(data.size(), 48);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ049();
			addNum(r);	
		}
		getProbAnswers(data.size(), 49);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ050();
			addNum(r);	
		}
		getProbAnswers(data.size(), 50);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ051();
			addNum(r);	
		}
		getProbAnswers(data.size(), 51);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ052();
			addNum(r);	
		}
		getProbAnswers(data.size(), 52);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ053();
			addNum(r);	
		}
		getProbAnswers(data.size(), 53);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ054();
			addNum(r);	
		}
		getProbAnswers(data.size(), 54);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ055();
			addNum(r);	
		}
		getProbAnswers(data.size(), 55);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ056();
			addNum(r);	
		}
		getProbAnswers(data.size(), 56);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ057();
			addNum(r);	
		}
		getProbAnswers(data.size(), 57);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ058();
			addNum(r);	
		}
		getProbAnswers(data.size(), 58);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ059();
			addNum(r);	
		}
		getProbAnswers(data.size(), 59);
		cleanNumbers();
		
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ060();
			addNum(r);	
		}
		getProbAnswers(data.size(), 60);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ061();
			addNum(r);	
		}
		getProbAnswers(data.size(), 61);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ062();
			addNum(r);	
		}
		getProbAnswers(data.size(), 62);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ063();
			addNum(r);	
		}
		getProbAnswers(data.size(), 63);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ064();
			addNum(r);	
		}
		getProbAnswers(data.size(), 64);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ065();
			addNum(r);	
		}
		getProbAnswers(data.size(), 65);
		cleanNumbers();
		
		for (QuestEscola questEscola : data) {
			char r = questEscola.getTxRespQ066();
			addNum(r);	
		}
		getProbAnswers(data.size(), 66);
		cleanNumbers();
	}
	
	private void addNum(char r){
		if(r == 'a' || r == 'A' ){
			bom++;
		}
		else if(r == 'b' || r == 'B'){
			regular++;
		}
		else if(r == 'c' || r == 'C'){
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
		double a = occu;
		double b = size;
		
		double result =  (a * 100.00)/b;
		return result;
	}
	
	private void getProbAnswers(int size, int idQuest){
		AnswerResult stat = new AnswerResult();
		stat.setBom(calcProp(size, bom));
		stat.setRegular(calcProp(size, regular));
		stat.setRuim(calcProp(size, ruim));
		stat.setInexistente(calcProp(size, inexistente));
		
		if(descricaoQuestionarioEscola == null){
			descricaoQuestionarioEscola = new HashMap<Integer,DescricaoQuestionarioEscola>();
			
			DescricaoQuestionarioEscolaDAOImpl dao = new DescricaoQuestionarioEscolaDAOImpl();
			
			List<DescricaoQuestionarioEscola> temp= dao.listAll();
			for (DescricaoQuestionarioEscola descricaoQuestionarioEscola : temp) {
				AnswerStats.descricaoQuestionarioEscola.put(descricaoQuestionarioEscola.getIdResposta(), descricaoQuestionarioEscola);
			}
		}
		DescricaoQuestionarioEscola quest = descricaoQuestionarioEscola.get(idQuest);		
		stat.setQuestion(quest.getDescricaoPergunta());
		statAnswers.add(stat);
	}
}

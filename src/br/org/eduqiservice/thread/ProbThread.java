package br.org.eduqiservice.thread;

import br.org.eduqiservice.domain.AnswerStats;

public class ProbThread implements Runnable{

	@Override
	public void run() {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		AnswerStats stat = new AnswerStats();
		stat.buildProAnswers();
		
	}

}

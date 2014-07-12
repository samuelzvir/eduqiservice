package org.eduqiservice.thread;

import org.apache.log4j.Logger;
import org.eduqiservice.domain.AnswerStats;

public class ProbThread implements Runnable{

	private static Logger log = Logger.getLogger(ProbThread.class);
	
	@Override
	public void run() {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			log.error(e,e);
		}
		
		AnswerStats stat = new AnswerStats();
		stat.buildProAnswers();
	}

}

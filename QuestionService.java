package src;

import java.util.Scanner;

public class QuestionService {
	Question[] questions = new Question[5];
	String selection[] = new String[5];
	
	public QuestionService() {
		questions[0] = new Question(1, "Java invented in which year", "1995", "1994", "1993", "1992", "1995");
		questions[1] = new Question(2, "term 'WORA' stands for", "Write Once, Run Anytime", "Write Once, Run Anywhere", "Write Once, Read Anytime", "Write Often, Run Anytime", "Write Once, Run Anywhere");
		questions[2] = new Question(3, "keyword used to implement interface", "extends", "implements", "inherit", "structures", "implements");
		questions[3] = new Question(4, "used to find the length of a string", "length()", "getlength()", "len()", "size()", "length()");
		questions[4] = new Question(5, "size of int", "4", "2", "6", "8", "4");
	}

	public void playQuiz() {
		
		int i=0;
		for(Question q : questions) {
			System.out.println("Question no. : " + q.getId());
			System.out.println(q.getQuestion());
			System.out.println(q.getOpt1());
			System.out.println(q.getOpt2());
			System.out.println(q.getOpt3());
			System.out.println(q.getOpt4());
			Scanner sc = new Scanner(System.in);
			selection[i] = sc.nextLine();
			i++;
		}
			
		System.out.println("*****Your selections are :   *****");
		
		for(String s : selection) {
			System.out.println(s);
		}
	}
	
	public void calcScore() {
		int score = 0;
		for(int i=0; i<questions.length; i++) {
			Question que = questions[i];
			String actualAns = que.getAnswer();
			String userAns = selection[i];
			
			if(actualAns.equals(userAns)) {
				score++;
			}
		}
		System.out.println("Your score : " + score);
	}
}

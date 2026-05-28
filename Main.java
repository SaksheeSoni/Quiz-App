package src;

public class Main {
	public static void main(String[] args) {
		System.out.println("Om, Shri Ganeshay Namah");
		QuestionService service = new QuestionService();
		service.playQuiz();
		service.calcScore();
	}
}

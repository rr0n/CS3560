package cs4800.assignment1;
import java.util.ArrayList;

public class MultQuestion extends Question{
	
	private ArrayList<Integer> answers = new ArrayList<Integer>();
	
	public MultQuestion(String s) {
		setPrompt(s);
	}
	
	public void setAnswer(int n) {
		answers.add(n);
	}
	
	public void printAnswer() {
		System.out.println("Answers: ");
		for(int i = 0; i < answers.size(); i++) {
			int index  = answers.get(i);
			System.out.print("(" + (char)('a' + i) + ")" + getChoices()[index] + " ");
		}
	}
	
}

package cs4800.assignment1;

public class SingleQuestion extends Question{

	private int answer; // position 0 = a, 1 = b, etc.
//	private String prompt;
//	private String[] ansList = new String[4];
	
	public SingleQuestion(String s) {
		setPrompt(s);
	}
	
	public void setAnswer(int n) {
		answer = n;
	}
	
	public void printAnswer() {
		System.out.println("Answer:  (" + (char)('a'+answer) + ") " + getChoices()[answer]);
	}
}

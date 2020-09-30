package cs4800.assignment1;

abstract public class Question {

	private String prompt;
	private String[] ansList = new String[4];
//	
	public Question() {
		prompt = "";
	}
	
	public Question(String s) {
		prompt = s;
	}
	
	public void setPrompt(String s) {
		prompt = s;
	}
	
	public String getPrompt() {
		return prompt;
	}
	
	public void setChoices(String a1, String a2, String a3, String a4) {
		ansList[0] = a1;
		ansList[1] = a2;
		ansList[2] = a3;
		ansList[3] = a4;
	}
	
	public String[] getChoices() {
		return ansList;
	}
	
	abstract public void printAnswer();
	
	abstract public void setAnswer(int n);
}

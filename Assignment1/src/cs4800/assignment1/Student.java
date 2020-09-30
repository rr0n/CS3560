package cs4800.assignment1;

import java.util.Random;
/**
 * Student class that has an ID and vote action
 * @author A
 *
 */
public class Student {

	private String iD;
	
	public Student() {
		iD = "";
	}
	
	public Student(String n) {
		iD = n;
	}
	
	public int vote() {
		Random rand = new Random();
		return rand.nextInt(4);
	}
	
	public void setID(String n) {
		iD = n;
	}
	
	public String getID() {
		return iD;
	}
	
	
}

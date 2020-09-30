package cs4800.assignment1;

import java.util.ArrayList;
import java.util.Random;

public class MultVoteGenerator extends VoteGenerator{

	private ArrayList<Student> studentList;
	private ArrayList<Integer> answers = new ArrayList<Integer>();
	
	public MultVoteGenerator(ArrayList<Student> stud) {
		studentList = stud;
		voteGen();
	}
	
	
	public void voteGen() {
		Student tempStudent;
		int randAns;
		String val = "";
		ArrayList<Integer> tempVal;
		for(int i = 0; i < studentList.size(); i++) {

			Random rand = new Random();
			randAns = rand.nextInt(4);//number of answers each student plots 1-4 # of answers per student
			tempVal = new ArrayList<Integer>();
			tempStudent = studentList.get(i);
			//createList(tempStudent);
			for(int j= 0; j < randAns; j++) {
				tempVal.add(tempStudent.vote());
				val += tempVal.get(i).toString();
			}
			val += tempVal.get(i).toString();
			answers.add(Integer.parseInt(val));
			tempStudent = new Student();
		}
		//genRandomVotes();
		System.out.println("HELLO");
	}
//	
	public void genRandomVotes() {}
//		Student tempStudent;
//		int randAns;
//		Random rand = new Random();
//		int randNum = rand.nextInt(10);
//		for(int i = 0; i < randNum; i++) {
//			ArrayList<Integer> tempVal;
//			tempVal = new ArrayList<Integer>();
//			int randStudent = rand.nextInt(studentList.size());
//			createList(studentList.get(randStudent));
//			tempStudent = studentList.get(i);
//			randAns = rand.nextInt(4)+1;
//			for(int j = 0; j < randAns; j++) {
//				tempVal.add(tempStudent.vote());
//			}
//			answers.add(tempVal);
//		}
//	}
	
	public ArrayList<Integer> results(){
		return answers;
	}
}

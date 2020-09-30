package cs4800.assignment1;

import java.util.ArrayList;
import java.util.Random;

public class SingleVoteGenerator extends VoteGenerator{

//	private ArrayList<Integer> voteList = new ArrayList<Integer>();
//	private ArrayList<Student> voters = new ArrayList<Student>();
//	private ArrayList<Student> studentList;
	private ArrayList<Student> studentList;
	
	public SingleVoteGenerator(ArrayList<Student> stuList) {
		studentList = stuList;
		voteGen();
	}
	
	//generate lists to store votelist and voterID
	public void voteGen() {
		Student tempStudent;
		for(int i = 0; i < studentList.size(); i++) {
			tempStudent = new Student();
			tempStudent = studentList.get(i);
//			voters.add(tempStudent);
//			voteList.add(tempStudent.vote());
			createList(tempStudent);
		}
		genRandomVotes();
	}
	
//	public void createList(Student student) {
//		voters.add(student);
//		voteList.add(student.vote());
//	}
	
	//generates 0 to 10 random votes from existing students and adds 
	//them both to the votelist and voterID
	public void genRandomVotes() {
		Random rand = new Random();
		int randNum = rand.nextInt(10);
		int randStudent;
		for(int i = 0; i < randNum; i++) {
			randStudent = rand.nextInt(studentList.size());
			createList(studentList.get(randStudent));

//			voters.add(studentList.get(randStudent));
//			voteList.add(studentList.get(randStudent).vote());
		}
	}
	
//	public ArrayList<Integer> getVotes(){
//		return voteList;
//	}
//	
//	public ArrayList<Student> getVoterID(){
//		return voters;
//	}
}
	
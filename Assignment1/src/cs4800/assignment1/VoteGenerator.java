package cs4800.assignment1;

import java.util.ArrayList;

public abstract class VoteGenerator {
	private ArrayList<Integer> voteList = new ArrayList<Integer>();
	private ArrayList<Student> voters = new ArrayList<Student>();
	
	public void createList(Student student) {
		voters.add(student);
		voteList.add(student.vote());
	}
	
	public ArrayList<Integer> getVotes(){
		return voteList;
	}
	
	public ArrayList<Student> getVoterID(){
		return voters;
	}
	
	abstract public void voteGen();
	abstract public void genRandomVotes();
}

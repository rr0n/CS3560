package cs4800.assignment1;

import java.util.ArrayList;

abstract public class VotingService {

//	private ArrayList<Student> voterID;

	private ArrayList<Student> currentStudents = new ArrayList<Student>(); //what i want to keep track of

	
	abstract public void tally();
	
	abstract void addSubmission(int index);
	
	abstract void removeSubmission(int index);
	
	public void removeAllPrevEntries(ArrayList<Student> voterID) {
		int dupeIndex;
		for(int i = 0; i < voterID.size(); i++) {
			if(valid(voterID.get(i))) {// if it is not empyt or has no duplicates
				addSubmission(i);
			}
			
			else {
				dupeIndex = findDupes(voterID.get(i));
				removeSubmission(dupeIndex);
				addSubmission(i);
			}
		}
	}
	
	public int findDupes(Student id) {
		for(int i = 0; i < currentStudents.size(); i++) {
			if(id.getID() == currentStudents.get(i).getID()) {
				return i;
			}
		}
		return 0;
	}
	
	public boolean valid(Student id) {
		if(currentStudents.size() == 0) {
			return true;
		}
		else {
			for(int i = 0; i < currentStudents.size(); i++) {
				if(id.getID() == currentStudents.get(i).getID()) {
					return false;
				}
			}
			return true;
		}
	}

//	public void setVoterID(ArrayList<Student> students) {
//		voterID = students;
//	}
	
	public void addCurrentStudent(Student student) {
		currentStudents.add(student);
	}
	
	public void removeCurrentStudent(int i) {
		currentStudents.remove(i);
	}
	
}

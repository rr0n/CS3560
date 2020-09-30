	package cs4800.assignment1;

import java.util.ArrayList;

public class SVotingService extends VotingService{
	private SingleVoteGenerator svg;
//	private SingleVoteGenerator svg;
	private ArrayList<Student> voterID;
//	private ArrayList<Integer> submissionsList;
//	private ArrayList<Student> currentStudents = new ArrayList<Student>(); //what i want to keep track of
//	private ArrayList<Integer> currentSubmissions = new ArrayList<Integer>();
	private int[] count = {0, 0, 0, 0};
	private ArrayList<Integer> submissionsList;
	private ArrayList<Integer> currentSubmissions = new ArrayList<Integer>();
	
	public SVotingService(SingleVoteGenerator svg, SingleQuestion sq) {
		this.svg = svg;
		voterID = this.svg.getVoterID();
		//setVoterID(voterID);
		submissionsList = this.svg.getVotes();
		printCurent();
		removeAllPrevEntries(voterID);
		sq.printAnswer();
		tally();
	}
	
	public void tally() {
		for(int i = 0; i < currentSubmissions.size(); i++) {
			count[currentSubmissions.get(i)] += 1;
		}
		System.out.println("Submissions: ");
		for(int i = 0; i < 4; i++) {
			System.out.println((char)(i+'a') + ") " + count[i]);
		}
	}
	public void addSubmission(int index) {
		addCurrentStudent(voterID.get(index));
		currentSubmissions.add(submissionsList.get(index));
	}
	
	public void removeSubmission(int index) {
		removeCurrentStudent(index);
		currentSubmissions.remove(index);
	}
	
//	public void removeAllPrevEntries() {
//		int dupeIndex;
//		for(int i = 0; i < voterID.size(); i++) {
//			if(valid(voterID.get(i))) {// if it is not empyt or has no duplicates
//				addSubmission(i);
//				currentStudents.add(voterID.get(i));
//				currentSubmissions.add(submissionsList.get(i));
//			}
//			
//			else {
//				dupeIndex = findDupes(voterID.get(i));
//				removeSubmission(dupeIndex);
//				addSubmission(i);
//			}
//		}
//	}
	
//	public int findDupes(Student id) {
//		for(int i = 0; i < currentStudents.size(); i++) {
//			if(id.getID() == currentStudents.get(i).getID()) {
//				return i;
//			}
//		}
//		return 0;
//	}
//	
//	public boolean valid(Student id) {
//		if(currentStudents.size() == 0) {
//			return true;
//		}
//		else {
//			for(int i = 0; i < currentStudents.size(); i++) {
//				if(id.getID() == currentStudents.get(i).getID()) {
//					return false;
//				}
//			}
//			return true;
//		}
//	}

	public void printCurent() {
		for(int i = 0; i < voterID.size(); i++) {
			System.out.println(voterID.get(i).getID() + " (" + (char)('a' + submissionsList.get(i)) + ")");
		}
	}
}

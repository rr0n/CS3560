package cs4800.assignment1;

import java.util.ArrayList;

public class MVotingService extends VotingService{
	
	private MultVoteGenerator mvg;
	private ArrayList<Student> voterID;
	private int[] count = {0, 0};//right or wrong
	private ArrayList<Integer> submissionsList = new ArrayList<Integer>();;
	private ArrayList<Integer> currentSubmissions = new ArrayList<Integer>();
	
	public MVotingService(MultVoteGenerator mvg, MultQuestion mq) {
		this.mvg = mvg;
		voterID = this.mvg.getVoterID();
		//setVoterID(voterID);
		submissionsList = this.mvg.results();
		printCurent();
		removeAllPrevEntries(voterID);
		mq.printAnswer();
	}
	
	public void tally() {}
	
	public void addSubmission(int index) {
		int templist;
		templist = submissionsList.get(index);
		addCurrentStudent(voterID.get(index));
		currentSubmissions.add(templist);
	};
	
	public void removeSubmission(int index) {
		removeCurrentStudent(index);
		currentSubmissions.remove(index);
	}
	
	public void printCurent() {
		for(int i = 0; i < voterID.size(); i++) {
			//System.out.println(voterID.get(i).getID() +  submissionsList.get(i));
		}
	}
}

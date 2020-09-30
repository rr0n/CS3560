package cs4800.assignment1;

import java.util.ArrayList;
import java.util.Random;

public class SimulationDriver {

	public static void main(String[]args) {
		
		ArrayList<Student> studentList;
		studentList = generateStudents();
		int numStudents = studentList.size();
		
	
		System.out.println("Number of Students participating: " + numStudents);

		SingleQuestion sq = new SingleQuestion("Single Answer Example: ");
		sq.setAnswer(1);
		sq.setChoices("This","Is", "A", "Test");
		
		System.out.println(sq.getPrompt());
		for(int i = 0; i < 4; i++) {
			System.out.println(" [" + (char)('a'+i) + "] " + sq.getChoices()[i]);
		}

		SingleVoteGenerator svg = new SingleVoteGenerator(studentList);
		SVotingService svs = new SVotingService(svg, sq);
		
		System.out.println();
		
		MultQuestion mq = new MultQuestion("Multiple Answers Example");
		mq.setAnswer(0);
		mq.setAnswer(1);
		mq.setAnswer(2);
		mq.setChoices("This", "is", "another", "Test");
		
		System.out.println(mq.getPrompt());
		for(int i = 0; i < 4; i++) {
			System.out.println(" [" + (char)('a'+i) + "] " + mq.getChoices()[i]);
		}

		MultVoteGenerator mvg = new MultVoteGenerator(studentList);
		MVotingService mvs = new MVotingService(mvg, mq);
	}
	
	//Generate random number of students with unique ID
	public static ArrayList<Student> generateStudents(){
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		Random rand = new Random();
		int studentID = 1;
		
		int rand_num_students = rand.nextInt(20) + 1;//max of 20 people generated
		for(int i = 0; i < rand_num_students; i++) {
			String sid = "Student#";
			//will generate sequential order by students registered 001 002 ... etc
			String tempID = Integer.toString(studentID);
			while(tempID.length() < 3) {
				tempID="0"+tempID;
			}
			sid +=tempID;
			Student student = new Student(sid);
			studentList.add(student);
			studentID++;
			student = new Student();
		}
		//studentList = new ArrayList<Student>();
		return studentList;
	}

	//checking to see students have been generated
	public static void printList(ArrayList<Student> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getID());
		}
	}
}

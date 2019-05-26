package edu.handong.analysis;

import edu.handong.analysis.datamodel.Course;
import edu.handong.analysis.datamodel.Student;
import java.util.ArrayList;

public class HGUCoursePatternAnalyzer {
	
	String[] lines = {	"1999-1, JC Nam, Java Programming",
						"1999-2, JC Nam, Programming Language Theory",
						"1999-1, JC Nam, Data Structures",
						"2001-1, JC Nam, Database Systems",
						"2018-1, SB Lim, Java Programming",
						"2018-2, SB Lim, Programming Language Theory",
						"2019-1, SB Lim, Data Structures",
						"2019-1, SB Lim, Algorithm Analysis",
						"2018-1, SJ Kim, Java Programming",
						"2018-2, SJ Kim, Programming Language Theory",
						"2019-1, SJ Kim, Logic Design",
						"2019-1, SJ Kim, Algorithm Analysis",
						};

	int numOfStudents;
	int numOfCourses;
	private ArrayList<String> students;
	private ArrayList<String> courses;
	
	/**
	 * This method runs our analysis logic to get the list of student and course names from lines.
	 * @param args
	 */
public void run(String[] args) {
		
		numOfStudents = Integer.parseInt(args[0]);
		numOfCourses = Integer.parseInt(args[1]);

		students = new ArrayList<String>();
		students = initiateStudentArrayFromLines(lines);

		courses = new ArrayList<String>();
		courses = initiateCourseArrayFromLines(lines);
		
		System.out.println("Number of All Students: " + numOfStudents);
		for(String student: students) {
			System.out.println(student);
		}
		
		System.out.println("Number of All Courses: " + numOfCourses);
		for(String course: courses) {
			System.out.println(course);
		}
		
	}

	/**
	 * This method returns a Student array to initiate the field, students, from lines.
	 * @param lines
	 * @return
	 */
	private ArrayList<String> initiateStudentArrayFromLines(String[] lines) {
		
		// TODO: implement this method
		ArrayList<String> stu = new ArrayList<String>();
	
		String str[];
		int i = 0;
		int j = 0;
		for(String names : lines) {
			str = names.split(",");
			str[1] = str[1].trim();
			Student myStu = new Student(str[1]);
			
			if(studentExist(stu, myStu) == false) {
				stu.add(str[1]);
				i++;
			}
		}
		
		return stu;
	}

	/**
	 * This method check if there is the same name of the second arugement in the array, students
	 * @param students
	 * @param student
	 * @return boolean
	 */
	private boolean studentExist(ArrayList<String> students, Student student) {
		
		// TODO: implement this method
		for(String stu : students) {
			if(stu.equals(student.getName())) {
				return true;
			}
		}

		return false;
	}
	
	/**
	 * This method returns a Course array to initiate the field, courses, from lines.
	 * @param lines
	 * @return
	 */
	private ArrayList<String> initiateCourseArrayFromLines(String[] lines) {
		
		// TODO: implement this method
		ArrayList<String> cor = new ArrayList<String>();
		
		String str[];
		int i = 0;
		int j = 0;
		for(String names : lines) {
			str = names.split(",");
			str[2] = str[2].trim();
			Course myCor = new Course(str[2]);
			
			if(courseExist(cor, myCor) == false) {
				cor.add(str[2]);
				i++;
			}
		}
		
		return cor;
		
	}

	/**
	 * This method check if there is the same name of the second argument in the array, courses.
	 * @param courses
	 * @param course
	 * @return boolean
	 */
	private boolean courseExist(ArrayList<String> courses, Course course) {
		
		// TODO: implement this method
		for(String cor : courses) {
			if(cor.equals(course.getCourseName())) {
				return true;
			}
		}

		return false;
	}

}


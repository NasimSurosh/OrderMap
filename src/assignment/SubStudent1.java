package assignment;

import java.util.HashMap;
import java.util.Map;

class Student {
	    private String name;
	    private Map<String, Double> grades;

	    public Student(String name) {
	        this.name = name;
	        this.grades = new HashMap<>();
	    }

	    public String getName() {
	        return name;
	    }

	    public Map<String, Double> getGrades() {
	        return grades;
	    }
	}

	public class SubStudent1 {
	    private Map<String, Student> studentMap;

	    public SubStudent1() {
	        this.studentMap = new HashMap<>();
	    }

	    public void addStudent(String studentID, String name) {
	        Student student = new Student(name);
	        studentMap.put(studentID, student);
	    }
	
	    public void addGrade(String studentID, String course, double grade) {
	        Student student = studentMap.get(studentID);
	        if (student != null) {
	            student.getGrades().put(course, grade);
	        } else {
	            System.out.println("Student not found!");
	        }
	    }

	    public double calculateAverageGrade(String studentID) {
	        Student student = studentMap.get(studentID);
	        if (student != null) {
	            Map<String, Double> grades = student.getGrades();
	            double total = 0;
	            for (double grade : grades.values()) {
	                total = total + grade;
	            }
	            return total / grades.size();
	        } else {
	            System.out.println("Student not found!");
	            return -1;
	        }
	}
	    public void displayStudentInfo(String studentID) {
	        Student student = studentMap.get(studentID);
	        if (student != null) {
	            System.out.println("Student ID: " + studentID);
	            System.out.println("Name: " + student.getName());
	            System.out.println("Grades: " + student.getGrades());
	            System.out.println("Average Grade: " + calculateAverageGrade(studentID));
	        } else {
	            System.out.println("Student not found!");
	        }
	    }

	    public static void main(String[] args) {
	    	SubStudent1 tracker = new SubStudent1();
	        tracker.addStudent("001", "Joe Brown");
	        tracker.addGrade("001", "Math", 85.5);
	        tracker.addGrade("001", "Science", 92.0);
	        tracker.addGrade("001", "Chemistry", 80.0);
	        tracker.addGrade("001", "Biology", 89.5);
	        tracker.displayStudentInfo("001");
	    }
	}
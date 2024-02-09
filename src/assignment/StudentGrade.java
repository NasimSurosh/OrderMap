package assignment;

public class StudentGrade {
	String name;
	int studentID;
	double history;
	double math;
	double language;
	double physics;
	double total;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public double getHistory() {
		return history;
	}
	public void setHistory(double history) {
		this.history = history;
	}
	public double getMath() {
		return math;
	}
	public void setMath(double math) {
		this.math = math;
	}
	public double getLanguage() {
		return language;
	}
	public void setLanguage(double language) {
		this.language = language;
	}
	public double getPhysics() {
		return physics;
	}
	public void setPhysics(double physics) {
		this.physics = physics;
	}
	
	public void calculateMark() {
		total = history + math + language + physics;
		System.out.println("Total mark is: " + total);
	}
	public void avg() {
		double avg = total/4;
		System.out.println("The avg of student is: " + avg);
	}
	
	public void display() {
		System.out.println("Student name is: "+ name);
		System.out.println("Student id is: "+ studentID);
		System.out.println("History mark is:"+ history+ " mark");
		System.out.println("Math mark is: " + math+ " mark");
		System.out.println("Language mark is: " + language);
		System.out.println("Physics mark is: " + physics);
		
	}
}

package assignment;

public class MainStudentGrade {

	public static void main(String[] args) {
		
		StudentGrade grade = new StudentGrade();
		
		grade.setName("Yama");
		grade.setStudentID(43);
		grade.setHistory(76);
		grade.setLanguage(97);
		grade.setMath(87);
		grade.setPhysics(90);
		grade.display();
		grade.calculateMark();
		grade.avg();

	}

}

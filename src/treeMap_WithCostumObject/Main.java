package treeMap_WithCostumObject;

import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
		TreeMap<Integer, Student> student = new TreeMap<>();
		
		student.put(543, new Student(173, " Fari"));
		student.put(544, new Student(454, " Alix"));
		student.put(456, new Student(645, " Jim"));
		student.put(54, new Student(154, " Tawheed"));
		
		System.out.println(student);
		
	

	}

}

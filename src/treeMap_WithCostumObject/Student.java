package treeMap_WithCostumObject;

public class Student implements Comparable<Student>{
	Integer id;
	String name;
	public Student(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student other) {
		return name.compareTo(name);
	}
	

}

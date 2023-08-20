package Constructor;

public class Student {
String name;
int age;
String studentId;
public Student() {
	this.name="unknown";
	this.age=0;
	this.studentId="unknown";
	
}
public Student(String name,int age,String StudentId) {
	this.name=name;
	this.age=age;
	this.studentId=StudentId;
	
}
public Student(int age) {
	this.age=age;
}
public static void main(String[] args) {
	Student s= new Student();
	Student s1 = new Student("urvashi",5,"uhfiuyes");
	Student s2= new Student(8);
	
}
}

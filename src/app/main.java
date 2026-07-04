package app;

import model.Student;
import service.StudentManager;

public class main {

	public static void main(String[] args) 
	{
		StudentManager y=new StudentManager();
		Student s1=new Student(1,"Abhi",23,"cse");
		Student s2=new Student(2,"Abh",2,"cs");
		y.addStudent(s1);
		y.addStudent(s2);
		y.displayStudent();

	}

}

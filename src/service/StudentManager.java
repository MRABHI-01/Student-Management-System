package service;

import java.util.*;
import model.Student;

public class StudentManager 
{
	private ArrayList<Student> students;
	public StudentManager()
	{
		students=new ArrayList<>();
	}
	
	public void addStudent(Student student)
	{
		students.add(student);
		System.out.println("Added successfully");
	}
	
	public void displayStudent()
	{
		if(students.isEmpty())
		{
			System.out.println("NO one is there");
		}
		
		for (Student x:students)
		{
			System.out.println(x);
		}
	}
}

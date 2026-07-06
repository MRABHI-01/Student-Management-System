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
	public void searchStudent(int id)
	{
		if(students.isEmpty())
		{
			System.out.println("NO one is there for search");
		}
		for (Student x:students)
		{
			if(x.getId()==id)
				System.out.println("Student details are: " + x.toString());
			else
			{
			System.out.println("Student not found.");
			break;
			}
		}
	}
	public void UpdateStudent(int id, String name, int age, String course)
	{
		boolean found=false;
		for (Student x:students)
		{
			if(x.getId()==id)
			{
				x.setName(name);
				x.setAge(age);
				x.setCourse(course);
				
				System.out.println("Student found");
				found=true;
				break;
			}
	    }
		if(!found)
		{
			System.out.println("Student not found");
		}
	}
	public Student findstudentbyid(int id)
	{
		for (Student x:students)
		{
			if(x.getId()==id)
			{
				return x;
			}
		}
		return null;
	}
}

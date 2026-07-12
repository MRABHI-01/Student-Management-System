package service;

import java.security.cert.CollectionCertStoreParameters;
import java.util.*;  
import model.Student;
import util.FileManager;

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
		FileManager.saveStudents(students);
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
				
				FileManager.saveStudents(students);
				
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
	public void deleteStudent(int id)
	{
		for (Student x:students)
		{
			if(x.getId()==id)
			{
				students.remove(x);
				FileManager.saveStudents(students);
				System.out.println("Student deleted successfully");
			}
		}
		System.out.println("Student not found");
	}
	public ArrayList<Student> getStudent()
	{
		return students;
	}
	public void setStudents(ArrayList<Student>students)
	{
		this.students=students;
	}
	public void sortStudents()
	{
		Collections.sort(students, new Comparator<Student>()
		{
			public int compare(Student s1, Student s2)
			{
				return Integer.compare(s1.getId(), s2.getId());
			}
		});
		System.out.println("Students sorted.");
	}
}

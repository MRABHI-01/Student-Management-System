package util;

import java.io.*;
import java.util.*;

import model.Student;

public class FileManager {

	public static void saveStudents(ArrayList<Student> students)
	{
		try
		{
			BufferedWriter writer=new BufferedWriter(new FileWriter("Students.txt"));
			for (Student s1:students)
			{
				writer.write(
								s1.getId()+","+
								s1.getName()+","+
								s1.getAge()+","+
								s1.getCourse());
				writer.newLine();
			}
			writer.close();
			System.out.println("Student saved successfully");
		}catch(IOException e)
		{
			System.out.println("Error while saving");
		}
	}
	public static ArrayList<Student> loadStudents()
	{
		ArrayList<Student> students=new ArrayList<>();
		try
		{
			BufferedReader reader=new BufferedReader(new FileReader("students.txt"));
			String line;
			while((line=reader.readLine())!=null)
			{
				String [] data=line.split(",");
				int id=Integer.parseInt(data[0]);
				String name=data[1];
				int age=Integer.parseInt(data[2]);
				String course=data[3];
				Student student=new Student(id,name,age,course);	
				students.add(student);
			}
			reader.close();
		}catch(IOException e)
		{
			System.out.println("No saved data found");
		}
		return students;
	}

}

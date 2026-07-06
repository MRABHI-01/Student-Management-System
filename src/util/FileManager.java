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

}

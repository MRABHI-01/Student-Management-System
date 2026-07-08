package app;
import java.util.*; 

import model.Student; 
import service.StudentManager;
import util.FileManager;

public class main {

	public static void main(String[] args) 
	{
		StudentManager y=new StudentManager();
		y.setStudents(FileManager.loadStudents());
//		FileManager f=new FileManager();
		Scanner x=new Scanner(System.in);
		int choice;
		while(true)
		{
			System.out.println("Student Management System");
			System.out.println("1. Add student");
			System.out.println("2. Display");
			System.out.println("3. Search");
			System.out.println("4. Update");
			System.out.println("5. Delete");
			System.out.println("6. Exit");
			System.out.println("Enter your choice:");
			choice = x.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter ID:");
				int id=x.nextInt();
				System.out.println("Enter Name:");
				String name=x.next();
				System.out.println("Enter Age:");
				int age=x.nextInt();
				System.out.println("Enter Course:");
				String course=x.next();
				Student s1=new Student(id,name,age,course);
				y.addStudent(s1);
				System.out.println("Thank you");
				break;
			case 2:
				y.displayStudent();
				System.out.println("Thank you");
				break;
			case 3:
				System.out.println("Enter id for search:");
				int i=x.nextInt();
				y.searchStudent(i);
				System.out.println("Thank you");
				break;
			case 4:
				System.out.println("Enter id to update");
				int a=x.nextInt();
				Student s2=y.findstudentbyid(a);
				if(s2==null)
				{
					System.out.println("Student not found");
					System.out.println("Thank you");
					break;
				}
				System.out.println("Enter updated details");
				String b=x.next();
				int c=x.nextInt();
				String d=x.next();
				y.UpdateStudent(a, b, c, d);
				System.out.println("Thank you");
				break;
			case 5:
				System.out.println("Enter id for deletion");
				int f=x.nextInt();
				y.deleteStudent(f);
				System.out.println("Thank you");
				break;
			case 6:
				FileManager.saveStudents(y.getStudent());
				System.out.println("Thank you for using Student Manager");
				x.close();
				System.exit(0);
				return;
				default:
					System.out.println("Choice Error");
			}
		}

	}

}

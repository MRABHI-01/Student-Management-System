package app;
import java.util.*;  

import model.Student; 
import service.StudentManager;
import util.FileManager;
import util.InputValidator;

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
			System.out.println("3. Search by ID");
			System.out.println("4. Search by Name");
			System.out.println("5. Update");
			System.out.println("6. Delete");
			System.out.println("7. Sorting by ID");
			System.out.println("8. Sorting by Name");
			System.out.println("9. Student Statistics");
			System.out.println("10. Exit");
			System.out.println("Enter your choice:");
			try
			{
				choice = x.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("Enter ID:");
					int id=x.nextInt();
					x.nextLine();
					if(!InputValidator.isValidId(id))
					{
						System.out.println("Invalid Student");
						break;
					}
					
					Student std=y.findstudentbyid(id);
					if(std!=null)
					{
						System.out.println("Student already exits.");
						break;
					}
					System.out.println("Enter Name:");
					String name=x.next();
					if(!InputValidator.isValidName(name))
					{
						System.out.println("Invalid Name");
						break;
					}
					
					System.out.println("Enter Age:");
					int age=x.nextInt();
					x.nextLine();
					if(!InputValidator.isValidAge(age))
					{
						System.out.println("Invalid Age");
						break;
					}
					
					System.out.println("Enter Course:");
					String course=x.next();
					if(!InputValidator.isValidCourse(course))
					{
						System.out.println("Invalid Course");
						break;
					}
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
					x.nextLine();
					System.out.println("Enter name:");
					String s=x.nextLine();
					y.searchStudentByName(s);
					break;
				case 5:
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
				case 6:
					System.out.println("Enter id for deletion");
					int f=x.nextInt();
					y.deleteStudent(f);
					System.out.println("Thank you");
					break;
				case 7:
					y.sortStudents();
					break;
				case 8:
					y.sortStudentbyName();
					break;
				case 9:
					y.StudentStastics();
					break;
				case 10:
					System.out.println("Thank you for using Student Manager");
					x.close();
					System.exit(0);
					return;
					default:
						System.out.println("Choice Error");
				}
			}catch(InputMismatchException e)
			{
				System.out.println("Invalid input.Please enter a number.");
				x.nextLine();
			}
		}

	}

}

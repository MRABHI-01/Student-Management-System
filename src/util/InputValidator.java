package util;

public class InputValidator {
	public static boolean isValidId(int id)
	{
		return id>0;
	}
	public static boolean isValidAge(int age)
	{
		return age>=1&&age<=120;
	}
	public static boolean isValidName(String name)
	{
		return !name.trim().isEmpty();
	}
	public static boolean isValidCourse(String course)
	{
		return !course.trim().isEmpty();
	}
}

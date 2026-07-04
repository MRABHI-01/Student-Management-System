package model;

public class Student 
{
	private int id;
	private String name;
	private int age;
	private String course;
	
	public Student(int id, String name, int age, String course)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.course=course;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}

	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + 
				", name=" + name + 
				", age=" + age + 
				", course=" + course
				+ "]";}
}



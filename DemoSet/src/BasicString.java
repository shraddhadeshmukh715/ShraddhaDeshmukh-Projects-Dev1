/****
 * toString() method is present inside the object class.
 * If you want to print the state of object then we can override that into the child class.
 */

import java.util.HashSet;
import java.util.Set;

public class BasicString {

	public static void main(String[] args) {
		
		Teacher t1 = new Teacher(1, "john");
		Teacher t2 = new Teacher(2, "Allen");
		
		Set<Teacher> setTeacher = new HashSet<>();
		
		setTeacher.add(t1);
		setTeacher.add(t2);
		
		System.out.println(setTeacher);
		
		System.out.println(t1.toString());
		System.out.println(t2.toString());
	}
}

class Teacher
{
	private int id;
	private String name;
	
	public Teacher(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Teacher id = "+ id + ", name = "+ name + "";
	}
}
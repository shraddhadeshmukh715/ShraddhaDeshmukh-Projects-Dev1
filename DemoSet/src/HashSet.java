/*
* HashSet is a class that implements the Set interface.
* It is part of the java.util package.
* HashSet stores unique elements only (no duplicates allowed).
* Duplicate checking is done using hashCode() and equals() methods.
* HashSet internally uses a HashMap to store elements as keys.
* It does not maintain insertion order of elements.
* HashSet allows only one null element.
* It provides fast performance for basic operations like add, remove, and search.
* HashSet is not synchronized (not thread-safe).
* It is best used when uniqueness is important and order does not matter.
 */
import java.util.Set;

public class HashSet {
	public static void main(String args[])
	{
		Set<Integer> s = new java.util.HashSet<>();
		
		s.add(null);
		s.add(20);
		s.add(29);
		s.add(14);
		s.add(20);  // that means Hashset does not allow duplicate elements 
		s.add(14);
		s.add(null);// that means it allows only one NULL element
	
		System.out.println(s);
	}		
}	







//		System.out.println(e1);  // require = john but give=  Employee@24d46ca6
//		
//		String s = e1.toString();
//		System.out.println(s);  // Employee@24d46ca6
//		
//	}
//
//	
//}
//
//class Employee
//{
//	String eId;
//	
//	
//	public String toString()  // click on onString and generate the toString() method/object
//	{
//		return "name = john";
//	}
//	
//	public Employee(String eId)
//	{
//		this.eId = eId;
//	}
//	
//	
//	
//}

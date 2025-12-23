/*
	ArrayList is a class that implements the List interface 
	It is used to store multiple elements using dynamic array
	By default ArrayList capacity is 10
	But when it becomes full, then it automatically increase the size

	In ArrayList Insertion order is maintained
	It allow Multiple Duplicate elements
	Elements can be accessed using index

	It is Fast for searching and reading operations
	Slower for insertion and deletion in the middle

	It is easy and commonly used
	ArrayList is not synchronized that means by default it is not thread safe.
	And because of non synchronization it is not suitable for multithreading.
	
	Functions Used
	* 

*/


import java.util.List;

public class ArrayList {

	public static void main(String[] args)
	{
		java.util.ArrayList<String> list = new java.util.ArrayList<>();
		
		// uses the add function
		list.add("Shraddha");
		list.add(1, "Prachi");
		list.add(2,"Aditi");
		list.add(3,"Komal");
		
		System.out.println("added to index: "+list);
		
		//uses the add function
		list.add("Radha");
		System.out.println("Added the name : " +list);
				
		// insert null value
		list.add(null);
		System.out.println("Added the null value : "+list);
 
		// uses remove function
		list.remove(2);
		System.out.println("Remove the index : " +list);
		
		// uses the get tfunction

		System.out.println("get element of o index : "+list.get(0));
		
		// uses the set function
		list.set(2, "Gauri");
		System.out.println("updated the value of index : " +list);
		 
		//uses the add function
		list.add("Radha");
		System.out.println("Add the name : " +list);
		
		// insert null value
		list.add(null);
		System.out.println("Added the null value : "+list);
	}
}

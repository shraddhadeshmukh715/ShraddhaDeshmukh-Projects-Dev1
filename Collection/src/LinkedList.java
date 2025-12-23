/*
 *1. LinkedList is a class that implements the List Interface
 *2. It internally use node to store the data Each store contains the reference of previous node and reference of next node.
 *3. allows duplicates and support index-based access.
 *4. slower for middle insertion and deletion
 *5. Fast for Read and Serach.
 *6. Not synchronized (not thread-safe by ddefault).
*
*  Methods Used:
 *	addFirst()
 *	addLast()
 *	add(index, value)
 *	getFirst()
 *	getLast()
 *	get(index)
 *	removeFirst()
 *	removeLast()
 *  remove(index)
 *	set(index, value)
*/


public class LinkedList {

	public static void main (String args[])
	{
		java.util.LinkedList<String> car = new java.util.LinkedList<>();
		
		car.add("Wagnar");
		car.add("Swift");
		car.add("Scorpio");
		car.add("Oddi");
		car.add("Kia");
		car.add("GWagon");
		car.add("Fortuner");
		car.add("BMW");
		
		System.out.println(car);
		
		// uses  addFirst(value)
		car.addFirst("Alto");
		System.out.println("Added First : "+car);
		
		// uses addLast(value)
		car.addLast("Lamborgini");
		System.out.println("Added Lat : "+car);
		
		// uses add(index, value)
		car.add(1, "Vista");
		System.out.println("Added at the 1 index : " +car);
		
		// uses getFirst()
		System.out.println("Get First : " +car.getFirst());
		
		// uses getLast()
		System.out.println("Get Last : " +car.getLast());
		
		// uses getInsex(index)
		System.out.println("Get Car by index : " +car.get(4));
		
		// uses removeFirst()
		System.out.println("Remove First : "+car.removeFirst());
		
		// uses removeLast()
		System.out.println("Remove Last : " +car.removeLast());
		
		// uses remove(index)
		System.out.println("Remove car by index : "+car.remove(4));
		
		System.out.println(car);
		
		// uses set(index,value)
		car.set(2 , "Vitara");
		System.out.println("Set using index : " +car);
	}
}

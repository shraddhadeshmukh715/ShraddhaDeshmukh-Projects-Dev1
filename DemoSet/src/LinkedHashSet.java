/*
* LinkedHashSet is a class that implements the Set interface.
* It belongs to the java.util package.
* LinkedHashSet stores unique elements only (duplicates are not allowed).
* It maintains insertion order of elements.
* Internally, it uses a LinkedHashMap to store data.
* It allows only one null element.
* Duplicate checking is done using hashCode() and equals() methods.
* LinkedHashSet provides slightly slower performance than HashSet due to order maintenance.
* It is not synchronized (not thread-safe).
* LinkedHashSet is best used when uniqueness + insertion order is required.
 */
import java.util.Set;
public class LinkedHashSet {

	public static void main(String[] args)
	{
		Set<Integer> s = new java.util.LinkedHashSet();
		
		s.add(79);
		s.add(28);
		s.add(14);
		s.add(79);
		s.add(2);
		s.add(null);
		s.add(null);  
		
		 System.out.println(s);
	}	
}


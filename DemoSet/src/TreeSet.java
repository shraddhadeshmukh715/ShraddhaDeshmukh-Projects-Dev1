/*
* TreeSet is a class that implements the Set interface.
* It is part of the java.util package.
* TreeSet stores unique elements only (no duplicates allowed).
* It maintains elements in sorted order (ascending by default).
* Internally, TreeSet uses a Red-Black Tree data structure.
* TreeSet does not allow null elements.
* Duplicate checking is done using comparison logic (Comparable or Comparator).
* TreeSet is slower than HashSet and LinkedHashSet due to sorting.
* It is not synchronized (not thread-safe).
* TreeSet is best used when sorted and unique data is required.
 */
import java.util.Set;
public class TreeSet {

	public static void main(String[] args)
	{
		Set<Integer> s = new java.util.TreeSet();
	
		s.add(78);
		s.add(14);
		s.add(28);		
		s.add(78);
		s.add(28);
		s.add(2);
		s.add(72);
		
		System.out.println(s);
	}
}

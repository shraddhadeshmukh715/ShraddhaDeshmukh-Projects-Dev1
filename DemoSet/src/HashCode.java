
public class HashCode {

	public static void main(String[] args)
	{
//		Emp e1 = new Emp("1345647");
//		Emp e2 = new Emp("1345647");
//		
//		System.out.println(e1.hashCode());//100
//		System.out.println(e1.);
//		
//		System.out.println(e2.hashCode());//100  // HashCode deto 
		
		Emp e1 = new Emp("1212");
		
		Emp e2 = new Emp("1212");
				
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
	}
}

class Emp
{
	String eId;
	

	public int hashCode()
	{
		return 200;
	}
//	

	public Emp(String eId)
	{
		super();
		this.eId = eId;
	}
	
	@Override
	public String toString()
	{
		return "Employee [id= "+ eId+ "]";
	}
}

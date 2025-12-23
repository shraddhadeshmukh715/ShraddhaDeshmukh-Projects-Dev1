public class Basic {
	public static void main(String[] args) {
		
		Doctor d1 = new Doctor(11, "Savitri", "BAMS");
		
		System.out.println(d1);		// Doctor@24d46cab
		System.out.println(d1.toString());  //Doctor[id=11,name=savitri,Specialization =BAMS]
	}
}

class Doctor
{
	private int id;
	private String name;
	private String spl;
	
	public Doctor(int id, String name, String spl)
	{
		super();
		this.id = id;
		this.name = name;
		this.spl = spl;
	}
	@Override
	public String toString()
	{
		return "Doctor [id =" + id + ", name = " + name+ ", Specialization = " +spl+ "]";
	}
}


public class Ward {

	private String Name;
	private char Gender;
	private int NoOfBeds;
	
	
	
	public Ward(String m, char g, int beds)
	{
		this.Name=m;
		this.Gender=g;
		this.NoOfBeds=beds;
	
	}
	
	public String getName()
	{
		return this.Name;
	}
	
	public void display()
	{
		System.out.println(Name+"\n"+Gender+"\n"+NoOfBeds+"\n");
	}
	
}

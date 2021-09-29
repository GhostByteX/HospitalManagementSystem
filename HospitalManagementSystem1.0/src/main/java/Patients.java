
public class Patients {
	
	private int PID;
	private String Name;
	private int Age;
	private char Gender;
	private String WardAllocated;
	private int BedNo;
	
	public Patients(int P,String n,int a,char g, String wa,int b)
	{
		PID=P;
		Name=n;
		Age=a;
		Gender=g;
		WardAllocated=wa;
		BedNo=b;
	}
	
	public void display()
	{
		System.out.println(PID+"\n"+Name+"\n"+Age+"\n"+Gender+"\n"+WardAllocated+"\n"+BedNo+"\n");
	}
	
}

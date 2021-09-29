import java.util.ArrayList;

public class Hospital {

	private String Name;
	private String Location;
	private int Rating;
	private long  Contact;
	private ArrayList<Ward> Wards;
	private ArrayList<Patients> PatientsList;
	
	public void Hospital()
	{
		Name="Shifa International";
		Location="Plot # 67 Street # 3 H-8/1 Islamabad, Pakistan";
		Rating=8;
		Contact=0514336567;
		ArrayList<Ward> Wards =new ArrayList<Ward>();
		@SuppressWarnings("unused")
		ArrayList<Patients> PatientsList=new ArrayList<Patients>();
		
		Ward a=new Ward("Male Ward 1",'M' ,45);
		Ward b=new Ward("Female Ward 1",'F' ,38);
		Ward c=new Ward("OT",'M' ,56);
		Ward d=new Ward("OT",'F' ,45);
		Ward e=new Ward("PSY",'M' ,15);
	
			
		Wards.add(a);
		Wards.add(b);
		Wards.add(c);
		Wards.add(d);
		Wards.add(e);
		
		
		
		
	}
	
	public void addPatient(int P,String n,int a,char g, String wa,int b)
	{
		Patients Pat=new Patients(P,n,a,g,wa,b);
		PatientsList.add(Pat);
	}
	
	public void display()
	{
		System.out.println(Name+"\n"+Location+"\n"+Rating+"\n"+Contact+"\n");
		for (int i=0;i<Wards.size();i++)
		{
			Wards.get(i).display();
		}
		
		for (int i=0;i<PatientsList.size();i++)
		{
			PatientsList.get(i).display();
		}
		
	}
	
}




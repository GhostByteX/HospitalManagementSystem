
public class Main {

	public static void main(String [] args)
	{
		Hospital A= new Hospital();
		A.addPatient(123,"Usman",21,'M',"OT",23);
		A.addPatient(123,"Ali",26,'M',"PSY",11);
		A.addPatient(123,"Aleena",24,'F',"OT",1);
		A.addPatient(123,"Ayesha",29,'F',"Female Ward 1",2);
		
		A.display();
	}
}
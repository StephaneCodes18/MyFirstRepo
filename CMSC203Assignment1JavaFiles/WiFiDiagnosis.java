package assignment1;

public class WiFiDiagnosis {
	
	public static void computerReboot() 
	{
	  System.out.println("\n First step: reboot your computer ");
	  System.out.println(" Are you able to connect with the internet? Enter (yes or no) ");
	}
 
	public static void routerReboot()
	{
	  System.out.println("Second step: Reboot the router and try to connect");
	  System.out.println("Did that fix the problem? Enter (yes or no)");
	}
	
	
	public static void cableCheck()
	{
	  System.out.println("Third step: Make sure the cables connecting the router are firmly plugged in and power is getting to the router");
	  System.out.println("Did that fix the problem? Enter (yes or no)");	
	}	
	
	public static void moveComputer() 
	{
	  System.out.println("Fourth step: Move the computer closer to the router and try to connect");
	  System.out.println("Did that fix the problem? Enter (yes or no)");	
	}
	
	public static void askISP() {
	  System.out.println("Fifth Step: Contact your ISP(Internet Service Provider)");
	  System.out.println("Make sure your ISP is hooked up to your router");
	}
	
	public static void goodbyeMessage()
	{
	  System.out.println("\nProgrammer's name: Stephane Mbenga");
	  System.out.println("Goodbye");
	}
		
		
	
}

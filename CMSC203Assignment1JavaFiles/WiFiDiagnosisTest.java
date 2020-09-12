package assignment1;

import java.util.Scanner;

public class WiFiDiagnosisTest {
	

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String userInput;
		
		//Display program header
		 System.out.println(" If you have a problem with internet connectivity, this WiFi Diagnosis might work. ");
		 
		 //Display possible solutions, and check if each solution worked by accepting user input, if a solution works exit, otherwise go on
		 
		 WiFiDiagnosis.computerReboot();
		 userInput = keyboard.nextLine();
		
		 
		 if(userInput.equalsIgnoreCase("yes")) 
		 {
			 System.out.println("Looks like rebooting your computer seemed to work");
			 keyboard.close();
			 WiFiDiagnosis.goodbyeMessage();
			 System.exit(0);
			
		 }
		 
		 WiFiDiagnosis.routerReboot();
		 userInput = keyboard.nextLine();
		 
		 if(userInput.equalsIgnoreCase("yes")) 
		 {
			 System.out.println("Looks like rebooting your router seemed to work");
			 WiFiDiagnosis.goodbyeMessage();
			 keyboard.close();
			 System.exit(0);
		 }
		 
		 WiFiDiagnosis.cableCheck();
		 userInput = keyboard.nextLine();
		 
		 if(userInput.equalsIgnoreCase("yes")) 
		 {
			 System.out.println("Looks like checking the cables worked");
			 WiFiDiagnosis.goodbyeMessage();
			 keyboard.close();
			 System.exit(0);
		 }
		 
		 WiFiDiagnosis.moveComputer();
		 userInput = keyboard.nextLine();
		 
		 if(userInput.equalsIgnoreCase("yes")) 
		 {
			 System.out.println("Looks like moving the computer closer worked");
			 WiFiDiagnosis.goodbyeMessage();
			 keyboard.close();
			 System.exit(0);
		 }
		 
		 WiFiDiagnosis.askISP();
		 WiFiDiagnosis.goodbyeMessage();

	}

	

}

package smbengalab2part2;
import java.util.Scanner;
public class SphereVolume {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	double diameter;
	double radius;
	double volume;
		System.out.println("The purpose of this program is to calculate the volume of a sphere using values entered by the user");
		System.out.println("Please enter the diameter of the sphere");
		diameter = keyboard.nextDouble();
		radius = (diameter/2.0);
		volume = (4.0/3.0) * Math.PI * (Math.pow(radius, 3));
		System.out.println("The volume of a sphere with diameter " + diameter + " is " + volume);
		keyboard.close();
		

	}

}

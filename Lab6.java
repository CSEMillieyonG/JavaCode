// Millieyon Gvin
import java.util.Scanner;
public class Lab6 {

	public static void main(String[] args) {
	
	// This program displays a horizontal triangle using asterisks
	Scanner key = new Scanner (System.in);
	
	// Prompt the user to enter the height of the triangle
	System.out.println("Enter height of the triangle:");
	int height = key.nextInt();
	
	// Draw the upper part of triangle
	for (int i = 1; i <= height; i++) {
		for (int j = 1; j <= i; j++) {
			
	System.out.print("*");
		}
		System.out.println();
	}
	
	// Draw the lower part of triangle
	for (int i = height - 1; i >= 1; i--) {
		for (int j = 1; j <= i; j++) {
	
	System.out.println("*");
		}
		System.out.println();
	}
	
		System.out.println("End of program!");
	}
}
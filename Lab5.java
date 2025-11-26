// Millieyon Gavin
import java.util.Scanner;
public class Lab5 {

	public static void main(String[] args) {
	
	Scanner key = new Scanner(System.in);
	
	System.out.println("How many dollars would you like to spend on chocolate from the vending machine?");
	
	int amount = key.nextInt();
	
	if (amount < 0) {
		
	System.out.println("Invaild value for amount!");
	
	} else {
		int chocolateBars = amount;
		int coupons = amount;
		
		while (coupons >= 6) {
			int newBars = coupons / 6;
			
		chocolateBars += newBars;
		coupons = coupons % 6 + newBars;
		}
		
		System.out.println("You can buy " + chocolateBars + " chocolate bars and will have " + coupons + "coupons left!");
			}
		}
	}

import java.util.Scanner;
public class Lab4 {
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
	System.out.println("Enter total number of software packages ordered:");
	
	int num = (int)key.nextDouble();
	
	//input validation
	if(num <= 0) {
		
		System.out.println("Invalid value for package count! Exiting the programe!");
		System.exit(0); //exits the program
		
				return;
		}
		double pricePerPackage = 99.0;
		
		double totalBillBeforeDiscount = num * pricePerPackage;
		
		double discountRate = 0.0;
		if (num >= 10 && num <= 19) {
			
		discountRate = 0.20;
		} else if (num >= 20 && num <= 49) {
			
		discountRate = 0.30;
		} else if (num >= 50 && num <= 99) {
			
		discountRate = 0.40;
		} else if (num >= 100) {
			
		discountRate = 0.50;
		}
		
		double discountAmount = totalBillBeforeDiscount * discountRate;
		double totalBillAfterDiscount = totalBillBeforeDiscount - discountAmount;
		
		System.out.println("Total Bill Amount (before discount) = $" + String.format("%.If", totalBillBeforeDiscount));
		
		System.out.println("Amount of discount = $" + String.format("%.If", discountAmount));
		
		System.out.println("Total Bill Amount (after discount) = $" + String.format("%.If", totalBillAfterDiscount));
		}
	}


	
	

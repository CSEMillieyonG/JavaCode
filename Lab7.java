import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {

	Scanner scanner = new
	Scanner(System.in);
	
	double[] gasPrices = new
	double[7];
	double sum = 0;
	
	for (int i = 0; i < 7; i++) {
	System.out.print("Enter the gas price(per gallon) on Day " + (i + 1) + ":\n");
	gasPrices[i] = scanner.nextDouble();
	sum += gasPrices[i];
	}
	
	double averagePrice = sum / 7;
	System.out.printf("The average price for 1 gallon of gas during the last 7 days =$%.2f\n", averagePrice);
	
	System.out.println("The price was above average on");
	for (int i = 0; i < 7; i++) {
	if (gasPrices[i] > averagePrice);
	}
	
	System.out.printf("Day %d: $%.2f\n", (i + 1), gasPrices[i]);
	}
}
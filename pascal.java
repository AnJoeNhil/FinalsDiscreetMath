package Discreet;
import java.math.BigInteger;
import java.util.Scanner;
public class pascal extends stirling{
	static BigInteger comb(int n,int r) {
		BigInteger comb = factorial(n).divide(factorial(r).multiply(factorial(n-r))); // formula for Combination nCr
		return comb;
	}
	public static void Pascal() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("The program will only accept Integer numbers and a limit of [0-500]");
			System.out.print("Input your designated line: "); //user input
			int n = sc.nextInt();
			if (n < 0 || n > 500) {
				System.out.print("Math Error"); // if the user input less than "0" or greater than "500" this will pop out
				System.out.println("System restarting...");
			}
			else {
				if (n == 0) {
					System.out.println("Pascal Triangle of line "+ n +" is: ");
					for(int r = 0;r <= n; r++) {
						System.out.println("| " + comb(n,r) + " |"); // shows the result of your line you selected
						}
					System.out.println("");
				}
				else {
				System.out.println("Pascal Triangle of line "+ n +" is: ");
				for(int r = 0;r <= n; r++) {
					System.out.print(" " + comb(n,r)+ " |"); // shows the result of your line you selected
					// though you might need to use WordWrap(for Integer 100+) the console so you can see the output of the program.
					}
				System.out.println("");
				}
			}
		}
		catch(Exception e) {
            System.out.println("------------------------------------------------------------------------------------------------------------");
			System.out.println("Input must be an Integer!!");
			System.out.println("Program Restarting...");
		}
	}
    

}

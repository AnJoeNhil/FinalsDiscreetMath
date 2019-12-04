package Discreet;

import java.math.BigInteger;
import java.util.Scanner;

public class Combination extends Permutation {
	public static void Combination() {
		Scanner sc = new Scanner(System.in);	
		try {
			System.out.print("Choose if \nWith Repetition[1]\nWithout Repetition [2]: ");
			int choose = sc.nextInt();
			if (choose == 1) {
			System.out.println("The program will only accept Integer numbers and a limit of [1-500]");
				System.out.print("Enter number for 'n': ");
				int n = sc.nextInt();
				
				if (n > 500 || n < -1) {
					System.out.println("Number out of range");
					System.out.println("System restarting...");
					}
				else {
					System.out.print("Enter number for 'r': ");
					int r = sc.nextInt();
				
					if (r > 500 || r < -1) {
						System.out.println("Number out of range");
						System.out.println("System restarting...");
					}
					else {
						BigInteger comb = factorial((n+r)-1).divide(factorial(r).multiply(factorial(n-1))); // formula for GenComb
						System.out.println("Combination is: \n"+ comb);
					}
				}
			}
			else if (choose == 2) {
				System.out.println("The program will only accept Integer numbers and a limit of [1-500]");
				System.out.print("Enter number for 'n': ");
				int n = sc.nextInt();
				
				if (n > 500 || n < 0) {
					System.out.println("Number out of range");
					System.out.println("System restarting...");
					}
				else {
					System.out.print("Enter number for 'r': ");
					int r = sc.nextInt();
					if (r > n) {
						System.out.print("Math Error"); // cause "r" can't be more than "n" so this will pop out
					}
					else if(r > 500 || r < 0){
						System.out.println("Number out of range");
						System.out.println("System restarting...");
					}
					else {
						BigInteger comb = factorial(n).divide(factorial(r).multiply(factorial(n-r))); // Formula for Combination
						System.out.println("Combination is \n:"+ comb);
					}
				}
			}
			else {
				System.out.println("This number is out of the choices:");
			}
		}
		catch (Exception e) {
               System.out.println("------------------------------------------------------------------------------------------------------------");
			System.out.println("Input must be an Integer!!");
			System.out.println("System Restarting...");
		}
	}
}	
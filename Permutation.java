package Discreet;

import java.math.BigInteger;
import java.util.Scanner;

public class Permutation {
	static BigInteger factorial(int n) {
		BigInteger fact = new BigInteger("1"); //initialize result
			for (int i = 2;i <= n;i++) {
				fact = fact.multiply(BigInteger.valueOf(i)); // this will initiate the use of factorial
			}
			return fact;
		}        
	public static void Permutation() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Choose if \nWith Repetition[1]\nWithout Repetition [2]: ");
			int choose = sc.nextInt();
			if (choose == 1) {
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
				
					if (r > 500 || r < 0) {
						System.out.println("Number out of range");
						System.out.println("System restarting...");
					}
					else if (r > n) {
						System.out.println("Math Error");
						System.out.println("System restarting...");
					}
					else {
						BigInteger perm = BigInteger.valueOf(n); // showcase the value of n
						BigInteger N = BigInteger.valueOf(n); // int "n" is converted to BigInt so we can attain big numbers even if 100+
						for (int i = 1;i < r;i++) {
							perm = perm.multiply(N); // formula for GenPermutation
						}	
						System.out.println("Permutation is: \n"+ perm);
					}
				}
				
			}
			else if (choose == 2) {
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
						System.out.print("Math Error"); // cause the "r" can't be more than "n" so this will pop out
					}
					else if (r > 500 || r < 0) {
						System.out.println("Number out of range");
						System.out.println("System restarting...");
					}
					else {
						BigInteger perm = factorial(n).divide(factorial(n-r)); // Formula for Permutation
						System.out.println("Permutation is: \n"+ perm);
					}
				}
			}
			else {
				System.out.println("This number is out of the choices:");
			}
		}
		catch(Exception e) {
            System.out.println("------------------------------------------------------------------------------------------------------------");
			System.out.println("Input must be an Integer!!");
			System.out.println("Program Restarting...");
		}
    }
}


package Discreet;
import java.math.BigInteger;
import java.util.Scanner;

public class stirling extends Combination {
	public static void Stirling() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("The program will only accept Integer numbers and a limit of [1-500]");
			System.out.print("Enter value of 'n': ");
			int n = sc.nextInt();
			if(n > 500 || n < 0) {
				System.out.println("Number out of range");
				System.out.println("System restarting...");
			}
			else {
				System.out.print("Enter value of 'j': ");
				int j = sc.nextInt();
				if (j > 500 || j < 0) {
					System.out.println("Number out of range");
					System.out.println("System restarting...");
				}
				else if (j > n) {
					System.out.println("Math Error");
					System.out.println("System restarting...");
				}
				else {
					System.out.println("The Stirling num of ("+ n +","+ j +") is: \n" + StirlingNum(n,j).divide(factorial(j)));
				}
			}
		}
		catch (Exception e) {
            System.out.println("------------------------------------------------------------------------------------------------------------");
			System.out.println("Input Must be an Integer!!");
			System.out.println("Program Restarting...");
		}
	}
	static BigInteger StirlingNum(int n, int j){
		BigInteger q = BigInteger.valueOf(-1); // value of (-1)^j
		BigInteger q2 = BigInteger.valueOf(-1); // value of (-1)^j
		
		BigInteger jn = BigInteger.ZERO; // use for value of (j-i)^n
		BigInteger jn1 = BigInteger.ZERO; // use for value of (j-i)^n
		BigInteger fna = BigInteger.ZERO; // for final answer
			for (int x = 0;x < j;x++) {
				q = (q).multiply(q2);
				BigInteger comb1 = factorial(j).divide(factorial(x).multiply(factorial(j-x)));
				jn = BigInteger.valueOf(j).subtract(BigInteger.valueOf(x));
				jn1 = BigInteger.valueOf(j).subtract(BigInteger.valueOf(x));
				for(int z = 1;z < n;z++) {
					jn = jn.multiply(jn1);
				}
				fna = fna.add((q).multiply(comb1).multiply(jn));
			} 
                return fna;
        }
}

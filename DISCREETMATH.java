package Discreet;
import java.util.Scanner;
public class DISCREETMATH {
    public static void main(String[] args) {
        boolean process = true;
        Scanner dp = new Scanner (System.in);
        while (process == true) {
            pascal ans = new pascal();
	        System.out.println("Exit = [0] ");
	        System.out.print("Permutation = [1] ");
	        System.out.println("         Combination = [2] ");
	        System.out.print("Stirling Number = [3] ");
	        System.out.println("     Pascal Triangle = [4] ");
            System.out.println("------------------------------------------------------------------------------------------------------------");
	        try {
		        System.out.print("Enter do you want to choose: ");
		        int i = dp.nextInt();
		        
		        if(i == 0){
		            System.out.println("--------------------------------------------------------------------------------------------------");
		        	System.out.println("Thank you for using the program!!");
		            System.out.println("--------------------------------------------------------------------------------------------------");
		        	System.exit(0);
		        }
		        else if (i == 1){
		            ans.Permutation();
		            try {
			            System.out.print("Do you want to use this again? [1] - Yes /[0] No: ");
			            int x = dp.nextInt();
			            if (x == 1) {
			                System.out.println("------------------------------------------------------------------------------------------------------------");
			            	process = true;
			            }
			            else if (x == 0) {
			                System.out.println("------------------------------------------------------------------------------------------------------------");
			            	System.out.println("Thank you for using the program");
			                System.out.println("------------------------------------------------------------------------------------------------------------");
			            	System.exit(0);
			            }
			            else {
			            	System.out.println("------------------------------------------------------------------------------------------------------------");
			            	System.out.println("You fail to use this program properly");
			            	System.out.println("System shutting down...");
			                System.out.println("------------------------------------------------------------------------------------------------------------");
			            	System.exit(0);
			            }
		            }
		            catch (Exception e) {
		                System.out.println("------------------------------------------------------------------------------------------------------------");
		            	System.out.println("You fail to use this program properly");
		            	System.out.println("System shutting down...");
		                System.out.println("------------------------------------------------------------------------------------------------------------");
		            	System.exit(0);
		            }
		        }
		        else if (i == 2){
		            ans.Combination();
		            try {
			            System.out.print("Do you want to use this again? [1] - Yes /[0] No: ");
			            int x = dp.nextInt();
			            if (x == 1) {
			                System.out.println("------------------------------------------------------------------------------------------------------------");
			            	process = true;
			            }
			            else if (x == 0) {
			                System.out.println("------------------------------------------------------------------------------------------------------------");
			            	System.out.println("Thank you for using the program");
			                System.out.println("------------------------------------------------------------------------------------------------------------");
			            	System.exit(0);
			            }
			            else {
			            	System.out.println("------------------------------------------------------------------------------------------------------------");
			            	System.out.println("You fail to use this program properly");
			            	System.out.println("System shutting down...");
			                System.out.println("------------------------------------------------------------------------------------------------------------");
			            	System.exit(0);
			            }
		            }
		            catch (Exception e) {
		                System.out.println("------------------------------------------------------------------------------------------------------------");
		            	System.out.println("You fail to use this program properly");
		            	System.out.println("System shutting down...");
		                System.out.println("------------------------------------------------------------------------------------------------------------");
		            	System.exit(0);
		            }
		        }
		        else if (i == 3){
		            ans.Stirling();
		            try {
			            System.out.print("Do you want to use this again? [1] - Yes /[0] No: ");
			            int x = dp.nextInt();
			            if (x == 1) {
			                System.out.println("------------------------------------------------------------------------------------------------------------");
			            	process = true;
			            }
			            else if (x == 0) {
			                System.out.println("------------------------------------------------------------------------------------------------------------");
			            	System.out.println("Thank you for using the program");
			                System.out.println("------------------------------------------------------------------------------------------------------------");
			            	System.exit(0);
			            }
			            else {
			            	System.out.println("------------------------------------------------------------------------------------------------------------");
			            	System.out.println("You fail to use this program properly");
			            	System.out.println("System shutting down...");
			                System.out.println("------------------------------------------------------------------------------------------------------------");
			            	System.exit(0);
			            }
		            }
		            catch (Exception e) {
		                System.out.println("------------------------------------------------------------------------------------------------------------");
		            	System.out.println("You fail to use this program properly");
		            	System.out.println("System shutting down...");
		                System.out.println("------------------------------------------------------------------------------------------------------------");
		            	System.exit(0);
		            }
		        }
		        else if (i == 4){
		            ans.Pascal();
		            try {
			            System.out.print("Do you want to use this again? [1] - Yes /[0] No: ");
			            int x = dp.nextInt();
			            if (x == 1) {
			                System.out.println("------------------------------------------------------------------------------------------------------------");
			            	process = true;
			            }
			            else if (x == 0) {
			                System.out.println("------------------------------------------------------------------------------------------------------------");
			            	System.out.println("Thank you for using the program");
			                System.out.println("------------------------------------------------------------------------------------------------------------");
			            	System.exit(0);
			            }
			            else {
			            	System.out.println("------------------------------------------------------------------------------------------------------------");
			            	System.out.println("You fail to use this program properly");
			            	System.out.println("System shutting down...");
			                System.out.println("------------------------------------------------------------------------------------------------------------");
			            	System.exit(0);
			            }
		            }
		            catch (Exception e) {
		                System.out.println("------------------------------------------------------------------------------------------------------------");
		            	System.out.println("You fail to use this program properly");
		            	System.out.println("System shutting down...");
		                System.out.println("------------------------------------------------------------------------------------------------------------");
		            	System.exit(0);
		            }
		        }
		        else{
		            System.out.println("--------------------------------------------------------------------------------------------------");
		            System.out.println("That number is out of the option.");
		            System.out.println("--------------------------------------------------------------------------------------------------");
		        } 
	        }
	        catch(Exception e) {
	            System.out.println("--------------------------------------------------------------------------------------------------");
	        	System.out.println("Must be an Integer!!");
				System.out.println("Program Restarting...");
	            System.out.println("--------------------------------------------------------------------------------------------------");
	        	process = true;
	        }
	        dp.nextLine();
	    }
        dp.close();
	}
}
	

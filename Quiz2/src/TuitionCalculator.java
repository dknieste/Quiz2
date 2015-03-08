import java.util.Scanner;

/*
 * Author: Diana Knieste
 * Quiz 2: Tuition Costs
 * March 3, 2015
 */

public class TuitionCalculator {
	
//Asking the user for inputs 
	public static void main(String[] args) {
		double perc1, perc2, perc3;
		double init_cost = 12342;
		boolean bool = false;
		do {
			System.out
					.println("What is the percentage tuition increase going into year two? (In integer form please) ");
			Scanner scan = new Scanner(System.in);
			perc1 = scan.nextInt();
			System.out
					.println("What is the percentage tuition increase going into year three? ");
			Scanner scan2 = new Scanner(System.in);
			perc2 = scan2.nextInt();
			System.out
					.println("What is the percentage tuition increase going into year four? ");
			Scanner scan3 = new Scanner(System.in);
			perc3 = scan3.nextInt();
			double ans = totalCost(init_cost, perc1, perc2, perc3);
			System.out.printf(
					"The total cost of tuition to complete a degree is $%.2f",
					ans);
			System.out.println("\nAttempt Again? Yes or No ");
			Scanner scan5 = new Scanner(System.in);
			String bool_str = scan5.next();
			if (bool_str.equals("Yes")) {
				bool = true;
			} else {
				bool = false;
			}
		} while (bool);
	}

//The method that calculates the tuition using arguments of initial cost and % increases
	public static double totalCost(double init_cost, double perc1,
			double perc2, double perc3) {
		// First year cost
		double total_cost1 = init_cost;
		// Second year cost
		double total_cost2 = total_cost1 + total_cost1 * perc1 / 100;
		// Third year cost
		double total_cost3 = total_cost2 + total_cost2 * perc2 / 100;
		// Fourth year cost
		double total_cost4 = total_cost3 + total_cost3 * perc3 / 100;
		// Total cost
		double total_cost = total_cost1 + total_cost2 + total_cost3
				+ total_cost4;
		return total_cost;
	}
}

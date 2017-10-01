import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double price, pay, change = 0, convert, changeNew = 0;
		int changeReturned = 0;

/*		 User Story #1 The user is prompted asking for the price of the item.
		 */
		System.out.println("Price of the item:");
		price = keyboard.nextDouble();
		/*
		 * User Story #2 The user is then prompted asking how much money was tendered by
		 * the customer.
		 */
		System.out.println("Amount tendered:");
		pay = keyboard.nextDouble();
		/*
		 * User Story #3 Display an appropriate message if the customer provided too
		 * little money or the exact amount.
		 */
		do {
			if (price > pay) {
			System.out.println("Amount tendered not enough to pay for item.");
			}
			else if (price == pay) {
			System.out.println("Exact payment. No change required.");
			} 
		} while (price < pay); {
			change = pay - price;
			System.out.println("Change required:" + change);
			System.out.println(change);
			changeNew = change * 100;
		}
		System.out.println(changeNew);
		changeConverter((int) changeNew);
/*		switch ((int) changeNew) {
		case 'a':
			if (change > 2000) {
				twentyDol = (int) changeNew % 2000;
				if (twentyDol == 0) {
					System.out.println();
				} else {
					System.out.println(twentyDol + "Twenties");
				}
			}
		case 'b':
			if (change > 1000 && change < 2000) {
				tenDol = (int) changeNew % 1000;
				if (tenDol == 0) {
					System.out.println();
				} else {
					System.out.println(tenDol + "Tens");
				}
			}
		case 'c':
			if (change > 500 && change < 1000) {
				fiveDol = (int) changeNew % 1000;
				if (fiveDol == 0) {
					System.out.println();
				} else {
					System.out.println(fiveDol + "Fivers");
				}
			}
		case 'd':
			if (change > 100 && change < 500) {
				oneDol = (int) changeNew % 100;
				System.out.println(oneDol + "Singles");
			}
		case 'e':
			if (change > 25 && change < 100) {
				twentyFiveCen = (int) changeNew % 25;
				if (twentyFiveCen == 0) {
					System.out.println();
				} else {
					System.out.println(twentyFiveCen + "Quarters");
				}
			}
		case 'f':
			if (change > 10 && change < 25) {
				tenCen = (int) changeNew % 10;
				if (tenCen == 0) {
					System.out.println();
				} else {
					System.out.println(tenCen + "Dimes");
				}
			}
		case 'g':
			if (change > 5 && change < 10) {
				fiveCen = (int) changeNew % 5;
				System.out.println(fiveCen + "Nickles");
			}
		case 'h':
			if (change > 1 && change < 5) {
				oneCen = (int) changeNew % 1;
				System.out.println(oneCen + "Pennies");
			}
		default:
			System.out.println(changeNew);
			break;
		}*/

		/*
		 * User Story #4 If the amount tendered is more than the cost of the item,
		 * display the number of bills and coins that should be given to the customer.
		 * In order to display the number of bills/coins, it will be necessary to divide
		 * the amount by the denominations: converted into pennies: $20 25c 2500 25 $10
		 * 10c 1000 10 $5 5c 500 5 $1 1c 100 1
		 */
	}

	public static void changeConverter(int changeNew) {
		int choice = 0;
		int twentyDol, tenDol, fiveDol, oneDol;
		int twentyFiveCen, tenCen, fiveCen, oneCen;
		switch ((int) changeNew) {
		case 'a':
			if (changeNew > 2000) {
				twentyDol = (int) changeNew % 2000;
				if (twentyDol == 0) {
					System.out.println();
				} else {
					System.out.println(twentyDol + "Twenties");
				}
			}
			break;
		case 'b':
			if (changeNew > 1000 && changeNew < 2000) {
				tenDol = (int) changeNew % 1000;
				if (tenDol == 0) {
					System.out.println();
				} else {
					System.out.println(tenDol + "Tens");
				}
			}
		case 'c':
			if (changeNew > 500 && changeNew < 1000) {
				fiveDol = (int) changeNew % 1000;
				if (fiveDol == 0) {
					System.out.println();
				} else {
					System.out.println(fiveDol + "Fivers");
				}
			}
		case 'd':
			if (changeNew > 100 && changeNew < 500) {
				oneDol = (int) changeNew % 100;
				System.out.println(oneDol + "Singles");
			}
		case 'e':
			if (changeNew > 25 && changeNew < 100) {
				twentyFiveCen = (int) changeNew % 25;
				if (twentyFiveCen == 0) {
					System.out.println();
				} else {
					System.out.println(twentyFiveCen + "Quarters");
				}
			}
		case 'f':
			if (changeNew > 10 && changeNew < 25) {
				tenCen = (int) changeNew % 10;
				if (tenCen == 0) {
					System.out.println();
				} else {
					System.out.println(tenCen + "Dimes");
				}
			}
		case 'g':
			if (changeNew > 5 && changeNew < 10) {
				fiveCen = (int) changeNew % 5;
				System.out.println(fiveCen + "Nickles");
			}
		case 'h':
			if (changeNew > 1 && changeNew < 5) {
				oneCen = (int) changeNew % 1;
				System.out.println(oneCen + "Pennies");
			}
		default:
			System.out.println(changeNew);
			break;
		}

	}
}

/*
 * 
 * In the cash register we will calculate the amount of change returned to a
 * customer based on the purchase price and the amount tendered. We will also
 * notify the attendant how many of each piece of currency ($20 ,$10 ,$5 ,$1,
 * .25c, .10c, .05c, .01c) is needed to make the change for the customer.
 * 
 * Change should be provided using the largest bill and coin denominations as
 * possible. Denominations that are not used should not be displayed.
 * 
 * Hint: Mod operator
 * 
 * Grading
 * 
 * This is a graded project. You are expected to have your project completed by
 * the start of class on Monday morning.
 * 
 * You will be given either a pass or fail based on whether your code works
 * given all of the following test conditions:
 * 
 * Amount: .67, Tendered: .50, Result: Error message Amount: .67, Tendered:
 * 1.00, Result: 1 quarter, 1 nickel, 3 pennies. Amount: .59, Tendered: 1.00,
 * Result: 1 quarter, 1 dime, 1 nickel, 1 penny. Amount: 3.96, Tendered: 20.00,
 * Result: 1 ten dollar bill, 1 five dollar bill, 1 one dollar bill, 4 pennies.
 * Amount: any amount less than 20.00, Tendered: anything greater than amount: c
 * orrect denominations for correct change.
 * 
 * If the project does work with all of the above test conditions, you will be
 * given a 1 for this week's project.
 * 
 * If the project does not work with the above test conditions, you will be
 * given a 0 for this week's project.
 * 
 * If you get a zero on the project, you can upgrade to a score of .5 if you
 * turn in a working project by the start of class on the following Monday
 * morning AND notify an instructor that you wish to get partial credit.
 * 
 * To turn in a project, you must push it to GitHub. You must include a
 * README.md that describes how to run your program.
 */

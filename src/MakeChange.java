import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double price, pay, change = 0, convert, changeNew = 0;
		int changeReturned = 0;

		/*
		 * User Story #1 The user is prompted asking for the price of the item.
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
		if (price > pay) {
			System.out.println("Amount tendered not enough to pay for item.");
		} else if (price == pay) {
			System.out.println("Exact payment. No change required.");
		} else {
			change = pay - price;
			changeNew = change * 100;
			changeNew = (changeNew + 0.0005);
			System.out.println("Change required:" + change);
		}

		changeConverter((int) changeNew);

		/*
		 * User Story #4 If the amount tendered is more than the cost of the item,
		 * display the number of bills and coins that should be given to the customer.
		 * In order to display the number of bills/coins, it will be necessary to divide
		 * the amount by the denominations: converted into pennies: $20 25c 2500 25 $10
		 * 10c 1000 10 $5 5c 500 5 $1 1c 100 1
		 */
	}

	public static void changeConverter(int changeNew) {
		int twentyDol, tenDol, fiveDol, oneDol;
		int twentyFiveCen, tenCen, fiveCen, oneCen;
		twentyDol = (changeNew / 2000);
		twentyDol = twentyDol % 20;

		if (twentyDol == 0) {
			System.out.print("");
		} else {
			System.out.println("You will need this many $20s : " + twentyDol);
			changeNew %= 2000;
		}

		tenDol = (changeNew / 1000);
		tenDol = tenDol % 10;
		if (tenDol == 0) {
			System.out.print("");
		} else {
			System.out.println("You will need this many $10s : " + tenDol);
			changeNew %= 1000;
		}

		fiveDol = (changeNew / 500);
		if (fiveDol == 0) {
			System.out.print("");
		} else {
			System.out.println("You will need this many $5s : " + fiveDol);
			changeNew %= 500;
		}

		oneDol = (changeNew / 100);
		if (oneDol == 0) {
			System.out.print("");
		} else {
			System.out.println("You will need this many $1s : " + oneDol);
			changeNew %= 100;
		}

		twentyFiveCen = (changeNew / 25);
		if (twentyFiveCen == 0) {
			System.out.print("");
		}
		else {
			System.out.println("You will need this many quarters : " + twentyFiveCen);
			changeNew %= 25;
		}	
		
		tenCen = (changeNew / 10);
		if (tenCen == 0) {
			System.out.print("");
		}
		else {
			System.out.println("You will need this many dimes : " + tenCen);
			changeNew %= 10;
		}	
		
		fiveCen = (changeNew / 5);
		if (fiveCen == 0) {
			System.out.print("");
		}
		else {
			System.out.println("You will need this many nickles : " + fiveCen);
			changeNew %= 5;
		}	

		oneCen = (changeNew / 1);
		if (oneCen == 0) {
			System.out.print("");
		}
		else {
			System.out.println("You will need this many pennies : " + oneCen);
			changeNew %= 1;
		}	


	}
}

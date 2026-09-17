/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=================================================");
		System.out.println("            WELCOME RESTAURANT OWNER!            ");
		System.out.println("=================================================");
		System.out.print("What's the name of your restaurant? ");
		String restaurant = sc.nextLine();
		System.out.println(" ");
		System.out.print("What's your name? ");
		String name = sc.nextLine();
		System.out.println(" ");
		System.out.println("Great to see you, "+ name + "! Let's set up a menu for " + restaurant+"!");
		System.out.println("Tonight's menu has room for exactly 3 items. Let's go!");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("--- Item #1 ---");
		System.out.print("Item name: ");
		String ラメン = sc.nextLine();
		System.out.print("Price of "+ラメン+"($): ");
		double price1 = sc.nextDouble();
		System.out.print("How many "+ラメン+" would you like? ");
		double amount1 = sc.nextDouble();
		double steve1 = amount1 * price1 ;
		System.out.println("Added "+amount1+"x "+ラメン+" to your order! "+"("+steve1+")");
		System.out.println("--- Item #2 ---");
		System.out.print("Item name: ");
		String meet = sc.nextLine();
		String かつ = sc.nextLine();
		System.out.print("Price of "+かつ+" ($):");
		double price2 = sc.nextDouble();
		System.out.print("How many "+かつ+" would you like?");
		double amount2 = sc.nextDouble();
		double steve2 = amount2 * price2;
		System.out.println("Added "+amount2+"x "+かつ+" to your order! "+"("+steve2+")");
		System.out.println("--- Item #3 ---");
		String buns = sc.nextLine();
		System.out.print("Item name: ");
		String STEVE = sc.nextLine();
		System.out.print("Price of "+STEVE+" ($):");
		double price3 = sc.nextDouble();
	
		System.out.print("How many "+STEVE+" would you like? ");
		double amount3 = sc.nextDouble();
		double steve3 = amount3 * price3;
		System.out.println("Added "+amount3+"x"+STEVE+" to your order! "+"("+steve3+")");
		System.out.print("Nice choices! What tip percentage would you like to leave? (ex: 15, 18, 20): ");
		double tax = sc.nextDouble();
		double finaltax = (0.0975*(steve1+steve2+steve3));
		double finaltip = (tax*0.01)*((steve1+steve2+steve3));

		System.out.println("=================================================");
		System.out.println("              "+restaurant+" - Menu For Today");
		System.out.println("=================================================");
		System.out.println("Owner:"+name);
		System.out.println("-------------------------------------------------");
		System.out.println("Item                          Qty     Price      ");
		System.out.println("-------------------------------------------------");
		System.out.println(ラメン+"                         "+amount1+"      "+steve1);
		System.out.println(かつ+"                         "+amount2+"      "+steve2);
		System.out.println(STEVE+"                         "+amount3+"      "+steve3);
		System.out.println("-------------------------------------------------");
		System.out.println("Subtotal:                  "+(steve1+steve2+steve3));
		System.out.println("Tax "+"(" +finaltax+"):                 "+(finaltax));
		System.out.println("Tip:                          "+tax);
		System.out.println("Tip Amount:                  "+finaltip);
		System.out.println("=================================================");
		System.out.println("Total:                    $"+(finaltax+((steve1+steve2+steve3)+finaltax)));
		System.out.println("=================================================");

		

		
	


		

		



		



		
	}
}

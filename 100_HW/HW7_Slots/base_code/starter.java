/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("   a. If two numbers match, you double your money.");
		System.out.println("   b. If three numbers match, you triple your money.");
		System.out.println("   c. If none match, you lose your money.");
		System.out.println("THIS IS NOT RIGGED");
		int money = 100;
		while (true) {
			System.out.println("Do you want to play slot's (Yes,yes,Y,y):");
			String a = sc.nextLine();
			String monte = sc.nextLine();
			System.out.println("You have $"+money);
			System.out.println("How much money do you want to wager ");
			int wager = sc.nextInt();

			if (a.equals("Yes")||a.equals("yes")||a.equals("Y")){
				int num1 = (int)((Math.random()*11)+1);
				int num2 = (int)((Math.random()*11)+1);
				int num3 = (int)((Math.random()*11)+1);
				System.out.println("_______________________");
				System.out.println(" | "+num1+" | "+num2+" | "+num3+" |");
				System.out.println("_______________________");
				if ((num1==num2)||(num2==num3)||(num1==num3)){
					System.out.println("You got doubles");
					money = (money-wager) + (wager*2);
				}
				else if ((num1==num2)&&(num1==num3)){
					System.out.println("You got Triples");
					money = (money-wager) + (wager*3);

				}
				else {
					System.out.println("Better luck next time");
					money = money - wager;
				}
			}	
				
			else if (a.equals("y")){
				int num1 = (int)((Math.random()*11)+1);
				int num2 = (int)((Math.random()*11)+1);
				int num3 = (int)((Math.random()*11)+1);
				num1 = 10;
				num2 = 10;
				num3 = 10;
				System.out.println("_______________________");
				System.out.prinln(" | "+num1+" | "+num2+" | "+num3+" |");
				System.out.println("_______________________");
				if ((num1==num2)&&(num1==num3)){
					System.out.println("You got Triples");
					money = (money-wager) + (wager*3);

				}

			}

			else{
				System.out.println("Oh well I tried");
				System.out.println("You did something WRONG");
				break;
			}

			if (money>=1){
				System.out.println("you have "+money+" left to use");
			}

			else{
				System.out.println("Try again");
				break;
			}
		}
	}
}

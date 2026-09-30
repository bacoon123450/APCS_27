/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The goal of the game is to guess a word with two hints!");
		System.out.println("");
		int fred = (int)(Math.random()*3);
		if (fred == 0) {
			System.out.println("Its a food");
			System.out.print("What is your guess? ");
			String noemi = sc.nextLine();
			if ((noemi.equals("Burrito"))||(noemi.equals("burrito"))){
				System.out.println("good job you got it");
			}
			else {
				System.out.println("You sadly didn't guess right, here's another hint!");
				System.out.println("Its something you get at a mexican restruant!");
				String riley = sc.nextLine();
				if ((noemi.equals("Burrito"))||(noemi.equals("burrito"))){
					System.out.println("good job you got it");
				}
				else {
					System.out.println("You sadly didn't guess right. Try Again!");
				}
			}
			

		}
		if(fred == 1){
				System.out.println("Its a food");
			System.out.print("What is your guess? ");
			String david = sc.nextLine();
			if ((david.equals("Pizza"))||(david.equals("pizza"))){
				System.out.println("good job you got it");
			}
			else {
				System.out.println("You sadly didn't guess right, here's another hint!");
				System.out.println("Its something you get at a italian restruant!");
				String riley = sc.nextLine();
				if ((david.equals("Pizza"))||(david.equals("pizza"))){
					System.out.println("good job you got it");
				}
				else {
					System.out.println("You sadly didn't guess right. Try Again!");
				}
			
			}

		}
			
		
		if(fred == 2){
				System.out.println("Its a CVHS teachers last name");
			System.out.print("What is your guess? ");
			String zoe = sc.nextLine();
			if ((zoe.equals("Poole"))||(zoe.equals("poole"))){
				System.out.println("good job you got it");
			}
			else {
				System.out.println("You sadly didn't guess right, here's another hint!");
				System.out.println("They teach a computer class");
				String riley = sc.nextLine();
				if ((zoe.equals("Poole"))||(zoe.equals("poole"))){
					System.out.println("good job you got it");
				}
				else {
					System.out.println("You sadly didn't guess right. Try Again!");
				}
			
			}

		}
			
		
		
	}
}

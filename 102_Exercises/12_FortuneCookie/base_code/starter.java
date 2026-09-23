/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Do you want a fortune (yes or no): "); 
		String monte = sc.nextLine();
		if (monte.equals("yes")){
			int fred = (int) (Math.random()*10);
			if (fred == 1){
				System.out.println("You should say hello to more people");
			}
			if (fred == 2){
				System.out.println("You need a new friend");
			}
			if (fred == 3){
				System.out.println("Code a video game for fun");
			}
			if (fred == 4){
				System.out.println("Learn japanese and plan a vacation");
			}
			if (fred == 5){
				System.out.println("Tell others your deepest darkest secret");
			}
			if (fred == 6){
				System.out.println("Your friends have a grudge against you");
			}
			if (fred == 7){
				System.out.println("Your friends are talking behind your back");
			}
			if (fred == 8){
				System.out.println("Go touch grass or else");
			}
			if (fred == 9){
				System.out.println("You have summoned nothveratu now parish");
			}
			if (fred == 0){
				System.out.println("What is your favorite food");
				String jessica = sc.nextLine();
				System.out.println("Not good enough tell me your favorite starch");
				String lucy = sc.nextLine();
				System.out.println("You should not have said potato now parish");
				System.out.println("⚡️");
			}

		}
		if (monte.equals("no")){
			System.out.println("TOO BAD");
			int fred = (int) (Math.random()*10);
			if (fred == 1){
				System.out.println("Give Elwood an A");
			}
			if (fred == 2){
				System.out.println("Give Elwood an A");
			}
			if (fred == 3){
				System.out.println("Give Elwood an A");
			}
			if (fred == 4){
				System.out.println("Give Elwood an A");
			}
			if (fred == 5){
				System.out.println("Give Elwood an A");
			}
			if (fred == 6){
				System.out.println("Give Elwood an A");
			}
			if (fred == 7){
				System.out.println("Give Elwood an A");
			}
			if (fred == 8){
				System.out.println("Give Elwood an A");
			}
			if (fred == 9){
				System.out.println("Give Elwood an A");
			}
			if (fred == 0){
				System.out.println("Give Elwood an A");
				String ted = sc.nextLine();
				System.out.println("That should have said yes");
				String steve = sc.nextLine();
				System.out.println("If that was not an yes then you get lighting");
				System.out.println("⚡️");
			}
		}


		
	}
}

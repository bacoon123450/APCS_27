/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("I am thinking of a number from 1-1000");
		int fred = (int)((Math.random()*1001));
		System.out.println("What number Am i thinking of ");
		int monte = sc.nextInt();
		boolean steve = fred == monte;
		if (steve) {
			System.out.println("you cheated that is impossible, or you have god luck good job");
		}
		else if(fred>monte){
			System.out.println("Its higher");
			System.out.println("Becuase it was "+fred);
			
		}
		else if(fred<monte){
			System.out.println("Its lower");
			System.out.println("Becuase it was "+fred);
		
		}
		else{
			System.out.println("How did you even get this");
			System.out.println("Unless you didnt follow instructions");

		}
	}	
}
/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("What is your first name");
		Scanner sc = new Scanner (System.in);
		String text = sc.nextLine ();
		System.out.println("What is your age in days"); 
		int fred = sc.nextInt();
		System.out.println("What is your birthday month"); 
		int steve = sc.nextInt();
		System.out.println("What day is your birhtday on"); 
		int charles = sc.nextInt();
		System.out.println("What is your birthday year");
		int norm = sc.nextInt();
		System.out.println("how much is a buck fifty");
		double jessica = sc.nextDouble();
	}
}

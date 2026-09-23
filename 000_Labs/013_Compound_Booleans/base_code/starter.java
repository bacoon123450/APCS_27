/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("intput a number: ");
		int steve = sc.nextInt();
		System.out.print("intput a number: ");
		int fred = sc.nextInt();
		System.out.print("intput a number: ");
		int monte = sc.nextInt();
		if ((monte>fred)&&(monte>steve)){
			System.out.println(monte + " is the biggest");

		}
		if ((fred>monte)&&(fred>steve)){
			System.out.println(fred +" is the biggest");
			
		}
		if ((steve>monte)&&(steve>fred)){
			System.out.println(steve + " is the biggest");
			
		}
		if ((monte<fred)&&(monte<steve)){
			System.out.println(monte+" is the Smallest");

		}
		if ((fred<monte)&&(fred<steve)){
			System.out.println(fred+" is the Smallest");
			
		}
		if ((steve<monte)&&(steve<fred)){
			System.out.println(steve+" is the Smallest");
			
		}

	}	
}

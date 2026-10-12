/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("I am thinking of a number from 1-1000");
		int num1 =(int) ((Math.random() * 1001) + 1);
		while(true){
			int x=0;
			System.out.println("What is the number ");
			x = sc.nextInt();
			if (x>num1){
				System.out.println("Lower");
			}
			else if (x<num1){
				System.out.println("Higher");
			}
			else if (x==num1){
				System.out.println("You got it");
				break;
			}
		}



		
	}
}

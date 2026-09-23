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
		boolean monte = steve == fred;
		if (monte){
			System.out.println("The Values are equal ");
		
		}		
		if (!monte){
			System.out.println("The Values are not equal ");
		
		}	


		

	}
}

/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.print("what is your name ");
		Scanner sc = new Scanner(System.in);
		String nme = sc.nextLine();
		System.out.print("How many times Should we print your name ");
		int times = sc.nextInt();
		int x = 0;
		while(x==times){
			System.out.print(nme);
			x=x+1;

		}





		
	}
}

/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number and we'll print out every prime until that number:");
		int num = sc.nextInt();
		printPrime(num);
	}
	public static boolean checkPrime(int a){
		int x = 2;
		while (x < a){
			if (a%x != 0){
				return true;
			}
			x = x + 1; 
		}
		return false;
	}
	public static void printPrime(int a){
		int x = 1;
		while (x != a - 1){
			boolean z = checkPrime(x);
			if (z = true){
				System.out.println(x);
			}
			x ++;

		
		}
	}
	
}

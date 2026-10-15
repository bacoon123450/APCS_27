/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static int pow (int a, int b){
		int c = 1;
		int d = a;
		while (c < b){
			a = a * d;
			c=c+1;
		}
		return a;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("give me one number");
		int f = sc.nextInt();
		System.out.print("give me one number");
		int g = sc.nextInt();
		int e = pow(f,g);
		System.out.println(f +" to the power of"+ g + " = " + e );




		
	}
}

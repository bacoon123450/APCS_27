/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int x = (int)(Math.random() * 9);
		System.out.println("An integer between 0 and 9 is " + x);
		int y = (int)(Math.random() * 100+1);
		System.out.println("An integer between 1 and 100 is " + y);
		System.out.println("A double between 2.5 and 3.5 is " +((Math.random() * 3.5)+2.4));
		System.out.println("A double between 14 and 589 is " + ((Math.random() * 589)+14.5));


	}
}

/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int[] fred = new int[1000];
		int i = 0;
		while(i<1000){
			fred[i]=(int)(Math.random()*100000);
			i++;
		}
		int steve = 0;
		while (steve<1000){
			System.out.println(fred[steve]);
			steve++;
		}


		
	}
}

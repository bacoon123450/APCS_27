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
		for(int i = 0; i<1000; i++){
			fred[i]=(int)(Math.random()*100000);
			i++;
		}
		for(int steve = 0; steve<1000; steve++){
			System.out.println(fred[steve]);
			steve++;
		}


		
	}
}

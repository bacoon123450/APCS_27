/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int[] jessica = new int[(int)(((Math.random()*200)+51))];
		int fred = jessica.length;
		int min = Integer.MAX_VALUE;
		int max = 1;
		for(int i = 0; i<fred; i++){
			jessica[i] = (int)((Math.random()*100)+1);
			if(jessica[i] < min){
				min = jessica[i];
			}
			if(jessica[i]>max){
				max = jessica[i];
			}
		}
		int x =0;
		for(int i = 0; i<fred; i++){
			x = x+ jessica[i];
		}
		System.out.println(min);
		System.out.println(max);
		System.out.println(x/(fred));
		System.out.println(fred);



		
	}
}

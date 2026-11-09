/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf n1 = new PooleDwarf(randName(),(int)(Math.random()*99));
		PooleDwarf n2 = new PooleDwarf(randName(),(int)(Math.random()*99));
		PooleDwarf n3 = new PooleDwarf(randName(),(int)(Math.random()*99));
		PooleDwarf n4 = new PooleDwarf(randName(),(int)(Math.random()*99));
		PooleDwarf n5 = new PooleDwarf(randName(),(int)(Math.random()*99));
		PooleDwarf n6 = new PooleDwarf(randName(),(int)(Math.random()*99));
		PooleDwarf n7 = new PooleDwarf(randName(),(int)(Math.random()*99));
		String fred = n1.getName();
		int x = 1;
		if (fred.equals(n2.getName())){
			x++;
		}
		if (fred.equals(n3.getName())){
			x++;
		}
		if (fred.equals(n4.getName())){
			x++;
		}
		if (fred.equals(n5.getName())){
			x++;
		}
		if (fred.equals(n6.getName())){
			x++;
		}
		if (fred.equals(n7.getName())){
			x++;
		}
		System.out.println("There is "+ x +" of "+fred);

		
		


		
	}
}

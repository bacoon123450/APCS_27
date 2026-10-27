/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BankAccount x = new BankAccount();
		x.Printinfo();

		BankAccount annoying = new BankAccount("Jessica");
		annoying.Printinfo();
		BankAccount IG = new BankAccount("Fred",false,false,false);
		IG.Printinfo();
		BankAccount Jsis = new BankAccount("Elwood", true, true, true,100, "Ultimate black label awesome card", 6767);
		Jsis.Printinfo();
		




		
	}
}

/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	String level;
	Boolean info;
	boolean rich;
	boolean dept;
	int balance;
	String name;
	int BankAccount;

	// -------CONSTRUCTORS-------
	public BankAccount(){
		name = "unknown";
		rich = false;
		info = false;
		dept = false;
		balance = 0;
		level = "unknown";
		BankAccount = 0;
	}
	public BankAccount(String a){
		 name = a;
		 rich = false;
		 info = false;
		 dept = false;
		 balance = 0;
		 level = "unknown";
		 BankAccount = 0;
	}
	public BankAccount(String f,boolean b, boolean c,boolean d){
		 name = f;
		 rich = b;
		 dept = d;
		 info = c;
		 balance = 0;
		 level = "unknown";
		 BankAccount = 0;
	}
	public BankAccount(String z,boolean x, boolean y,boolean q,int j,String i,int p){
		 name = z;
		 rich = x;
		 info = y;
		 dept = q;
		 balance = j;
		 level = i;
		 BankAccount = p;
	}


	// -------METHODS-------
	public void Printinfo(){					// Prints all values of the Employee	
		System.out.println("------------------------------");
		System.out.println("Name" + name);
		if (rich == true){
			System.out.println("Thats a lot of cash");
		}
		if (info == true){
			System.out.println("Do you have an account with us: yes");
		}
		else{
			System.out.println("Do you have an account with us: no");

		}
		System.out.println("Do you have dept: " + dept);
		System.out.println("Current balance" + balance);
		System.out.println("You have a level card of:" + level);
		if (level.equals("Ultimate black label awesome card")){
			System.out.println("Welll come back estiemed ultimate owner");
		}
		System.out.println("Social secutriy number" + BankAccount);
		System.out.println("------------------------------");
		System.out.println("");
	}

}
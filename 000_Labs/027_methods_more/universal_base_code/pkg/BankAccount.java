/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	String level;
	int deposit;
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
		balance = (int)((Math.random()*1000000000)+1);
		level = "unknown";
		BankAccount = 0;
	}
	public BankAccount(String a){
		 name = a;
		 rich = false;
		 info = false;
		 dept = false;
		 balance = (int)((Math.random()*1000000000)+1);
		 level = "unknown";
		 BankAccount = 0;
	}
	public BankAccount(String f,int y ){
		 name = f;
		  rich = false;
		 info = false;
		 balance = (int)((Math.random()*1000000000)+1);
		 deposit = y;
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
	public void checkBalance(){
		System.out.println("Your balance is "+balance);
	}
	public void displayAccountInfo(){
		System.out.println("------------------------------");
		System.out.println("Name" + name);
		System.out.println("Do you have dept: " + dept);
		System.out.println("Current balance" + balance);
		System.out.println("You have a level card of:" + level);
		System.out.println("Social secutriy number" + BankAccount);
		System.out.println("------------------------------");
		System.out.println("");
	}
	public void Printinfo(){					// Prints all values of the Employee	
		System.out.println("------------------------------");
		System.out.println("Name" + Owner);
		System.out.println("Your deposit is : $" + deposit);
		System.out.println("Current balance :" + balance+deposit);
		System.out.println("Social secutriy number" + BankAccount);
		System.out.println("------------------------------");
		System.out.println("");
	}

}
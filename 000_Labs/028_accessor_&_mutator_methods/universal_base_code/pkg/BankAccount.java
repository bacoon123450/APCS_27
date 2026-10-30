/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	String owner;
	double balance;
	boolean Active ;
	// -------CONSTRUCTORS-------
	public BankAccount(){
		owner = "unkown";
		balance = 0.0;
		Active = false;
	}
	public BankAccount(String a){
		owner = a;
		balance = 0.0;
		Active = true;
	}
	public BankAccount(String a, double b){
		owner = a;
		balance = b;
		Active = true;
	}

	// -------METHODS-------
	public double deposit(double a){
		balance = balance + a;
	}
	public void displayAccountInfo(){
		System.out.println("Owner Name: "+owner);
		System.out.println("Balance: "+balance);
		System.out.println("Acount active? : "+Active);
	}
	public String getOwner(){
		return owner;
	}
	public String setOwner(String a){
		owner = a;
	}
	public double GetBalance(){
		return balance;
	}
	public String closeAccount(){
		owner = " ";
		balance = 0.0;
		Active = false;

	}
	public boolean isActive(){
		if (Active == true ){
			return true;
		}
		else {
			return false;
		}
	}



}
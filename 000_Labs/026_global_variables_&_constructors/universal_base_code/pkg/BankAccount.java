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
	public BankAccount(String f,boolean b, boolean c,boolean d,){
		 name = f;
		 rich = b;
		 info = c;
		 dept = d;
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

}
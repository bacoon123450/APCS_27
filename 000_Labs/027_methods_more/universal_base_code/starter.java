/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		System.out.println("---------------------------------");
		System.out.println("Welcome to the time machine ATM");
		System.out.println("Access your acount");
		Scanner sc = new Scanner(System.in);
		System.out.println("Name(type nothing to skip):");
		String monte = sc.nextLine();
		System.out.println("Deposit (type 0 to skip):");
		int num = sc.nextInt();
		if ((num == 0)&&(monte.equals(""))){
			BankAccount account = new BankAccount();
			account.Printinfo();
		}
		else if (num == 0){
			BankAccount account = new BankAccount(monte);
			account.Printinfo();
		}
		else{
			BankAccount account = new BankAccount(monte,num);
			account.Printinfo();
		}
		while (true){
			System.out.println("Anything else");
			System.out.println("1. Again");
			System.out.println("2. Exit");
			int anwser = sc.nextInt();
			if(anwser==2){
				break;
			}
			else{
				System.out.println("Access your acount");
				System.out.println("Name(type nothing to skip):");
				String fred = sc.nextLine();
				System.out.println("Deposit (type 0 to skip):");
				int num2 = sc.nextInt();
				if ((num2 == 0)&&(fred.equals(""))){
					BankAccount account = new BankAccount();
					account.Printinfo();
					
				}
				else if (num2 == 0){
					BankAccount account = new BankAccount(monte);
					account.Printinfo();
				}
				else{
					BankAccount account = new BankAccount(monte,num);
					account.Printinfo();
				}
			
			}
		}
	}
}		
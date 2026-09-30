/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me one integer: ");
		int monte = sc.nextInt();
		System.out.println("Give me another integer: ");
		int fred = sc.nextInt();
		boolean jessica = fred%2 == 0;
		boolean riley = monte%2 == 0;
		if (jessica){
			System.out.println(fred+" is divisble by 2 so it even");
			boolean george = fred%3 == 0;
			if (george){
				System.out.println(fred+" is divisble by 3!");

				
			}
			else {
				System.out.println(fred+" is not divisble by 3!");
			}
		
			boolean debra = fred%4 == 0;
			if (debra){
				System.out.println(fred+" is divisble by 4!");
				
				
			}
			else {
				System.out.println(fred+" is not divisble by 4!");
			}
			boolean ben = fred%5 == 0;
			if (ben){
				System.out.println(fred+" is divisble by 5!");
				
				
			}
			else {
				System.out.println(fred+" is not divisble by 5!");
			}
		}
		else {
			System.out.println(fred+" is not divisble by 2");
			boolean george = fred%3 == 0;
			if (george){
				System.out.println(fred+" is divisble by 3!");

				
			}
			else {
				System.out.println(fred+" is not divisble by 3!");
			}
		
			boolean debra = fred%4 == 0;
			if (debra){
				System.out.println(fred+" is divisble by 4!");
				
				
			}
			else {
				System.out.println(fred+" is not divisble by 4!");
			}
			boolean ben = fred%5 == 0;
			if (ben){
				System.out.println(fred+" is divisble by 5!");
				
				
			}
			else {
				System.out.println(fred+" is not divisble by 5!");
			}
		}
		if (riley){
			System.out.println(monte+" is divisble by 2 So its even");
			boolean george = monte%3 == 0;
			if (george){
				System.out.println(monte+" is divisble by 3!");

				
			}
			else {
				System.out.println(monte+" is not divisble by 3!");
			}
		
			boolean debra = monte%4 == 0;
			if (debra){
				System.out.println(monte+" is divisble by 4!");
				
				
			}
			else {
				System.out.println(monte+" is not divisble by 4!");
			}
			boolean ben = monte%5 == 0;
			if (ben){
				System.out.println(monte+" is divisble by 5!");
				
				
			}
			else {
				System.out.println(monte+" is not divisble by 5!");
			}
		}
		else {
			System.out.println(monte+" is not divisble by 2");
			boolean george = monte%3 == 0;
			if (george){
				System.out.println(monte+" is divisble by 3!");
			}
			else {
				System.out.println(monte+" is not divisble by 3!");
			}
		
			boolean debra = monte%4 == 0;
			if (debra){
				System.out.println(monte+" is divisble by 4!");
				
				
			}
			else {
				System.out.println(monte+" is not divisble by 4!");
			}
			boolean ben = monte%5 == 0;
			if (ben){
				System.out.println(monte+" is divisble by 5!");
				
				
			}
			else {
				System.out.println(monte+" is not divisble by 5!");
			}
		}
		
	}
}

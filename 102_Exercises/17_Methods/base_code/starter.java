/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/
import java.util.Scanner;
import java.util.Random;


class starter {
	public static boolean isLeapYear (int a){
		boolean fred = (a%4 == 0) && (a%400 !=0);
		return fred;

			
	}
	public static int getDigitSum(int a){
		int e = a%10;
		int l = (a/10)%10;
		int w = (a/100)%10;
		int o= (a/10000)%10;
		int n = (a/1000)%10;
		int d = e+l+w+o+o;
		return d;
	}
	public static void printIfConsecutive(int a, int b, int c){
		if ((a == b -1)&&(b == c-1)) {

		}
		else{
			
		}
		
	}


	public static void main(String args[]) {
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		System.out.println();
		
		if(isLeapYear(year))
			System.out.println(year + " is a leap year!");
		else
			System.out.println(year + " is not a leap year!");

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a 5 digit number");
		int number = sc.nextInt();
		int sum = getDigitSum(number);
		
		System.out.println();
		System.out.println("The sum of the digits of " + number + " is " + sum);

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println("Enter a number");
		int num2 = sc.nextInt();
		System.out.println("Enter a number");
		int num3 = sc.nextInt();
		System.out.println();
		printIfConsecutive(num1, num2, num3);
		System.out.println();
		System.out.println("----------------------------------------");
	}
}

/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you a Wizard, Warrior or a Rogure");
		String fred = sc.nextLine();
		if ((fred.equals("Warrior"))||(fred.equals("warrior"))){
			System.out.println("Wow a warrior but you would still loose to steve the barbarian");
		}
		else if ((fred.equals("Wizard"))||(fred.equals("wizard"))){
			System.out.println("Cool a wizrd but you would still loose to steve the barbarian");
		}
		else if ((fred.equals("Rogue"))||(fred.equals("rogue"))){
			System.out.println("Sick you are rogue you might have a chance against steve the barbarian");
		}
		else {
			System.out.println("Wow i even gave you the spelling");
		}
	}
}

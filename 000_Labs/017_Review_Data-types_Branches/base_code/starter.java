/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you a Wizard, Warrior or a Rogue");
		String fred = sc.nextLine();
		if ((fred.equals("Warrior"))||(fred.equals("warrior"))){
			System.out.println("Wow a warrior");
			System.out.print("whats your name ");
			String monte = sc.nextLine();
			System.out.print("whats your title ");
			String jessica = sc.nextLine();
			System.out.println("You have 20 points use them wisely");
			System.out.print("whats your strength ");
			int stength = sc.nextInt();
			System.out.println("You have "+(20-stength)+" Points left");
			System.out.print("whats your dexterity ");
			int Dexterity = sc.nextInt();
			System.out.println("You have "+(20-stength-Dexterity)+" Points left");
			System.out.print("whats your Charisma ");
			int Charisma = sc.nextInt();
			System.out.println("You have "+(20-stength-Dexterity-Charisma)+" Points left");
			System.out.print("whats your Intelligence ");
			int intelligence = sc.nextInt();
			if ((Charisma+Dexterity+stength+intelligence==20)){
				System.out.println("Good gob you did it correctly");
				System.out.println("So let me get this straight your name is "+ monte);
				System.out.println("Your title is "+ jessica);
				System.out.println("Your strength is: " + stength);
				System.out.println("Your Dexterity is: " + Dexterity);
				System.out.println("Your Charisma is: " + Charisma);
				System.out.println("Your Intelligence is: " + intelligence);
				System.out.println("And your a warrior that's some impressive stats");

			
			}
			else {
				System.out.println("You didnt use "+(20-stength-Dexterity-Charisma-intelligence)+"points so like here are your stats");
				System.out.println("So let me get this straight your name is "+ monte);
				System.out.println("Your title is "+ jessica);
				System.out.println("Your strength is: " + stength);
				System.out.println("Your Dexterity is: " + Dexterity);
				System.out.println("Your Charisma is: " + Charisma);
				System.out.println("Your Intelligence is: " + intelligence);
				System.out.println("And your a warrior");
				System.out.println("LOWK you could have been stronger");

			}
		}
		else if ((fred.equals("Wizard"))||(fred.equals("wizard"))){
			System.out.println("Cool a wizrd");
			System.out.print("whats your name ");
			String monte = sc.nextLine();
			System.out.print("whats your title ");
			String jessica = sc.nextLine();
			System.out.println("You have 20 points use them wisely");
			System.out.print("whats your strength ");
			int stength = sc.nextInt();
			System.out.println("You have "+(20-stength)+" Points left");
			System.out.print("whats your dexterity ");
			int Dexterity = sc.nextInt();
			System.out.println("You have "+(20-stength-Dexterity)+" Points left");
			System.out.print("whats your Charisma ");
			int Charisma = sc.nextInt();
			System.out.println("You have "+(20-stength-Dexterity-Charisma)+" Points left");
			System.out.print("whats your Intelligence ");
			int intelligence = sc.nextInt();
			if ((Charisma+Dexterity+stength+intelligence==20)){
				System.out.println("Good gob you did it correctly");
				System.out.println("So let me get this straight your name is "+ monte);
				System.out.println("Your title is "+ jessica);
				System.out.println("Your strength is: " + stength);
				System.out.println("Your Dexterity is: " + Dexterity);
				System.out.println("Your Charisma is: " + Charisma);
				System.out.println("Your Intelligence is: " + intelligence);
				System.out.println("And your a wizard that's some impressive stats");

			
			}
			else {
				System.out.println("You didnt use "+(20-stength-Dexterity-Charisma-intelligence)+"points so like here are your stats");
				System.out.println("So let me get this straight your name is "+ monte);
				System.out.println("Your title is "+ jessica);
				System.out.println("Your strength is: " + stength);
				System.out.println("Your Dexterity is: " + Dexterity);
				System.out.println("Your Charisma is: " + Charisma);
				System.out.println("Your Intelligence is: " + intelligence);
				System.out.println("And your a wizard");
				System.out.println("LOWK you could have been stronger");

			}
		}
		else if ((fred.equals("Rogue"))||(fred.equals("rogue"))){
			System.out.println("Sick you are rogue");
			System.out.print("whats your name ");
			String monte = sc.nextLine();
			System.out.print("whats your title ");
			String jessica = sc.nextLine();
			System.out.println("You have 20 points use them wisely Max 10 for each i am trusting you");
			System.out.print("whats your strength ");
			int stength = sc.nextInt();
			System.out.println("You have "+(20-stength)+" Points left");
			System.out.print("whats your dexterity ");
			int Dexterity = sc.nextInt();
			System.out.println("You have "+(20-stength-Dexterity)+" Points left");
			System.out.print("whats your Charisma ");
			int Charisma = sc.nextInt();
			System.out.println("You have "+(20-stength-Dexterity-Charisma)+" Points left");
			System.out.print("whats your Intelligence ");
			int intelligence = sc.nextInt();
			if ((Charisma+Dexterity+stength+intelligence==20)){
				System.out.println("Good gob you did it correctly");
				System.out.println("So let me get this straight your name is "+ monte);
				System.out.println("Your title is "+ jessica);
				System.out.println("Your strength is: " + stength);
				System.out.println("Your Dexterity is: " + Dexterity);
				System.out.println("Your Charisma is: " + Charisma);
				System.out.println("Your Intelligence is: " + intelligence);
				System.out.println("And your a rogue that's some impressive stats");

			
			}
			else {
				System.out.println("You didnt use "+(20-stength-Dexterity-Charisma-intelligence)+"points so like here are your stats");
				System.out.println("So let me get this straight your name is "+ monte);
				System.out.println("Your title is "+ jessica);
				System.out.println("Your strength is: " + stength);
				System.out.println("Your Dexterity is: " + Dexterity);
				System.out.println("Your Charisma is: " + Charisma);
				System.out.println("Your Intelligence is: " + intelligence);
				System.out.println("And your a rogue");
				System.out.println("LOWK you could have been stronger");

			}

		}
		else {
			System.out.println("Wow i even gave you the spelling");
		}
	}
}

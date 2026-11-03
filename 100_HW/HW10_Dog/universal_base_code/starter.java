/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog a = new Dog("Lewis");
		a.setAge(9);
		Dog b = new Dog("Kimi", "golden retriever");
		boolean y = false;
		if ((a.isSleeping())== true){
			a.bark();
			y = true;
		}
		if (((b.isSleeping())== false)&&(y == true)){
			b.bark();
		}
		if ((b.isSleeping())== true&&(y == true)){
			b.bark();
		}


		



	}
}
// Main:
// - Create two dogs.
//    - Create the first dog with a name. Then set the age to something
//    - Create the second dog with a name and a breed.
// - Check if the first dog is sleeping.
//    - If it's sleeping, print out it's asleep
//    - If it's awake, bark!
// - Then for the second dog, check if it's sleeping.
//    - If it's sleeping, and the first dog barks, make it bark. Otherwise it does nothing.
//    - If it's awake and the first dog barks, make it bark. Otherwise it does nothing.}

// Please submit the starter.java and Dog.java files individually (not compressed together).

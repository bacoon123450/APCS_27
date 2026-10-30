/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Spiderman tobey = new Spiderman("Tobey Maguire", 48, "Green Goblin");
		Spiderman Andrew = new Spiderman("Andrew Garfield", 40, "Electro");
		Spiderman Tom = new Spiderman("Tom Holland", 27, "The vulture");
		Spiderman Poole = new Spiderman("Poolederman", 29, "His students");
		Spiderman jessica = new Spiderman("Imagine");
		tobey.fight();
		tobey.printArt();
		Andrew.fight();
		Andrew.printArt();
		Tom.fight();
		Tom.printArt();
		Poole.fight();

		
	}
}

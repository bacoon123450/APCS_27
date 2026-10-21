/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Put in individual letters for me to encode P.S say stop to stop");
		String encoded = " ";
		String decoded = " ";
		int num = 1;
		while (true){
			String z = "";
			System.out.println("letter number "+num);
			String x = sc.nextLine();
			if ((x.equals("a"))||x.equals("A")){
				z = "b";
			}
			else if ((x.equals("b"))||x.equals("B")){
				z = "c";
			}
			else if ((x.equals("c"))||x.equals("C")){
				z = "d";
			}
			else if ((x.equals("d"))||x.equals("D")){
				z = "8";
			}
			else if ((x.equals("e"))||x.equals("E")){
				z = "5";
			}
			else if ((x.equals("f"))||x.equals("F")){
				z = "e";
			}
			else if ((x.equals("g"))||x.equals("G")){
				z = "67";
			}
			else if ((x.equals("h"))||x.equals("H")){
				z = "8";
			}
			else if ((x.equals("i"))||x.equals("I")){
				z = "3";
			}
			else if ((x.equals("j"))||x.equals("J")){
				z = "2";
			}
			else if ((x.equals("k"))||x.equals("K")){
				z = "1";
			}
			else if ((x.equals("l"))||x.equals("L")){
				z = "o";
			}
			else if ((x.equals("m"))||x.equals("M")){
				z = "k";
			}
			else if ((x.equals("n"))||x.equals("N")){
				z = "m";
			}
			else if ((x.equals("o"))||x.equals("O")){
				z = "n";
			}
			else if ((x.equals("p"))||x.equals("P")){
				z = "r";
			}
			else if ((x.equals("q"))||x.equals("Q")){
				z = "p";
			}
			else if ((x.equals("r"))||x.equals("R")){
				z = "q";
			}
			else if ((x.equals("s"))||x.equals("S")){
				z = "u";
			}
			else if ((x.equals("t"))||x.equals("T")){
				z = "s";
			}
			else if ((x.equals("u"))||x.equals("U")){
				z = "t";
			}
			else if ((x.equals("v"))||x.equals("V")){
				z = "w";
			}
			else if ((x.equals("w"))||x.equals("W")){
				z = "x";
			}
			else if ((x.equals("x"))||x.equals("X")){
				z = "v";
			}
			else if ((x.equals("y"))||x.equals("Y")){
				z = "y";
			}
			else if ((x.equals("z"))||x.equals("Z")){
				z = "a";
			}
			else if (x.equals(" ")){
				z = " ";
			}
			else if ((x.equals("stop"))||(x.equals("Stop"))) {
				break;
			}
			else{
				break;
			}
			encoded = encoded + z;
			decoded = decoded + x;
			num = num + 1;

		}
		System.out.println(encoded);
		System.out.println(decoded);
		while (true){
			System.out.println("What should i encode (say stop)");
			String input = sc.nextLine();
			if (input.equals("stop")){
				break;
			}
			else{
				System.out.println("is their a key");
				String yes = sc.nextLine();
				if (yes.equals("yes")){
					System.out.println("What key");
					int num2 = sc.nextInt();
					System.out.println(Cipher.keyedEncode(input,num2));
				}
				else{
					System.out.println(Cipher.encode(input));
				}
			}

		}


	
	

	
		
		

	}
}

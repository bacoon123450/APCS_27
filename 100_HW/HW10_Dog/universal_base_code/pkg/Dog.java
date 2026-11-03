package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String dogName;
	int age;
	String breed;
	public Dog() {
		dogName = "Clifford";
		age = 3;
		breed = "big red dog";
		
	}
	public Dog(String a) {
		dogName = a;
		age = 1;
		breed = "dog dog";
		
	}
	public Dog(String a, String b) {
		dogName = a;
		age = 1;
		breed = b;
		
	}
	public Dog(String a, int b) {
		dogName = a;
		age = b;
		breed = "dog dog";
		
	}
	public Dog(String a, int b, String c) {
		dogName = a;
		age = b;
		breed = c;
		
	}
	public void setName(String q){
		dogName = q;
	}
	public void setBreed(String q){
		breed = q;
	}
	public void setAge(int q){
		age = q;
	}
	public void getName(){
		System.out.println("Name: "+dogName);
	}
	public void getAge(){
		System.out.println("Age: " + age);
	}
	public void getBreed(){
		System.out.println("Dog's breed: " + breed);
	}
	public boolean isSleeping(){
		int x = (int)(Math.random()*2);
		if (x == 1){
			return true;
		}
		else {
			return false;
		}
	}
	public void bark(){
		System.out.println(dogName + " Barks loudly");
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

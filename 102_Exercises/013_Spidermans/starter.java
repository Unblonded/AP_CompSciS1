/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Spiderman test = new Spiderman("Bob");
		test.setAge(1);
		test.setVillain("Joe");
		
		Spiderman two = new Spiderman("Tobey Maguire", 49, "Green Goblin");
		
		Spiderman three = new Spiderman("Andrew Garfeild", 41);
		three.setVillain("Electro");
		
		System.out.println("The villain is " + three.getVillain());
	}
}

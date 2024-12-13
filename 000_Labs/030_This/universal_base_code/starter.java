/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		PooleDwarf pd1 = new PooleDwarf(randName(), (int)(Math.random()*100));
		PooleDwarf pd2 = new PooleDwarf(randName(), (int)(Math.random()*100));
		PooleDwarf pd3 = new PooleDwarf(randName(), (int)(Math.random()*100));
		PooleDwarf pd4 = new PooleDwarf(randName(), (int)(Math.random()*100));
		PooleDwarf pd5 = new PooleDwarf(randName(), (int)(Math.random()*100));
		PooleDwarf pd6 = new PooleDwarf(randName(), (int)(Math.random()*100));
		PooleDwarf pd7 = new PooleDwarf(randName(), (int)(Math.random()*100));
		
		if (pd1.getName() == pd2.getName())
			System.out.println("1 and 2 have the same name, " + pd1.getName());
		
		if (pd1.getName() == pd3.getName())
			System.out.println("1 and 3 have the same name, " + pd1.getName());
			
		if (pd1.getName() == pd4.getName())
			System.out.println("1 and 4 have the same name, " + pd1.getName());
			
		if (pd1.getName() == pd5.getName())
			System.out.println("1 and 5 have the same name, " + pd1.getName());
			
		if (pd1.getName() == pd6.getName())
			System.out.println("1 and 6 have the same name, " + pd1.getName());
			
		if (pd1.getName() == pd7.getName())
			System.out.println("1 and 7 have the same name, " + pd1.getName());
	}
}

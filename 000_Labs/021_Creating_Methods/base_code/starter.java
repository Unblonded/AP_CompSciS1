/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void toString(String a)
	{
		System.out.println(a);
	}
	public static void toStringCombined(String a, String b)
	{
		System.out.println(a + " " + b);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Sentence: ");
		String sent1 = sc.nextLine();
		
		System.out.print("Enter a Sentence: ");
		String sent2 = sc.nextLine();
		
		toStringCombined(sent1, sent2);
		toString(sent1);
		toString(sent2);
	}
}

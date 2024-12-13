/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int [] numbers = new int[20];
		int dupe = (int)((Math.random() *9) + 1);
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)((Math.random() *9) + 1);
			System.out.print(numbers[i]+" ");
		}
		System.out.println("");
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == dupe) {
				System.out.println("Found Duplicate Number of " + dupe + " at index " + i);
			}
		}
		
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i-1] == numbers[i]) {
				System.out.println("Found Duplicate Consecutive Number of " + numbers[i] + " at index " + (int)(i-1) + " and " + i);
			}
		}
	}
}

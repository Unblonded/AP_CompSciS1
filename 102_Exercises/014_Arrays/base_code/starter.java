/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		int[] array1 = new int[1000];
		int[] array2 = new int[1000];
		
		for(int i = 0; i < array1.length; ++i) {
			array1[i] = (i + 1) * 3;
		}
		
		for(int i = 0; i < array1.length; ++i) {
			System.out.println(array1[i]);
		}
		
		
		for(int i = 0; i < array2.length; ++i) {
			array2[i] = 1000 - i;
		}
		
		for(int i = 0; i < array2.length; ++i) {
			System.out.println(array2[i]);
		}
	}
}

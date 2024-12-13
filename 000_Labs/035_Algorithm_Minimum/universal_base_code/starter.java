/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int[] arr = new int[(int)(51 + (Math.random() * 149))];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int avg = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(1 + Math.random() * 200);
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			avg += arr[i];
		}
		avg = avg / arr.length;
		
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
		System.out.println("Avarage: " + avg);
		System.out.println("Array Length: " + arr.length);
	}
}

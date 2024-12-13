/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr = new int[100];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		
		toStringArray(arr);
		System.out.println(getArrayAverage(arr));
		System.out.println(getArrayMax(arr));
		System.out.println(getArrayMin(arr));

		
	}
	
	public static void toStringArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");
	}
	
	public static int getArrayAverage(int[] array) {
		int avg = 0;
		for (int i = 0; i < array.length; i++) {
			avg += array[i];
		}
		return avg /= array.length;
	}
	
	public static int getArrayMax(int[] array) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	public static int getArrayMin(int[] array) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
}

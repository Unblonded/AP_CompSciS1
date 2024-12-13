/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number to get all primes before it-> ");
		printPrimes(sc.nextInt());
	}
	
	public static boolean checkPrime(int num) {
		for (int i = 2; i < num; ++i) {
      		if (num % i == 0)
        		return false;
		}
		return true;
	}
	
	public static void printPrimes(int maxVal) {
		for (int i = 2; i < maxVal; i++) {
			if (checkPrime(i))
				System.out.println(i);
		}
	}
}

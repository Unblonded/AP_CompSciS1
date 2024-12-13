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
		System.out.print("Enter a string to decode/encode: ");
		String cipher = sc.nextLine();
		System.out.print("Enter the key to the cipher: ");
		int key = sc.nextInt();
		System.out.println("-------------------------------------");
		System.out.print(Cipher.keyedEncode(cipher, key));
	}
}

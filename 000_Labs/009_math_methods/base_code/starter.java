/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println(Math.max(13 - 6 * 11, 30 % 7 * (-2)));
        System.out.println(Math.sqrt(3 * 8 + 31 % 7));
        System.out.println(Math.pow(37 / 3, 35 % 21));
        System.out.println(Math.max(Math.pow(2, 14 % 3), Math.sqrt(2 * 6)));
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Input Double Value X: ");
        double varX = scan.nextDouble();
        System.out.print("Input Double Value Y: ");
        double varY = scan.nextDouble();
        
        System.out.println("Max X and Y: " + Math.max(varX,varY));
        System.out.println("Square Root of Y: " + Math.sqrt(varY));
        System.out.println("Power X^Y: " + Math.pow(varX,varY));
	}
}

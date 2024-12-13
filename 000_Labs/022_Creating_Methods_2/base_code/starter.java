/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static int Pow(int base, int power)
	{
	    int result = 1;
	    int cycle = 0;
	    while (true)
	    {
	    	if (cycle == power)
	    		break;
	    	cycle ++;
	    	result *= base;
	    }
	    return result;
	}

	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Base: ");
		int x = sc.nextInt();
		System.out.print("Enter Power: ");
		int y = sc.nextInt();
		
		
		System.out.println(Pow(x, y));
	}
}

/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter An Integer: ");
		int x = sc.nextInt();
		System.out.print("Enter Another Integer: ");
		int y = sc.nextInt();
		
		System.out.println("\n");
		
		if (x%2 == 0)
		    System.out.println(x+" Is divisible by 2");
		else
		    System.out.println(x+" Is not divisible by 2");
		    
		if (x%3 == 0)
	        System.out.println(x+" Is divisible by 3");
	        
	    else if (x%4 == 0)
	        System.out.println(x+" Is divisible by 4");
	    
	    else if (x%5 == 0)
	        System.out.println(x+" Is divisible by 5");
	    
	    else 
	        System.out.println(x+ " Is not divisible by 3, 4, or 5!");
		    
		System.out.println("\n");  
		  
		   
		if (y%2 == 0)
		    System.out.println(y+" Is divisible by 2");
		else
		    System.out.println(y+" Is not divisible by 2");
		
		if (y%3 == 0)
	        System.out.println(y+" Is divisible by 3");
	        
	    else if (y%4 == 0)
	        System.out.println(x+" Is divisible by 4");
	        
	    else if (y%5 == 0)
	        System.out.println(y+" Is divisible by 5");
	        
	    else 
	        System.out.println(y+ " Is not divisible by 3, 4, or 5!");
	}
}
/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Put a sentence below:");
		String sent = sc.nextLine();
		
		
		String out = "";
		int index = 0;
		for (int i = 0; i < sent.length(); i++) {
            String letter = sent.substring(i, i+1);

            if (letter.equals(" ")) {
                out += " ";
                index = 0;
            } else {
            	if (index % 2 == 0) {
            		out += letter.toLowerCase();
            	} else {
            		out += letter.toUpperCase();
            	}
                index++;
            }
        }
		
		System.out.println("Sponge Case Output:\n" + out);
	}
}

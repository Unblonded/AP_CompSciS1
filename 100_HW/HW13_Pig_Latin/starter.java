/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.*;

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        System.out.println("Please enter a sentence: ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine() + " ";
        System.out.println("Here's your sentence in Pig Latin:");

        while (sentence.indexOf(" ") != -1) {
            String word = sentence.substring(0, sentence.indexOf(" "));
            sentence = sentence.substring(sentence.indexOf(" ") + 1);

            if (word.length() == 1) {
                System.out.print(word + "-way ");
            } else if (isVouwl(word.substring(0, 1))) {
                System.out.print(word + "-way ");
            } else {
                if (isVouwl(word.substring(1, 2))) {
                    System.out.print(word.substring(1) + "-" + word.substring(0, 1) + "ay ");
                } else if (word.length() == 2) {
                    System.out.print(word + "-ay ");
                } else {
                    System.out.print(word.substring(2) + "-" + word.substring(0, 2) + "ay ");
                }
            }
        }
    }
    
    public static boolean isVouwl(String letter) {
        String[] vowels = new String[]{"a", "e", "i", "o", "u"};
        
        for (int i = 0; i < vowels.length; i++) {
            if (letter.toLowerCase().equals(vowels[i]))
            {
                return true;
            }
        }
        
        return false;
    }
}
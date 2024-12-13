import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("After your cruise ship crashes due to a storm you end up on a deserted island");
        System.out.println("What would you like to do to survive");
        System.out.println("1. Explore the Jungle: You decide to venture into the dense jungle, drawn by the sounds of exotic wildlife and the promise of hidden secrets. As you walk, you notice unusual plants and hear whispers in the wind.");
        System.out.println("2. Investigate the Smoke: You choose to follow the path along the beach toward the smoke. As you approach, you see a flickering fire and silhouettes of figures moving around it. Curiosity pushes you closer.");
        System.out.println("3. Search the Ruins: Instead of following either path, you decide to explore the ancient ruins nearby. Crumbling stones and carvings hint at a long-lost civilization. You wonder what treasures or dangers lie within.");
	    
	    int answer = sc.nextInt();
	    
        if (answer == 1)
        {
            System.out.println("You find a lake with a shimmer and you dive in it and find gold.");
            System.out.println("What would you like to do now?");
            System.out.println("1. Stay under water");
            System.out.println("2. Swim up to the surface");
            System.out.println("3. Explore a cave under the lake");
            answer = sc.nextInt();
            if (answer == 1)
            {
                System.out.println("You die due to lack of oxygen.");
            }
            else if (answer == 2)
            {
                System.out.println("You find a camp site and stay at it.");
            }
            else if (answer == 3)
            {
                System.out.println("You find a hostile tribe member.");
            }
            else
                System.out.print("You did not pick a valid option.");
        }
        else if (answer == 2)
        {
            System.out.println("You follow the smoke and find a native tribe that wants to hunt you down.");
            System.out.println("What would you like to do now?");
            System.out.println("1. Hide");
            System.out.println("2. Try to make peace");
            System.out.println("3. Accept fate");
            answer = sc.nextInt();
            if (answer == 1)
            {
                System.out.println("The tribe members dont find you.");
            }
            else if (answer == 2)
            {
                System.out.println("The tribe members trust you.");
            }
            else if (answer == 3)
            {
                System.out.println("The tribe members kill you.");
            }
            else
                System.out.print("You did not pick a valid option.");
        }
        else if (answer == 3)
        {
            System.out.println("You investigate the ancient ruins, but as you are walking a rock falls and pins you to the ground.");
            System.out.println("What would you like to do now?");
            System.out.println("1. Try to push the rock off");
            System.out.println("2. Yell for help");
            System.out.println("3. Accept fate");
            answer = sc.nextInt();
            if (answer == 1)
            {
                System.out.println("You dont have enough strengh to do it.");
            }
            else if (answer == 2)
            {
                System.out.println("No one hears you");
            }
            else if (answer == 3)
            {
                System.out.println("You die due to blood loss");
            }
            else
                System.out.print("You did not pick a valid option.");
        }
        else
            System.out.println("You did not pick a valid choise");
        
    }
}
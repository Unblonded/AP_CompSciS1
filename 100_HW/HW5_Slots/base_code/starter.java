import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int betAmount = 0;
		int money = 100;
		
		int slot1 = 0;
		int slot2 = 0;
		int slot3 = 0;
		
		System.out.println("Slot Machine Rules:\n1. Each player starts with $100.\n2. Input a wager less than your total amount of money.\n3. The slot machine will roll 3 numbers from 1 to 10.\na. If two numbers match, you double your money.\nb. If three numbers match, you triple your money.\nc. If none match, you lose your money.")
		
		
			while (money > 0)
			{
				System.out.print("Are you ready to play the slot?(Yes, Y, yes, y): ");
				String play = sc.nextLine();
				
				if (play.toLowerCase().equals("yes") || play.toLowerCase().equals("y")) {
				
					System.out.print("\nEnter Bet Amount (You have $" + money + "): ");
					betAmount = sc.nextInt();
					sc.nextLine();
					while (betAmount > money || betAmount < 1)
					{
						System.out.println("Bet Amount Is Out Of Money Range");
						System.out.print("\nEnter Bet Amount (You have $" + money + "): ");
						betAmount = sc.nextInt();
						sc.nextLine();
					}
					
					money -= betAmount;
					slot1 = (int)(1+ Math.random() * 10);
					slot2 = (int)(1+ Math.random() * 10);
					slot3 = (int)(1+ Math.random() * 10);
					System.out.println("______________");
					System.out.println("| "+ slot1 + " | " + slot2 + " | " + slot3 + " |");
					System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
					if (slot1 == slot2 && slot1 == slot3 && slot2 == slot3)
					{
						System.out.println("Tripple");
						money += betAmount * 3;
					}
					
					else if(slot1 == slot2 || slot1 == slot3 || slot2 == slot3)
					{
						System.out.println("Double!");
						money += betAmount * 2;
					}
					else 
					{
						System.out.println("Lose!");
						money -= betAmount;
					}
				}
				else {
					System.out.println("You left the casino, but you still have $" + money); 
				}
		}
		System.out.println("You drained your pockets! Come Back Next Time!");
	}
}
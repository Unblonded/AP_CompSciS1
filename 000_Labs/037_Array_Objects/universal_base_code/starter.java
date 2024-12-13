/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Wizard[] wiz = new Wizard[100];
		Warrior[] war = new Warrior[100];
		
		for (int i = 0; i < wiz.length; i++) {
			wiz[i] = new Wizard("Wizard "+i);
		}
		
		for (int i = 0; i < war.length; i++) {
			war[i] = new Warrior("Warrior "+i);
		}
		
		
		int cWiz = 0;
		int cWar = 0;
		while (!(wiz[wiz.length-1].isDead()) && !(war[war.length-1].isDead())) {
			if (war[cWar].isDead() && cWar < war.length-1) {
				cWar++;
			}
			else {
				war[cWar].attack(wiz[cWiz]);
			}
			
			if (wiz[cWiz].isDead() && cWiz < wiz.length-1) {
				cWiz++;
			}
			else {
				wiz[cWiz].attack(war[cWar]);
			}
		}
		
		int wizC = 0;
		for (int i = 0; i < wiz.length; i++) {
			if (!wiz[i].isDead())
				wizC++;
		}
		
		int warC = 0;
		for (int i = 0; i < war.length; i++) {
			if (!war[i].isDead())
				warC++;
		}
		
		System.out.println("\n\nStill Alive: Wizard " +  wizC + " | Warrior " + warC);

	}
}

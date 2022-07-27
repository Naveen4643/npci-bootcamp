package July26TakeHome;

import java.util.Collections;
import java.util.*;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class GameWinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Cards c = new Cards(1,3);
//		System.out.println(c.toString());

		Deck d = new Deck();
		d.shuffle(d.cardList);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of players");
		int n = sc.nextInt();
		
		Random r =new Random();
		int host=r.nextInt(n);
		while(host==0) {
			host = r.nextInt();
		}
		System.out.println(host);
		boolean start = true;
		
		while(start) {
			Map<Integer,Player> playerData = new LinkedHashMap<Integer,Player>();
			double sumOfAllBets = 0;
			System.out.println("Player "+host+" Is Host ");
			
			for(int i=1;i<=n;i++) {
				if(host==i) {
					playerData.put(i, null);
				}else {
					System.out.println("Player "+i+" Enter your card as RankAndSuit with space separated (1-13 and 1-4)");
					
					Cards c = new Cards(sc.nextInt(),sc.nextInt());
					System.out.println("Player "+i+" Enter Bet Value");
					int bet = sc.nextInt();
					System.out.println("Player "+i+" Enter In Or Out ");
					String chosenOrientation = sc.next();
					Player p = new Player(i,bet,c,chosenOrientation);
					playerData.put(i, p);
					sumOfAllBets += p.getBetValue();
				}
			}
			System.out.println("Player "+d.deal(playerData)+" Is The Winner Here is Your Bet Money "+sumOfAllBets);
			System.out.println("You Are The New Host ");
			System.out.println("To Continue Enter yes Or else To Stop The Game Enter No");
			host = d.deal(playerData);
			if(!sc.next().equalsIgnoreCase("YES")) {
				start = false;
				System.out.println("Thank You For Playing");
			}	
		}
	}
	
}
	
		
		


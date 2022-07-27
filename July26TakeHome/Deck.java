package July26TakeHome;

import java.util.*;
import java.util.Map.Entry;

public class Deck {
	
	static String cardList[]= {"AS","2S","3S","4S","5S","6S","7S","8S","9S","10S","JS","QS","KS",
						"AD","2D","3D","4D","5D","6D","7D","8D","9D","10D","JD","QD","KD",
						"AH","2H","3H","4H","5H","6H","7H","8H","9H","10H","JH","QH","KH",
						"AC","2C","3C","4C","5C","6C","7C","8C","9C","10C","JC","QC","KC"};
	
	static String shuffleList[] = new String[52];
	public void shuffle(String cardList[]) {
		Random r =new Random();
		
		for(int i=0; i<cardList.length; i++) {
			int rno =r.nextInt(cardList.length);
			shuffleList[i] = cardList[rno];

}
		for(int i=0; i<shuffleList.length; i++) {
			System.out.println(shuffleList[i]);
		}
	}
	
	public int deal(Map<Integer, Player> playerDetails) {
//	String[] list = shuffleList;
	int host = 0;
	for(int i=0; i<shuffleList.length; i++) {
		if(i%2==0 ) {
			String in = shuffleList[i];
			for(Map.Entry<Integer, Player> element : playerDetails.entrySet()) {
				if(element.getValue() == null) {
					host = element.getKey();
				}
				else if((in.equals(element.getValue().getChoosenCard()) && element.getValue().getChosenOrientation().equalsIgnoreCase("IN"))) {
					return element.getKey();
				}
			}
		}
		else {
			String out = shuffleList[i];
			for(Map.Entry<Integer, Player> element : playerDetails.entrySet()) {
				if(element.getValue() == null) {
					host = element.getKey();
				}
				else if((out.equals(element.getValue().getChoosenCard()) && element.getValue().getChosenOrientation().equalsIgnoreCase("OUT"))) {
					return element.getKey();
				}
			}
		}
		
		
}
	return host;
	}
	
}



package factorymethod;

import java.util.HashMap;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a[]= {'a','b','d','d','b','s','v','v'};
		HashMap<Character,Integer> h=CharacterCount.countCharacter(a);
		System.out.println(h);
	}
	static HashMap<Character,Integer> countCharacter(char a[]){
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		
		for(char c:a) {
			if(hm.containsKey(c)) {
				hm.put(c,hm.get(c)+1);
			}
			else
				hm.put(c, 1);
		}
		return hm;

}
}

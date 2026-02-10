package in.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class CountcharinString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		// TODO Auto-generated method stub
		Map<Character,Integer> m=new HashMap<>();
		String str=sc.next();
		char[] ch=str.toCharArray();
		for(char character:ch) {
			if(m.containsKey(character)) {
				m.put(character,m.get(character)+1);
			}else {
				m.put(character,1);
			}
		}
		Set<Entry<Character,Integer>> entries=m.entrySet();
		for(Entry<Character,Integer> entry:entries) {
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}
	}

}

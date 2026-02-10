package in.collections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Concurrenthashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m=new ConcurrentHashMap<>();
		m.put(1, "HI");
		m.put(2, "Hello");
		m.put(3, "Chandini");
		System.out.println(m);
		Set<Entry<Integer,String>> entries=m.entrySet();
		for(Entry<Integer,String> entry:entries) {
			System.out.println(entry.getKey()+"->"+entry.getValue());
			m.put(4,"Ratna");
		}

	}

}

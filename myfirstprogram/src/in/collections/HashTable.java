package in.collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m=new Hashtable<>();// why t is small in hashtableit is in 1.0 version naming coventions stict from 1.2 version
		//m.put(null,null);//hashtable doesn't allow null values for key and values so it thrws null point exception
		m.put(1, "HI");
		m.put(2, "Hello");
		m.put(3, "Chandini");
		System.out.println(m);//hashtable doesn't allow insertion order it stores based on hashcode-->bucket index
	}

}

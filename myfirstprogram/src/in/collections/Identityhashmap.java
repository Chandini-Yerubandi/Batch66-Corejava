package in.collections;

import java.util.IdentityHashMap;
import java.util.Map;

public class Identityhashmap{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map<String,String> m=new HashMap<>();
		//if we are using literals or objects it returns same output because it doesn't take duplicates and gives updated value
		//When we give identity hashmap insted of hashmap .identityhashmap does'nt check vale it check the address of the object.
		//both addresses are not unique so it returns both s1 and s2 statements
		Map<String,String> m1=new IdentityHashMap<>();

//		String s1="Java";//literal1
//		String s2="Java";//literal2
		String s1=new String("Java");//obj1
		String s2=new String("Java");//obj2
		m1.put(s1, "is Simple");
		m1.put(s2, "is Very Simple");
		System.out.println(m1);
	}

}

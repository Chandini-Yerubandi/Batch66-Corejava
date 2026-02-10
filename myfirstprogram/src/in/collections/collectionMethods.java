package in.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collectionMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Add(e) method
		Collection<Object> fruits=new ArrayList<>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Grapes");
		fruits.add("WaterMelon");
		fruits.add("Guva");
		
		
		System.out.println(fruits);
//		for(Object s:fruits) {
//			System.out.println(s);
//			
//		}
		//Add all method
		Collection<Object> boys=new ArrayList<>();
		boys.add("Mahesh");
		boys.add("Sai");
		boys.add("Ramesh");
		boys.add("Durga");
		Collection<Object> girls=new ArrayList<>();
		girls.add("Chandini");
		girls.add("Ratna");
		girls.add("Durga");
		Collection<Object> Students=new ArrayList<>();
		Students.addAll(boys);
		Students.addAll(girls);

		System.out.println(Students);
		
		//iterator
		 Iterator<Object> i=boys.iterator();
		 while(i.hasNext()) {
			 Object s=i.next();
			 if(s=="Sai") {
				 i.remove();
			 }
		 }
System.out.println(boys);
		

		

		//contais method
		boys.contains("Sai");
		System.out.println(boys.contains("Sai"));
		
		//containsAll
		System.out.println(Students.contains(fruits));

		
		//remove method
		boys.remove("Sai");
		System.out.println(boys);
		
		//clear
		//boys.clear();
		
		//removeAll method
		Students.removeAll(boys);
		System.out.println(Students);//empty list
		System.out.println(boys.remove("Mahesh"));
		System.out.println(boys.remove("Ramesh"));
		System.out.println(boys);
		
		
		//isEmpty()
		System.out.println(boys.isEmpty());
		
		
		//hashcode method()
		System.out.println(boys.hashCode());
		System.out.println(girls.hashCode());
		
		//equals method
		Collection<Object> c1=new ArrayList<>();
		c1.add("ABC");
		c1.add("DEF");
		c1.add("GHI");
		c1.add("123");
		System.out.println(c1);
		
		Collection<Object> c2=new ArrayList<>();
		c2.add("123");
		c2.add("456");
		c2.add("789");
		System.out.println(c2);
		 System.out.println(c1.equals(c2));
		 
		 //retains
		 c1.retainAll(c2);
		System.out.println(c1);
		
		//size
		System.out.println(c2.size());
		 
		 		
		
		
		

		

	}

}

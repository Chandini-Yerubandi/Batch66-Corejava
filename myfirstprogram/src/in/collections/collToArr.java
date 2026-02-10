package in.collections;

import java.util.ArrayList;
import java.util.Collection;

public class collToArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Object> c1=new ArrayList<>();
		c1.add("HI");
		c1.add("HELLO");
		c1.add("Chandini");
		Object[] arr1=c1.toArray();
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
			
		}
		System.out.println("************************");
		for(Object s:arr1) {
			System.out.println(s);
		}

	}

}

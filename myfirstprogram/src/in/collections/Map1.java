package in.collections;

import java.util.Map;
import java.util.WeakHashMap;

class temp{
	public String toString() {
		return "Temp";
	}
	protected void finalize() throws Throwable{
		System.out.println("Finalise method called");
	}
}
public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Object,String> m=new WeakHashMap<>();
		temp t=new temp();
		System.out.println(t);
		m.put(t, "Chandini");
		System.out.println(m);
		//nullifying the obj=ect
		t=null;
		System.gc();
		System.out.println(t);

	}

}

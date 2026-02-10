package in.javaintroduction;

public class GarbageCollector {
	int id;
	String name;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method started");
		GarbageCollector g= new GarbageCollector();
		GarbageCollector h= new GarbageCollector();
		GarbageCollector i= new GarbageCollector();
		g=null;
		h=null;
		i=null;
		System.gc();
		System.out.println(g);//when we give null to
		//the first object then the address of that object will pass to nxt object.
		System.out.println(h);
		System.out.println(i);//address of the object
	}

}

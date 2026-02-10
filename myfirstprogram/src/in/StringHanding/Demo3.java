package in.StringHanding;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub9
		Demo3 d1=new Demo3();
		Demo3 d2=new Demo3();
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());

		System.out.println(d1==d2);//false because different hashcodes
		System.out.println(d1.equals(d2));
		String s1="Chandini";
		String s2="Chandini";
		System.out.println(s1.hashCode());//hashcode and equals overrided from string class
		System.out.println(s2.hashCode());
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));

		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));

	}

}

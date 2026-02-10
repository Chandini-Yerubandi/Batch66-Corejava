package in.oops;
class Q{
	int a=10;
}
class W extends Q{
	int b=20;
}
class R extends Q{
	int c=30;
}
public class HierarchialInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		R r=new R();
		W w=new W();
		System.out.println(r.a);
		System.out.println(w.a);

	}

}

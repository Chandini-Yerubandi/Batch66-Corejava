package in.InnerClasses;

public class StaticNestedClass {
	static private String msg="Hello Chandini";
static class inner{
	void show() {
		System.out.println(msg);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticNestedClass.inner i=new StaticNestedClass.inner();//no outer class object is need for static class object
		i.show();

	}

}

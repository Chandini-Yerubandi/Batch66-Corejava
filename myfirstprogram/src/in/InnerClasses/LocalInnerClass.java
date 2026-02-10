package in.InnerClasses;

public class LocalInnerClass {
	private String msg="Chandini Ratna Durga ";
	void method1() {
		class inner{
			void show() {
				System.out.println(msg);
			}
		}
	inner i=new inner();
		i.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInnerClass l=new LocalInnerClass();
		l.method1();

	}

}

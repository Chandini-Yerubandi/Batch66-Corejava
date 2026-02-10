package in.InnerClasses;

public class InnerClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method started!");
		InnerClass1 i=new InnerClass1();
		//InnerClass1.NestedClass1 n1=i.new NestedClass1();//another way to call inner method in outer class
		//InnerClass1.NestedClass1 n1=new InnerClass1().new NestedClass1();//another way to call inner method in outer class
		new InnerClass1().new NestedClass1().hello();//another way to call inner method in outer class
		
		//n1.hello();

	}
	class NestedClass1{//we cannot create inner class object in outer class dso we  create with outer class name
		void hello() {
			System.out.println("Hello inner class method!!");
		}
		public static void main(String[] args) {
			System.out.println("Main method started in Inner Class1!");
		
		}

	}

}

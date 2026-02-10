package in.fundamentals;


public class Methods2 {
//wap to cal add,sub,mul,div,mod--->Arithmetic operations--->Special characters
	//no return type with no arguments
	public static void main(String[] args) {//predefied method
		// TODO Auto-generated method stub
		System.out.println("Main method started !");
		//Methods2.add();
		Methods2 m=new Methods2();
		m.add();
		m.mul();
		m.mod();
		int d=m.div();
		int sub=m.sub();
		System.out.println("Div: "+d);
		System.out.println("Sub: "+sub);
	}
	 void add() {//user defined method
		int a=2;
		int b=3;
		System.out.println("add: "+a+b);
		//return type withno arguments
	 }
	 int sub() {//return type with no arguments
		int c=4;
		int d=3;
		int sub=0;
		sub=c-d;
		return sub;
	}
	 int div() {
		 int s=10;
		 int q=5;
		 int div=0;
		 div=s/q;
		 return div;
	 }
		void mul() {
			int x=4;
			int y=5;
			System.out.println("mul: "+x*y);
		}
		void mod() {
			int n=6;
			int m=3;
			System.out.println("mod: "+n%m);
		}
	}


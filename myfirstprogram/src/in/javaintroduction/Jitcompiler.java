package in.javaintroduction;

public class Jitcompiler {
	void method1(){
		System.out.println("Method1 called");
	}
    void method2() {
    	System.out.println("Method2 called");
    }
	public static void main(String[] args) {
		System.out.println("Main method started");
		Jitcompiler j =new Jitcompiler();
		j.method1();   //fst tym method called by interpreter
		j.method2();
		j.method1();          //all these methods will called by JIT compiler
		j.method2();          
		j.method1();
		j.method2();
		// TODO Auto-generated method stub

	}

}

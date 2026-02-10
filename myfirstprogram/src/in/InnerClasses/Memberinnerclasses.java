package in.InnerClasses;

public class Memberinnerclasses {
	private String msg="Hello";
	class inner{
		void show() {
			System.out.println(msg);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Memberinnerclasses.inner i=new Memberinnerclasses().new inner();
		i.show();
		

	}

}

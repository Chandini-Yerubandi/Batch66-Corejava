package assignments;

public class Intrest {
	int p;
	int r;
	int t;
	Intrest(){
		p=2000;
		r=5;
		t=2;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Intrest i= new Intrest();
		
		System.out.println("Simple Intrest: "+i.Calculate(i.p,i.r,i.t));
		

	}
	  double Calculate(int p,int r,int t) {
		double SI=(p*t*r)/100;
		return SI;
	}

}

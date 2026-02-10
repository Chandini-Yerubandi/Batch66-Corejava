package assignments;

public class Cart {
	int topprice;
	int jewllaryprice;
	int groceryprice;
Cart(int topprice,int jewllaryprice,int groceryprice){
	this.topprice=topprice;
	this.jewllaryprice=jewllaryprice;
	this.groceryprice=groceryprice;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart c= new Cart(1000,1000,1000);
		c.display();
		

	}
	void display() {
		int total=topprice+jewllaryprice+groceryprice;
		float discount=total;
		if(total>5000) {
		 discount=total-(0.10F*total);
		}
		 float finalamount=discount+(discount*0.18F);
		System.out.println("Final Payable amount:  "+finalamount);
			
		
	}
}

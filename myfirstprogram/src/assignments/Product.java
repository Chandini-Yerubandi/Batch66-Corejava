package assignments;

public class Product {
	int id=0;
	String name="Unknown";
	int price=50;
	int quantity=1;
	Product(){
		this(0,"Unknown",50,1);
	}
	Product(int id,String name,int price,int quantity){
		this.id=id;
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	Product(int id,String name){
		this(id,name,50,1);//price and quantity are assigned
		
	}
	Product(int id,String name,int price){
		this(id,name,price,1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new Product();
		System.out.println("*****Product0*******");
		p.show();
		Product p1=new Product(1,"Apple");
		System.out.println("*****Product1*******");
		p1.show();
		Product p2=new Product(2,"Banana",20);
		System.out.println("*****Product2*******");

		p2.show();
		Product p3=new Product(3,"Grapes",30,5);
		System.out.println("*****Product3*******");

		p3.show();


		

	}
	void show() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(price);
		System.out.println(quantity);

	}

}

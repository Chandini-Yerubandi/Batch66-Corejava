package practice;

public class Vehicle {
	String brand;
	String model;
	double price;
	Vehicle(){
		System.out.println("No arg cons called");
	}
	Vehicle(String brand,String model){
		this();
		
	}
	Vehicle(String brand, String model,double price){
		this(brand,model);
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v =new Vehicle("abc","bvc",120);
		v.show();

	}
	void show() {
		System.out.println(brand);
		System.out.println(model);
		System.out.println(price);
	}

}

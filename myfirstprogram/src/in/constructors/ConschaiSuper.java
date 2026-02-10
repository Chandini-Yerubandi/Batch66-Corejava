package in.constructors;
class Vehicle {
	String model;
	String brand;
	double price;
	Vehicle(){
		System.out.println("Parent cls no arg constructor");
	}
	Vehicle(String model,String brand,double price){
		System.out.println("Parent cls vth parameterized constructor");
		this.model=model;
		this.brand=brand;
		this.price=price;
	}

	void show() {
		System.out.println("Model of the car: " + model);
		System.out.println("Brand of the car: " + brand);
		System.out.println("price of the car: " + price);
	}

}

class car extends Vehicle {
	car(){
		super();//if we use super() or didn't use super() is same because super() cons is default for child class,it calls  parent class by default
//when we create object for child class then the no arg cons in the child cls called and from child class parent class no arg cons also called whenever we didn't use super() in child class
		System.out.println("No arg constructor");
	}
	car(String model,String brand,double price){
		super(model,brand,price);//when we cal parameterized con no arg con will not called
System.out.println("Parameterized con called from car class");		
	}

}

public class ConschaiSuper {// driver class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method started!");
		//car c = new car();
		car c1 = new car("soneta","KIA",12345.00);

		c1.show();
		//System.out.println(c.model);
	}

	}
	

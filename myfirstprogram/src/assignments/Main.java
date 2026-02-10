package assignments;
class Vehicle{
	String brand;
	int speed;
	Vehicle(String brand,int speed){
		this.brand=brand;
		this.speed=speed;
	}
}
class Car extends Vehicle{
	String type;
	Car(String brand,int speed,String type){
	super(brand,speed);
	this.type=type;
	}
	
	void show() {
		System.out.println(brand);
		System.out.println(speed);
		System.out.println(type);

	}

}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car("abc",30,"def");
		c.show();

	}
	
}

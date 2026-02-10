package in.constructors;
class Flower{
	String name="Rose";
	Flower(){
		System.out.println("No arg cons");
	}
	Flower(String name){
		//this.name=name;
		
		System.out.println("para cons for flower");
	}
	public static void main(String[] args) {
		System.out.println("Main method for flower class");
	}
}
public class Lotus extends Flower{
	String colour;
	//String name="Lotus";
Lotus(String colour){
	//this.colour=colour;
	
	System.out.println("Para cons for lotus");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method for lotus class");
		Lotus l=new Lotus("White");
		l.show();

	}
	void show() {
		
		
		System.out.println("NAME: "+super.name);
		System.out.println(this.colour);
	}

}

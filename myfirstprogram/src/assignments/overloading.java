package assignments;
//overloading
public class overloading {
	int length;
	int width;
	int breadth;
	int count;
	overloading(){
		System.out.println("No constructor called");
	}
	overloading(int length,int width,int breadth){
		this(7);
		this.length=length;
		this.width=width;
		this.breadth=breadth;
		
	}
	overloading(int count){
		
		this.count=count;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloading o2=new overloading();
		overloading o1=new overloading(7);
		overloading o =new overloading(3,4,5);
		o.show();

	}
	void show() {
		System.out.println("Length: "+length);
		System.out.println("Breadth: "+breadth);
		System.out.println("Height: "+width);
		System.out.println("count: "+count);
	}

}

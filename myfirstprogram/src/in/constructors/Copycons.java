package in.constructors;

public class Copycons {
String name;
String hero;
String heroine;
String director;
double budget;
Copycons(){
	System.out.println("No arg cons");
}
Copycons(String hero,String name){
	this.hero=hero;
	this.name=name;
	System.out.println("Two arg cons");
}
Copycons(String heroine,String director,double budget,Copycons cp){//so we assign as Copycons cp
	this.hero=cp.hero;
	this.name=cp.name;
	this.heroine=heroine;
	this.director=director;
	this.budget=budget;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Main method started!");
Copycons c= new Copycons("Pavankalyan","og");//c reference is coping into c1 reference
Copycons c1= new Copycons("Priyanka","sujith",25000000000.00,c);//copy one constructor into another constructor
//c.show();
c1.show();
	}
	void show() {
		System.out.println("Name of the movie: "+name);
		System.out.println("Name of the hero: "+hero);
		System.out.println("Name of the heroine: "+heroine);
		System.out.println("Name of the director: "+director);
		System.out.println("Budget of the movie: "+budget);
	}

}

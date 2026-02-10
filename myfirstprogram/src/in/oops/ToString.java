package in.oops;

public class ToString {
int id;
String name;
 
@Override
public String toString() {
	return "ToString [id=" + id + ", name=" + name + "]";
}

	//public String toString(){
//	return "Customer Info - Customer id:"+id+", Customer name : "+name;
//	
//}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method started!");
		ToString t=new ToString();
		System.out.println(t);//address of the object
		System.out.println(t.toString());//adddress of the object
		System.out.println(t.id);//0
		System.out.println(t.name);//null

	}

}

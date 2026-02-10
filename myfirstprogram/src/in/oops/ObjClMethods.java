package in.oops;

public class ObjClMethods implements Cloneable{
@Override
protected void finalize()throws Throwable{
	System.out.println("finalize method called");
}
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		ObjClMethods o1=new ObjClMethods();
		ObjClMethods o2=(ObjClMethods)o1.clone();
		System.out.println(o1);//address of object
		System.out.println(o2);//address of object
		ObjClMethods o3=new ObjClMethods();
		ObjClMethods o4=new ObjClMethods();
		o3=o4;
		System.gc();//finalize method called
		int a1=0x5ca881b5;
		int a2=0x24d46ca6;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(o3.equals(o4));//true
		System.out.println(o1.getClass());
		System.out.println(o1.hashCode());//unique value
		System.out.println(o2.hashCode());
		System.out.println(o3.hashCode());
		
		
		





	}

}

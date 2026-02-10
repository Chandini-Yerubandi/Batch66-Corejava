package in.StringHanding;

public class Capacity2 {
//current capacity*2+2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	StringBuffer s=new StringBuffer();
	s.ensureCapacity(78);//below 16=16,16=16,17=34,100
	System.out.println(s.capacity());
	StringBuffer s1=new StringBuffer("Java");//16+4
	System.out.println(s1.capacity());
	StringBuffer s2=new StringBuffer();
	s2.append("javajavajavajavaj");//it cross 16 so here we use 16*2+2=34
	s2.append("javajavajavajavaja");//it crosses 34 so here it obeys 34*2+2=70
	System.out.println(s2.capacity());
	StringBuffer s3=new StringBuffer("java");//20
	s3.append("javajavajavajavajavaj");//20*2+2=42
	System.out.println(s3.capacity());
	s3.delete(0, 4);//end index is exceeds
	System.out.println(s3);
	StringBuffer s7=new StringBuffer("chandini");
	s7.delete(0, 4);
	System.out.println(s7);
	}

}

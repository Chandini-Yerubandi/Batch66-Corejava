package in.StringHanding;

public class StringBufferCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//capacity of String buffer is 16 when there is no characters within the object
		StringBuffer sb=new StringBuffer();
		System.out.println("Capacity of StringBuffer with no characters: "+sb.capacity());
		StringBuffer sb1=new StringBuffer("Chandini");
		System.out.println("Capacity of StringBuffer with 8 characters: "+sb1.capacity());//16+8=24
		StringBuffer sb2=new StringBuffer("Ratna");
		System.out.println("Capacity of StringBuffer with 5 characters: "+sb2.capacity());//16+5=21
		StringBuffer sb3=new StringBuffer();
		sb3.append("Durga");
		System.out.println("Capacity of StringBuffer with 10 characters: "+sb3.capacity());//16 capacity doesn't change for sb3
		StringBuffer sb4=new StringBuffer();
		sb4.append("Chandinichandinicha");
		System.out.println("Capacity of StringBuffer with no characters: "+sb4.capacity());//during appending greater than 16 characters it follows 16*2+2 rule
		StringBuffer sb5=new StringBuffer();
		sb5.append("Chandinichandinichandinichandinich");
		sb5.append("Chandinichandinichandinichandinichand");
		System.out.println("Capacity of StringBuffer with no characters: "+sb5.capacity());

	}

}

package in.StringHanding;

import java.math.BigInteger;

public class StringvsSbuildervsSbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="chandini";
		String s1=" Ratna";
		String s3=s.concat(s1);
		StringBuffer sb=new StringBuffer("Java");
		StringBuffer sb1=new StringBuffer(" is simple");
		StringBuffer sb3=sb.append(sb1);
		BigInteger bi=new BigInteger("10");
		System.out.println(s3);
		System.out.println(sb3);
		System.out.println(bi);

	}

}

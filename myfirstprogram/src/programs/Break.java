package programs;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=0;i<=5;i++) {
	if(i==4) {
		continue;//if we want to skip some conditions we use continue keyword
		//break;if we want to stop from particular condition
	}
	else {
		System.out.println(i);
	}
}
	}

}

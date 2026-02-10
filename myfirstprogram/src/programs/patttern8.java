package programs;

public class patttern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int k=6;k>i;k--) {
				System.out.print(" ");
			}
			for(int a=6;a>i;a--) {
				System.out.print(" ");
			}
			for(int b=1;b<=i;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=6;i++) {
			for(int j=6;j>i;j--) {
				System.out.print("*");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			for(int a=1;a<=i;a++) {
				System.out.print(" ");
			}
			for(int b=6;b>i;b--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}

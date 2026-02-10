package programs;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=6;i++) {
			for(int j=6;j>i;j--) {//spaces
				System.out.print(" ");}
				for(int k=1;k<=i;k++) {//stars
					System.out.print(" *");
					
				}
				System.out.println();
			
		}

	}

}

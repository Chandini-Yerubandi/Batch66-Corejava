package in.Arrays;

public class Array3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method started!");
		int[][][] numbers=new int[3][2][2];
		System.out.println(numbers.length);
		System.out.println(numbers[0].length);
		System.out.println(numbers[0][0].length);
		numbers[0][0][0]=100;
		numbers[1][1][1]=200;
		numbers[2][1][1]=300;

		for(int[][] n2:numbers) {
			for(int[] n1:n2) {
				for(int n:n1) {
					System.out.print(n+" ");
				}
				System.out.println();
			}
			System.out.println();
		}


	}

}

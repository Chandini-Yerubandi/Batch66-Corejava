package in.Arrays;

public class AddTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {10,20,30,40};
		int arr1length=arr1.length;
		int arr2[]= {50,60,70,80};
		int arr3[]=new int[arr1length];
		System.out.print("Addition of two arrays are: ");
		for(int i=0;i<arr3.length;i++) {
			 arr3[i]=arr1[i]+arr2[i];
			 System.out.print(arr3[i]+" ");
		}
		

	}

}

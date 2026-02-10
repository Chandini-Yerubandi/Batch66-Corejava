package in.Arrays;

public class Storein3Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {10,20,30,40};
		int l1=arr1.length;
		int arr2[]= {30,40,50};
		int l2=arr2.length;
		int arr3[]=new int[l1+l2];
		for(int i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			arr3[l1+i]=arr2[i];
			
		}
		for(int a:arr3) {
			System.out.print(a+" ");
		}
	}

}

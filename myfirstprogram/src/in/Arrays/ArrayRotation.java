package in.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method Started!");
		int arr[]= {1,2,3,4,5,6,7,8};
		reverseArray(arr,0,arr.length-1);
		System.out.println("After Reverse: ");
		for(int a:arr) {
			System.out.println(a+" ");
		}

	}
	static void reverseArray(int[]arr,int start,int end) {
		int temp=0;
		while(start<end) {
			temp=arr[0];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			
		}
	}

}

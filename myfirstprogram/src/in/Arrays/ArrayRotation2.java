package in.Arrays;

import java.util.Scanner;

public class ArrayRotation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method Started!");
		int arr[]= {1,2,3,4,5,6,7,8};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of times to rotate: ");
		int r=sc.nextInt();
		rotationalArray(arr,r);
		System.out.println("After Reverse: ");
		for(int a:arr) {
			System.out.println(a+" ");
		}

	}
	static void rotationalArray(int[] arr,int r) {
		int s=0;
		int e=arr.length-1;
		if(r<=arr.length) {
		reverseArray(arr,s,e);
		reverseArray(arr,s,r-1);
		reverseArray(arr,r,e);
		}else {
			System.out.println("Something went wrong");
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

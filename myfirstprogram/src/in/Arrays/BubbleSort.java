package in.Arrays;

import java.util.Arrays;

public class BubbleSort {
//input: int arr[]={50,30,40,10,5,2}
//output:{2,5,10,30,40,50}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method started!");
		int arr[]= {50,30,40,10,5,2};
	    //Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1] ) {
				int temp=0;
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;}
			}
		}
for(int i:arr) {
	System.out.print(i+" ");
}
	}

}
//duplicate seco largest arr[arr.length-2]
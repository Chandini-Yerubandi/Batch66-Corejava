package in.Arrays;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks= {50,20,30,40};
		int max=marks[0];
		int min=marks[0];
		for(int i=0;i<marks.length;i++) {
			if(marks[i]>max) {
				max=marks[i];
				
			}
			if(marks[i]<min) {
				min=marks[i];
			}
		}
System.out.println(max);
System.out.println(min);
	}

}

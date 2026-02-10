package in.Arrays;

public class SumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double [] marks= {92,86.9,74,90,89,96};
		double sum=0,avg=0;
//		int sum=marks[0]+marks[1]+marks[2]+marks[3];
//		int avg=sum/marks.length;
//		System.out.println(sum);
//		System.out.println(avg );
		for(int i=0;i<marks.length;i++) {
			sum+=marks[i];
			
		}
		avg=(avg+sum)/marks.length;
		System.out.println("Sum of marks: "+sum);
		System.out.println("Average of marks: "+avg);
	}

}

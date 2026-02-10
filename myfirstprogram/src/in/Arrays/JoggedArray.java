package in.Arrays;

public class JoggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] names= {{"a","b","c"},{"d","e"},{"f","g","h"}};
		System.out.println(names.length);
		for(String name1[]:names) {//converting 2d to 1d
			for(String name:name1) {//converting id to single value
				System.out.print(name+" ");
				
			}
			System.out.println(" ");
		}
	}

}

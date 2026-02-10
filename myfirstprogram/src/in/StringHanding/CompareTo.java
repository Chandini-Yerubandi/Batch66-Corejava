package in.StringHanding;

public class CompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="chandini";//compares first unmatched characters  c->99-C->67=32
		String s2="Chandini";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));

	}

}

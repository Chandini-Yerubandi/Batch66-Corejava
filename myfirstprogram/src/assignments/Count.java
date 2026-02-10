package assignments;

public class Count {
	static int count = 0;

	Count() {
		count++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		Count c4 = new Count();
		int c = getObjectsCount();

		System.out.println("Object count: " + c);

	}

	static int getObjectsCount() {
		return count;
	}

}

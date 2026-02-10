package in.fundamentals;

public class Pencil {
	int total_money=50;
	int cost=7;
	int pencils_bought=total_money/cost;
	int rem_money=total_money-(cost*pencils_bought);
	

	public static void main(String[] args) {
		Pencil p = new Pencil();
		System.out.println("Total money entered: "+p.total_money);
		System.out.println("No of pencils bought: "+p.pencils_bought);
		System.out.println("Remaining money: "+p.rem_money);
		// TODO Auto-generated method stub

	}

}

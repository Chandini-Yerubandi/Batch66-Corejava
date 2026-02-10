package assignments;

public class ElectricityBill {
	String Cname;
	int units;
	double billAmount;

	ElectricityBill(String Cname, int units, long i) {
		this.Cname = Cname;
		this.units = units;
		CalculateBill();
	}

	ElectricityBill(String Cname) {
		this.Cname = Cname;
		System.out.println("No Consumption recorded");

	}

	void CalculateBill() {
		if (units <= 100) {
			billAmount = units * 1.5;
		} else if (units <= 300) {
			billAmount = 100 * 1.5 + (units - 100) * 2.5;
		} else if (units <= 500) {
			billAmount = 100 * 1.5 + 200 * 2.5 + (units - 300) * 4.0;
		} else {
			billAmount = 100 * 1.5 + 200 * 2.5 + 200 * 4.0 + (units - 500) * 6.0;
		}
	}

	void display() {
		System.out.println("Customer name: " + Cname);
		System.out.println("Units: " + units);
		System.out.println("Bill amount: " + billAmount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricityBill e = new ElectricityBill("Chandini", 10, 101);

		ElectricityBill e1 = new ElectricityBill("Ratna");
		e.display();

	}

}

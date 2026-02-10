package in.fundamentals;

public class Consumer {
	String name="Chandini";
	int units=100;
	static String comp_name="Vcube";
	static int tot_units =100;
	static int totalrev=0;
	final double unicost=7.5;
	double amount=units*unicost;
	double tax=0.05*amount;
	void setup() {
		System.out.println("Consumer name: "+name);
		System.out.println("Units: "+units);                                                                                                                                 
		System.out.println("Company name: "+comp_name);
		System.out.println("Total units: "+tot_units);
		System.out.println("Total revenue: "+(units*tot_units));
		System.out.println("unicost: "+unicost);
	}
	void generatebill() {
		System.out.println("Amount: "+(units*unicost));
		System.out.println("Tax: "+0.05*amount);
		System.out.println("Bill Amount: "+(amount+tax));
		System.out.println("Addition of bill amount and total revenue: "+((amount+tax)+(units*tot_units)));
	}

	public static void main(String[] args) {
		Consumer c = new Consumer();
		c.setup();
		c.generatebill();
		
	}

}

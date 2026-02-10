package in.fundamentals;

public class Book {
	int BookId=66;
	String Title="javafullstack";
	String Author="Srikanth";
	double price=200.0;
	double DiscountPercentage=10;
	double Discount=(price*DiscountPercentage)/100;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method started");
		Book b=new Book();
		
		double dis_amount=b.Discount;
		double fin_price=b.price-dis_amount;
		System.out.println("Discount amount="+dis_amount);
		System.out.println("Final price="+fin_price);

	}

}

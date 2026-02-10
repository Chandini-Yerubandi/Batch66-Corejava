package in.oops;

import java.util.Scanner;

public class PersLoan {
	static Scanner SC = new Scanner(System.in);
	String getAddressDetails() {
		String Address="vbn";
		return Address;
	}

	boolean RejectAAdharOrPanDetails() {
		System.out.println("Enter aadhar details: ");
		String aadhardetails=SC.next();
		System.out.println("Enter pan details: ");
		String pandetails=SC.next();
		System.out.println("Enter phone details: ");
		String phonedetails=SC.next();
		
		String aadhar = "^[0-9]{12}$"; // ^ for start and $ end
		String pan = "^[A-Z]{5}[0-9]{4}[A-z]{1}$";// {length}
		String phone = "^[0-9]{10}$";
		boolean isAdharValid = aadhar != null && aadhardetails.matches(aadhar);
		boolean isPanValid = pan != null && pandetails.matches(pan);
		boolean isPhoneValid = phone != null && phonedetails.matches(phone);
		return isAdharValid && isPanValid && isPhoneValid;
	}

	double getCustomerSalaryInfo() {
		System.out.println("Sir, can you please enter your salary");
		double sal = SC.nextDouble();
		return sal;
	}

	int getAgeInfo() {
		System.out.println("Enter your Age: ");
		int age = SC.nextInt();
		return age;
	}

	int getCibiScore() {
		System.out.println("Enter your Cibil Score: ");
		int cibil = SC.nextInt();
		return cibil;
	}

	double GetROI() {
		return 9.5;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Personal banking loan department!!!!!!!");
		
		PersLoan p=new PersLoan();
		double salary=p.getCustomerSalaryInfo();
		int age=p.getAgeInfo();
		int cibil=p.getCibiScore();

		boolean isValid=p.RejectAAdharOrPanDetails();
		if(salary>1500000.00 && age>=27 && cibil>=750 && isValid) {
			System.out.println("Congratulations !! your loan got Approved");
			System.out.println("The loan of intrest is:"+p.GetROI());
			System.out.println("Enter your address details for furthue process");
			System.out.println("entered address details are: "+p.getAddressDetails());
		}else {
			System.out.println("Your loan got rejected!! try later");
		}
	}

}

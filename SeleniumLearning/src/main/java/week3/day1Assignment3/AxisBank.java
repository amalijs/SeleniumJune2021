package week3.day1Assignment3;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("Deposit of money is 25,000");
	}
	
	public static void main(String[] args) {
		AxisBank bkinfo = new AxisBank();
		bkinfo.saving();
		bkinfo.fixed();
		bkinfo.deposit();
	}
	
	
}

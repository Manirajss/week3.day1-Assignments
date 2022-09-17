package week3.day1;

public class BankInfo {
	public void savings(int accountno) {
		System.out.println("Account number is xxxxxx30100xxxxx");
	}
	public void fixed(int balance) {
		System.out.println("Customer balance is 10,000");
	}
	public void deposit(int amount) {
		System.out.println("Customer deposited amount 5,000");
	}
	public class Axisbank extends BankInfo {
		public void savings(int accountno) {
			System.out.println("Account number is xxxxxxxxxxx437982");
		}
		public void fixed(int balance) {
			System.out.println("Customer balance is 20,000");
		}
		public void deposit(int amount) {
			System.out.println("Customer deposited amount 10,000");
		}
	}
	public static void main(String[] args) {
		BankInfo obj=new BankInfo();
		obj.savings(30100);
		obj.fixed(10000);
		obj.deposit(5000);
		obj.savings(437982);
		obj.fixed(20000);
		obj.deposit(10000);
	}

}

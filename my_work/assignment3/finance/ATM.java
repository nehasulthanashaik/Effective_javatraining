package in.assignment3.finance;

import java.util.Scanner;

public class ATM {
	
		private int accountNumber;

		private String password;

		private double amount;

		public int getAccountNumber() {
			return accountNumber;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public double getAmount() {
			return amount;
		}

        Bank B=new Bank(accountNumber,password,amount);
			
		Scanner sc=new Scanner(System.in);
		
		public void withdraw(int accoutNumber,String Password,double amount) {
			B.withdraw(accoutNumber,Password,amount);
		}
		
		public void Deposit(int accountNumber,double amount) {
			B.Deposit(accountNumber,amount);
		}
		
		public void changePassword(String oldpassword, String newpassword) {
			B.changePassword(oldpassword, newpassword);
		}


}
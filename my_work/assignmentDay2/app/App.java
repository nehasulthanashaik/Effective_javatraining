package in.assignmentDay2.app;

import java.util.Scanner;

import in.conceptarchitect.finance.Atm;
import in.conceptarchitect.finance.BankAccount;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Atm nandyalPaytm = new Atm();
		nandyalPaytm.a1.show();
		nandyalPaytm.a1.deposit(200000);
		nandyalPaytm.a1.creditInterest();
		nandyalPaytm.a1.withdraw(500,"jfhf");
		nandyalPaytm.a1.changePassword("jfhf","new@jfhf");
       nandyalPaytm.a1.show();		
		

		
		
		
		
	}

}
package in.assignment3.app;

package in.assignment3.finance;.ATM;
package in.assignment3.finance;.Bank;

public class App {

	public static void main(String[] args) {
		
		Bank B=new Bank(1234,"pa@ss",4000);

		ATM A=new ATM();
		
		A.withdraw(1234,"p@ss",4000);
		A.Deposit(1234, 5000);
		
		A.changePassword("p@ss","NVV@");
		

		
		
	}

}
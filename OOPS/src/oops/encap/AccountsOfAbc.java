package oops.encap;

public class AccountsOfAbc {
	private double bankBalance = 300;
	private short actualPin = 7536;
	
	public double getBankBalance(short pin) {
		if(pin == actualPin) {
			return bankBalance;
		} else {
			return -1;
		}	
	}
	
	public void setBankBalance(double amount) {
		this.bankBalance = amount;
	}

}

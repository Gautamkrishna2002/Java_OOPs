package oops.encap;

public class Abc {

	public static void main(String[] args) {
		short pin = 7536;
		AccountsOfAbc accountsOfAbc = new AccountsOfAbc();
		double bankBankBalanceFromGetter = accountsOfAbc.getBankBalance(pin);
		if(bankBankBalanceFromGetter == -1) {
			System.out.println("Incorrect Pin");
		} else {
			System.out.println("Bank Balance is: "+bankBankBalanceFromGetter);
		}
		
		accountsOfAbc.setBankBalance(600);
		double bankBankBalanceFromSetter = accountsOfAbc.getBankBalance(pin);
		if(bankBankBalanceFromGetter == -1) {
			System.out.println("Incorrect Pin");
		} else {
			System.out.println("Bank Balance is: "+bankBankBalanceFromSetter);
		}
		
	}

}

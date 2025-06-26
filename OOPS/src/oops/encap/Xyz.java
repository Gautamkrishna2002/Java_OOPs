package oops.encap;

public class Xyz {

	public static void main(String[] args) {
		short pin = 1234;
		AccountsOfAbc accountsOfAbc = new AccountsOfAbc();
//		System.out.println(accountsOfAbc.bankBalance);
		double bankBankBalanceFromGetter = accountsOfAbc.getBankBalance(pin);
		if(bankBankBalanceFromGetter == -1) {
			System.out.println("Incorrect Pin");
		} else {
			System.out.println("Bank Balance is: "+bankBankBalanceFromGetter);
		}


	}

}

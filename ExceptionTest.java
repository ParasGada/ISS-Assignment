class MyInsufficientFundsException extends Exception{

	private int amount;
	MyInsufficientFundsException(int amount){
		this.amount = amount;
	}
	int getAmount() {
		return amount;
	}
}

class Account{
	private int balance;

	Account(int amount){
		this.balance = amount;
	}
	void getBalance() {
		System.out.println("The account has $"+balance);
	}

	void withdraw(int amount) throws MyInsufficientFundsException {
		if(amount<=balance) {
			balance = balance - amount;
		}
		else {
			int need = amount - balance;
			throw new MyInsufficientFundsException(need);
		}
	}
}

class ExceptionTest{
	public static void main(String args[]) {
		Account ac = new Account(200);
		ac.getBalance();
		try {
			System.out.println("Withdrawing $100");
			ac.withdraw(100);
			ac.getBalance();
			System.out.println("Withdrawing $300");
			ac.withdraw(300);
		} catch (MyInsufficientFundsException e) {
			System.out.println("Sorry, but you are short $" + e.getAmount());
			e.printStackTrace();
		}
	}
}







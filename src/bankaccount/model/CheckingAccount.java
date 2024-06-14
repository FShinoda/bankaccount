package bankaccount.model;

public class CheckingAccount extends BankAccount {
	private float limit;

	public CheckingAccount(int number, int agency, int type, String owner, float balance, float limit) {
		super(number, agency, type, owner, balance);
		this.limit = limit;
	}

	public float getLimit() {
		return this.limit;
	}
	
	public void setLimit(float limit) {
		this.limit = limit;
	}
	
	@Override
	public boolean withdraw(float value) {
		if(this.getBalance() + this.getLimit() < value) {
			System.out.println("\n Insufficient Balance!");
			return false;
		}
		
		this.setBalance(this.getBalance() - value);
		return true;
		
	}
	
	@Override
	public void visualize() {
		super.visualize();
		System.out.println("Credit Limit: " + this.limit);
	}
}

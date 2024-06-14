package bankaccount.model;

public class SavingAccount extends BankAccount{
	private int aniversary;
	
	public SavingAccount(int number, int agency, int type, String owner, float balance, int aniversary) {
		super(number, agency, type, owner, balance);
		this.aniversary = aniversary;
	}

	public int getAniversary() {
		return aniversary;
	}

	public void setAniversary(int aniversary) {
		this.aniversary = aniversary;
	}
	
	@Override
	public void visualize() {
		super.visualize();
		System.out.println("Account Aniversary: " + this.aniversary);
	}
}

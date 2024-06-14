package bankaccount.model;

public class BankAccount {
	private int number;
	private int agency;
	private int type;
	private String owner;
	private float balance;
	
	public BankAccount(int number, int agency, int type, String owner, float balance) {
		this.number = number;
		this.agency = agency;
		this.type = type;
		this.owner = owner;
		this.balance = balance;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getAgency() {
		return agency;
	}

	public void setAgency(int agency) {
		this.agency = agency;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public boolean withdraw(float value) {
		if(this.balance < value) {
			System.out.println("\n Insufficient Balance!");
			return false;
		}
		
		this.setBalance(this.getBalance() - value);
		return true;
	}
	
	public void deposit(float value) {
		this.setBalance(this.getBalance() + value);
	}
	
	public void visualize() {
		String type = "";
		
		switch(this.type) {
			case 1:
				type = "Checking Account"; // PT-BR: conta-corrente
				break;
			case 2:
				type = "Savings Account"; // PT-BR: conta poupança
				break;
		}
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Account Data:");
		System.out.println("***********************************************************");
		System.out.println("Account Number: " + this.number);
		System.out.println("Agency: " + this.agency);
		System.out.println("Account Type: " + type);
		System.out.println("Owner: " + this.owner);
		System.out.printf("Balance: %.2f\n", this.balance);
	}
}

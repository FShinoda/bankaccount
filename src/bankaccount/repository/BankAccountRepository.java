package bankaccount.repository;

import bankaccount.model.BankAccount;

public interface BankAccountRepository {
	
	// CRUD
	public void searchByNumber(int number);
	public void listAll();
	public void register(BankAccount bankaccount);
	public void update(BankAccount bankaccount);
	public void delete(int number);

	public void withdraw(int number, float value);
	public void deposit(int number, float value);
	public void transfer(int numberFrom, int numberTo, float value);

}

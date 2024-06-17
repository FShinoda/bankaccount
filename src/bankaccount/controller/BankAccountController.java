package bankaccount.controller;

import java.util.ArrayList;

import bankaccount.model.BankAccount;
import bankaccount.repository.BankAccountRepository;

public class BankAccountController implements BankAccountRepository {
	private ArrayList<BankAccount> accountList = new ArrayList<BankAccount>();
	int number = 0;
			
	@Override
	public void searchByNumber(int number) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listAll() {
		for(var acc : accountList) {
			acc.visualize();
		}
		
	}

	@Override
	public void register(BankAccount bankaccount) {
		accountList.add(bankaccount);
		System.out.println("\n Account number " + bankaccount.getNumber() + "was sucessfully created!");
		
	}

	@Override
	public void update(BankAccount bankaccount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int number) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw(int number, float value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit(int number, float value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transfer(int numberFrom, int numberTo, float value) {
		// TODO Auto-generated method stub
		
	}
	
	public int generateNumber() {
		return ++ number;
	}

}

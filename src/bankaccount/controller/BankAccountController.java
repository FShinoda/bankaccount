package bankaccount.controller;

import java.util.ArrayList;

import bankaccount.model.BankAccount;
import bankaccount.repository.BankAccountRepository;

public class BankAccountController implements BankAccountRepository {
	private ArrayList<BankAccount> accountList = new ArrayList<BankAccount>();
	int number = 0;
			
	@Override
	public void searchByNumber(int number) {
		var acc = searchInCollection(number);
		
		if(acc != null) {
			acc.visualize();
		} else {
			System.out.println("\n An account with number "+ number + " was not found.");
		}
		
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
		System.out.println("\n Account number " + bankaccount.getNumber() + " was sucessfully created!");
		
	}

	@Override
	public void update(BankAccount bankaccount) {
		var acc = searchInCollection(bankaccount.getNumber());
		
		if(acc != null) {
			accountList.set(accountList.indexOf(acc), bankaccount);
			System.out.println("\n Account number " + bankaccount.getNumber() + " updated!");
		} else {
			System.out.println("\n Account number " + bankaccount.getNumber() + " not found.");
		}
		
	}

	@Override
	public void delete(int number) {
		var acc = searchInCollection(number);
		
		if(acc != null) {
			if(accountList.remove(acc)) System.out.println("\n The account with number "+ number + " is now deleted.");
		} else {
			System.out.println("\n An account with number "+ number + " was not found.");
		}
		
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
	
	public BankAccount searchInCollection(int number) {
		for(var acc : accountList) {
			if(acc.getNumber() == number) {
				return acc;
			}			
		}
		return null;
	}

}

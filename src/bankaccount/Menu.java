package bankaccount;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import bankaccount.controller.BankAccountController;
import bankaccount.model.CheckingAccount;
import bankaccount.model.SavingAccount;
import bankaccount.util.Colors;

public class Menu {

	public static void main(String[] args) {
		BankAccountController account = new BankAccountController();
		Scanner sc = new Scanner(System.in);
		int option, number, agency, type, aniversary;
		String owner;
		float balance, limit;
		
		while (true) {
		    System.out.println(Colors.TEXT_YELLOW + Colors.ANSI_BLACK_BACKGROUND
		    		+ "********************************************");
		    System.out.println("                                            ");
		    System.out.println("                BRAZIL BANK                 ");
		    System.out.println("                                            ");
		    System.out.println("********************************************");
		    System.out.println("                                            ");
		    System.out.println("       1 - Create Account                   ");
		    System.out.println("       2 - List All Accounts                ");
		    System.out.println("       3 - Consult Account Data by Number   ");
		    System.out.println("       4 - Update Account Data              ");
		    System.out.println("       5 - Delete Account                   ");
		    System.out.println("       6 - Withdrawal                       ");
		    System.out.println("       7 - Deposit                          ");
		    System.out.println("       8 - Transfer Between Accounts        ");
		    System.out.println("       9 - Exit                             ");
		    System.out.println("                                            ");
		    System.out.println("********************************************");
		    System.out.println("                                            ");
		    System.out.println(" Type the desired option:                   ");
		    System.out.println("                                                     " + Colors.TEXT_RESET);
		    
		    try {
		    	option = sc.nextInt();		    	
		    } catch(InputMismatchException e) {
		    	System.out.println("\nType integer values!");
		    	sc.nextLine();
		    	option = 0;
		    }
		    
		    switch (option) {
		    case 1:
		        System.out.println(Colors.TEXT_WHITE + "Create account\n\n");
		        
	            System.out.println("Type the agency number: ");
	            agency = sc.nextInt();
	            System.out.println("Type the account owner's name: ");
	            sc.skip("\\R");
	            owner = sc.nextLine();

	            do {
	                System.out.println("Type the account type (1-CA ou 2-SA): ");
	                type = sc.nextInt();
	            } while (type < 1|| type > 2);

	            System.out.println("Type the account balance (R$): ");
	            balance = sc.nextFloat();

	            switch (type) {
	                case 1 -> {
	                    System.out.println("Type the credit limit (R$): ");
	                    limit = sc.nextFloat();
	                    account.register(new CheckingAccount(account.generateNumber(), agency, type, owner, balance, limit));
	                }
	                case 2 -> {
	                    System.out.println("Type the account aniversary: ");
	                    aniversary = sc.nextInt();
	                    account.register(new SavingAccount(account.generateNumber(), agency, type, owner, balance, aniversary));
	                }
	            }
		        
		        keyPress();
		        break;
		    case 2:
		        System.out.println(Colors.TEXT_WHITE + "List all accounts\n\n");
		        account.listAll();
		        keyPress();
		        break;
		    case 3:
		        System.out.println(Colors.TEXT_WHITE + "Consult account data by number\n\n");
		        keyPress();
		        break;
		    case 4:
		        System.out.println(Colors.TEXT_WHITE + "Update account data\n\n");
		        keyPress();
		        break;
		    case 5:
		        System.out.println(Colors.TEXT_WHITE + "Delete account\n\n");
		        keyPress();
		        break;
		    case 6:
		        System.out.println(Colors.TEXT_WHITE + "Withdrawal\n\n");
		        keyPress();
		        break;
		    case 7:
		        System.out.println(Colors.TEXT_WHITE + "Deposit\n\n");
		        keyPress();
		        break;
		    case 8:
		        System.out.println(Colors.TEXT_WHITE + "Transfer between accounts\n\n");
		        keyPress();
		        break;
		    case 9:
		    	System.out.println(Colors.TEXT_WHITE + "\nBrazil Bank - Your future is here!");
		        about();
		        sc.close();
		        System.exit(0);
		    	break;
		    default:
		        System.out.println(Colors.TEXT_RED_BOLD + "\n[!]Invalid Option!\n" + Colors.TEXT_RESET);
		        keyPress();
		        break;
		    }
		}
	}
	
	public static void about() {
		System.out.println("\n****************************************************************************************");
		System.out.println("Project made by: ");
		System.out.println("Fernanda Shinoda - fernanda.shinoda@hotmail.com - at Generation Bootcamp");
		System.out.println("github.com/fshinoda");
	    System.out.println("****************************************************************************************");
	}
	
	public static void keyPress() {
		try {
			System.out.println(Colors.TEXT_RESET + "\n\nPress Enter to Continue...");
			System.in.read();
		} catch(IOException e) {
			System.out.println("This is not the Enter Key >:(");
		}
	}

}

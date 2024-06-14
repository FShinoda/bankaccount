package bankaccount;

import java.util.Scanner;

import bankaccount.model.BankAccount;
import bankaccount.model.CheckingAccount;
import bankaccount.model.SavingAccount;
import bankaccount.util.Colors;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option;
		
		// BankAccount testing
		BankAccount b1 = new BankAccount(1, 123, 1, "Andrea", 10000.0f);
		b1.visualize();
		b1.withdraw(12000.0f);
		b1.visualize();
		b1.deposit(5000.0f);
		b1.visualize();
		
		// CheckingAccount testing
		CheckingAccount ca1 = new CheckingAccount(1, 123, 1, "José da Silva", 0.0f, 1000.0f);
		ca1.visualize();
		ca1.withdraw(12000.0f);
		ca1.visualize();
		ca1.deposit(5000.0f);
		ca1.visualize();
		
        // SavingAccount testing
		SavingAccount sa1 = new SavingAccount(2, 123, 2, "Maria dos Santos", 100000.0f, 15);
		sa1.visualize();
        sa1.withdraw(1000.0f);
		sa1.visualize();
		sa1.deposit(5000.0f);
		sa1.visualize();
		
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
		    
		    option = sc.nextInt();
		    
		    switch (option) {
		    case 1:
		        System.out.println(Colors.TEXT_WHITE + "Create account\n\n");
		        break;
		    case 2:
		        System.out.println(Colors.TEXT_WHITE + "List all accounts\n\n");
		        break;
		    case 3:
		        System.out.println(Colors.TEXT_WHITE + "Consult account data by number\n\n");
		        break;
		    case 4:
		        System.out.println(Colors.TEXT_WHITE + "Update account data\n\n");
		        break;
		    case 5:
		        System.out.println(Colors.TEXT_WHITE + "Delete account\n\n");
		        break;
		    case 6:
		        System.out.println(Colors.TEXT_WHITE + "Withdrawal\n\n");
		        break;
		    case 7:
		        System.out.println(Colors.TEXT_WHITE + "Deposit\n\n");
		        break;
		    case 8:
		        System.out.println(Colors.TEXT_WHITE + "Transfer between accounts\n\n");
		        break;
		    case 9:
		    	System.out.println(Colors.TEXT_WHITE + "\nBrazil Bank - Your future is here!");
		        about();
		        sc.close();
		        System.exit(0);
		    	break;
		    default:
		        System.out.println(Colors.TEXT_RED_BOLD + "\n[!]Invalid Option!\n" + Colors.TEXT_RESET);
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

}

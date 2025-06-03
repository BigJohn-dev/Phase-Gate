import java.util.Scanner;

public class AtmSimulationTest {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	String ATMmenu = """

WELCOME TO SEMICOLON BANK
	...pick an option...

1. Deposit
2. Withdraw
3. Check Balance
4. Transaction History
5. Log out
""";
System.out.println(ATMmenu);
int choice = input.nextInt();

	if (choice == 1) {
	System.out.println("DEPOSIT AN AMOUNT...");
	System.out.println("\nEnter amout: ");
	double amount = input.nextDouble();
	System.out.println(AtmSimulation.deposit_money());
	
} else if (choice == 2) {
	System.out.println("WITHDRAW MONEY...");
	System.out.println("\nEnter amout: ");
	double withdraw = input.nextDouble();
	AtmSimulation.withdraw_money();

} else if (choice == 3) {
	System.out.println("CHECK BALANCE...");
	System.out.println(AtmSimulation.getAccountBalance());

} else if (choice == 4) {
	System.out.println("TRANSACTION HISTORY...");
	System.out.println(AtmSimulation.getAccountBalance());

} else if (choice == 5) {
	System.out.println("log out...");
	System.out.println("...thank you for banking with us");
	System.out.println("...@SEMICOLON BANK");
	break;
	
} else {
	System.out.println("Invalid choice");
}







}
}
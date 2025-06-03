public class AtmSimulation {

	private double balance;

	public AtmSimulation (double balance){
		this.balance = balance;
}

	public double getAccountBalance() {
	return balance;
}
	
	public void deposit_money(double amount){
	if (amount > 0) {
	balance += amount;
	System.out.println("Deposited N" + amount + "New balance is N" + balance);
}else {
	System.out.println("Invalid deposit amount or Invalid account number!!");
}
}

	public void withdraw_money(double amount){
	if (amount > 0 && amount <= 20000 && amount <= balance) {
	balance -= amount + 100;
	System.out.println("Withdrawal amount N" + amount + ", Withdrawal fee N 100, New balance is N" + balance);
}
	else if (amount > 20000) {
	System.out.println("Exceeded withdrawal limit");
}else {	
	System.out.println("Invalid amount or Insuffient money");
}
}

	public double getBalance(){
	return balance;
}
	public void displayAccountDetails() {
	System.out.println("Account balance: N" + balance);
}


	

 
}
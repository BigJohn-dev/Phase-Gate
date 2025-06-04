import java.util.Scanner;

public class payroll {

	private String name;

	public void (String name) {
	this.name;
}

	public static void addPayrollIn() {
	if (name)
}

	public static String federalWithholding(int amount) {
	int federalWithholding = 0.2;
	int result = federalWithholding * amount;
	return "Federal Withholding (20.0%): " + result;
}
	public static String stateWithholding(int amount) {
	int stateWithholding = 0.09;
	int result = stateWithholding * amount;
	return "State Withholding (9.0%): " + result;
}


	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("WELCOME TO SEMICOLON AFRICA");
	System.out.println("\nSEMICOLON PAYROLL PAGE");
	System.out.println("...keeping track of your employee's pays");

	String payrollOption = """
...select an option
=============================
1. Add an Employee payroll
2. View all Employees payroll
3. Update an Employee's payroll
4. Exit
=============================
	""";
	System.out.println(payrollOption);
	int selected = input.nextInt();

	if (selected == 1) {
	System.out.println("ADD AN EMPLOYEE PAYROLL");
	System.out.print("Enter employee name: ");
	String name = input.next();
	System.out.print("Enter numbers of hours worked: ");
	int hours = input.nextInt();
	System.out.print("Enter employee pay rate: ");
	double payRate = input.nextDouble();

	double grossPay = hours * payRate;
	System.out.println(payroll.federalWithholding(grossPay));
	System.out.println(payroll.stateWithholding(grossPay));

} else if (selected == 2) {
	System.out.println("VIEW ALL EMPLOYEE PAYROLL");
	System.out.println(payroll.viewPayroll());

} else if (selected == 3) {
	System.out.println("UPDATE AN EMPLOYEE'S PAYROLL");

} else if (selected == 4) {
	System.out.println("...thank you or using our app");
	System.out.println("...@semicolon.africa");
	break;

} else {
	System.out.println("...invalid selected option");
}


}
}
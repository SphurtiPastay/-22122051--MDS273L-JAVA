

import java.util.ArrayList;
import java.util.Scanner;



public class newlab4 { 





    public int accNumber;
    public String accHolderName;
    public double accBalance;
    public ArrayList<String> transactions;
    

    public void Customerdetail() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        accNumber = sc.nextInt();

        System.out.print("Enter account holder name: ");
        accHolderName = sc.next();

        System.out.print("Enter account balance: ");
        accBalance = sc.nextDouble();

        transactions = new ArrayList<String>();
        transactions.add(String.format("Account initialized with balance: $%.2f", accBalance));
    }

    public void deposit() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter TotalAmount to deposit: ");
        double TotalAmount = sc.nextDouble();

        accBalance += TotalAmount;
        transactions.add(String.format("Deposit: $%.2f, New balance: $%.2f", TotalAmount, accBalance));
    }

    public void withdraw() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter TotalAmount to withdraw: ");
        double TotalAmount = sc.nextDouble();

        if (TotalAmount > accBalance) {
            System.out.println("Insufficient balance.");
            return;
        }

        accBalance -= TotalAmount;
        transactions.add(String.format("Withdrawal: $%.2f, New balance: $%.2f", TotalAmount, accBalance));
    }

    public void printTransactions() {
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }

    public void Summary(){ 

        System.out.println("Account number: " + accNumber);
        System.out.println("Account holder name: " + accHolderName);
        System.out.println("Account balance: $" + accBalance);
    }

    public static void main(String[] args) {
        
        

        newlab4 account = new newlab4();
        account.Customerdetail();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter operation:\n1. Deposit\n2. Withdraw\n3. Print transactions\n4. Print account summary\n5. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    account.deposit();
                    break;

                case 2:
                    account.withdraw();
                    break;

                case 3:
                    account.printTransactions();
                    break;

                case 4:
                    account.Summary();
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}





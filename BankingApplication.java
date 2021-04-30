import java.util.*;

public class BankingApplication {

    private String name;
    private int id;
    private double balance;
    private double transaction;

    public BankingApplication(int id, String name){
        this.id = id;
        this.name = name;
        this.balance = 0.0;
        this.transaction = 0.0;
    }

    public String getName(){
        return name;
    }
    public int getID(){
        return id;
    }
    public double getBalance(){
        return balance;
    }

    public void setName(String newName){
        name = newName;
    }
    public void setID(int newID){
        id = newID;
    }
    public void setBalance(double newBalance){
        balance = newBalance;
    }
    public void makeDeposit(double deposit){
        balance = balance + deposit;
        transaction = +deposit;
    }
    public void makeWithdrawal(double withdrawal){
        balance = balance - withdrawal;
        transaction = -withdrawal;
    }
    public void getPreviousTransaction(){
        if (transaction > 0){
            System.out.println("Deposit: $" + transaction);
        }
        else if (transaction < 0){
            System.out.println("Withdrawal: $" + Math.abs(transaction));
        }
        else{
            System.out.println("Invalid transaction.");
        }
    }

    public void showMenu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("Name: " + name + "\nID: " + id + "\nCurrent Balance: $" + balance + "\n");
        System.out.println("1. Check Balance");
        System.out.println("2. Make Deposit");
        System.out.println("3. Make Withdrawal");
        System.out.println("4. Check Previous Transaction");
        System.out.println("4. Return to menu");
        System.out.println("6. Exit Account");
        System.out.println("---------------------------");

        String answer = "";
        do{
            System.out.println("Would you like to do?");
            answer = scan.nextLine();
            switch (answer){
                //get balance
                case "1":
                    System.out.println("Your balance is: $" + getBalance());
                    break;
                //make a transaction
                case "2":
                    System.out.println("Enter deposit amount: ");
                    double depositAmount = scan.nextDouble();
                    makeDeposit(depositAmount);
                    scan.nextLine();
                    break;
                //make a withdrawal
                case "3":
                    System.out.println("Enter withdrawal amount: ");
                    double withdrawalAmount = scan.nextDouble();
                    makeWithdrawal(withdrawalAmount);
                    scan.nextLine();
                    break;
                //show previous transaction
                case "4":
                    getPreviousTransaction();
                    break;
                //return to menu
                case "5":
                    showMenu();
                    break;
                //exit application
                case "6":
                    break;
                //for invalid input
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
        while(!answer.equals("6"));
        System.out.println("Goodbye.");
    }
}

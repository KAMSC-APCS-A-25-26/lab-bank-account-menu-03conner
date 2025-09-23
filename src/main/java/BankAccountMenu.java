import java.util.Scanner;

public class BankAccountMenu {
    public static void main(String[] args) {
        double add, balance, withdraw;
        boolean run = true;
        int choice;
        balance = 0;
        Scanner sc= new Scanner(System.in);
        while (run){
            System.out.println("---Bank Account Money---");
            System.out.println("1. Add Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println();
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter amount to add: ");
                add = sc.nextInt();
                System.out.println();
                balance = balance + add;
                System.out.println("New Balance: $" + balance);
                System.out.println();
                break;
            case 2:
                System.out.println("Enter amount to withdraw: ");
                System.out.println();
                withdraw = sc.nextInt();
                if (withdraw > balance){
                    System.out.println("Insufficient Funds");
            }
                else {
                    balance = balance - withdraw;
                    System.out.println("New Balance: $" + balance);
                }
                break;

            case 3:
                System.out.println("Balance is: $" + balance);
                System.out.println();
                break;
            case 4:
                run = false;
                break;
        }
        }
        System.out.println("Goodbye");
    }
}

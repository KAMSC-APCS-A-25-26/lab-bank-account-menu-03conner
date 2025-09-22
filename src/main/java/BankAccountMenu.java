import java.util.Scanner;

public class BankAccountMenu {
    public static void main(String[] args) {
        double add, x , y, balance, withdraw;
        boolean run = true;
        int choice;
        balance = 0;
        Scanner sc= new Scanner(System.in);
        while (run){
            System.out.println("---Bank Accout Money---");
            System.out.println("1. Add Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter amount to add: ");
                add = sc.nextInt();
                balance = balance + add;
                System.out.println("Added " + add);
                System.out.println("New Balance: " + balance);
                break;
            case 2:
                System.out.println("Enter amount to withdraw: ");
                withdraw = sc.nextInt();
                balance = balance - withdraw;
                System.out.println("Withdraw " + withdraw);
                System.out.println("New Balance: " + balance);
                break;

            case 3:
                System.out.println("Balance is: " + balance);
                break;
            case 4:
                run = false;
                break;
        }
        }
        System.out.println("goodbye");
        // TODO: Implement the bank account menu
        // 1. Create a double variable for balance
        // 2. Create a while loop for the menu
        // 3. Display the menu options
        // 4. Use Scanner to read user input
        // 5. Use switch statement to handle menu choices
        // 6. Implement add money, withdraw money, check balance, and exit functionality
    }
}

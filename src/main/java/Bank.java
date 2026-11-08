import java.util.Scanner;

public class Bank {
    public static void main(String[] args){
        System.out.println("Welcome to the NurkaBank");
        Scanner scanner = new Scanner(System.in);
        String yourName = scanner.nextLine();
        String yourLastName = scanner.nextLine();
        System.out.println("Hello " + yourName + " " + yourLastName);

        BankAccount account1 = new BankAccount(yourName, 1000);
        account1.showBalance();
        account1.deposit(120);
        account1.showBalance();
        account1.withdraw(400);
        account1.showBalance();

        BankAccount account2 = new BankAccount("Alex", 1500);
        account2.showBalance();
        account2.deposit(100);
        account2.showBalance();
        account2.withdraw(90);
        account2.showBalance();

        scanner.close();

        }





    }

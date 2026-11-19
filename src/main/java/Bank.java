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

        BankAccount account2 = new BankAccount("Alex.", 1500);
        account2.showBalance();
        account2.deposit(100);
        account2.showBalance();
        account2.withdraw(90);
        account2.showBalance();

        BankAccount account3 = new BankAccount("Tom", 9000);
        String name = account3.getName();
        System.out.println(name);

        BankAccount account4 = new BankAccount("L", 10000);
        String nameL = account4.getName();
        System.out.println(nameL);

        account1.setName("Nurbolat");
        String nameChange = account1.getName();
        System.out.println(nameChange);
        account2.setName("");

        account1.transfer(account2, 1000);
        account1.showBalance();
        account2.showBalance();

        account2.transfer(account3, 500);
        account2.showBalance();
        account3.showBalance();

        account1.transfer(account2, 99999); // не должно получиться
        account1.showBalance();
        account2.showBalance();

        BankAccount account5 = new BankAccount("Me", 90000);
        SavingsAccount account6 = new SavingsAccount("Akerke", 9000000, 8);

        account5.showBalance();
        account6.showBalance();

        }





    }

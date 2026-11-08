public class BankAccount{
    String name;
    double balance;

    public BankAccount(String name, double balance){
        this.name = name;
        if(balance < 0){
            System.out.println("Error");
            this.balance = 0;
        }else{
            this.balance = balance;
        }

    }

    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Invalid amount");
        }else{
            balance += amount;


        }
    }

    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Invalid amount");

        } else if (amount > balance) {
            System.out.println("Not enough money");

        }else{
            balance -= amount;

        }


    }

    public void showBalance(){
        System.out.println("Balance: " + balance);
    }
}
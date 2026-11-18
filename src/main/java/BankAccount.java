public class BankAccount{
    private String name;
    private double balance;

    public BankAccount(String name, double balance){
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;

        if(balance < 0){
            throw new IllegalArgumentException("Invalid balance");
        }
        this.balance = balance;




    }

    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Invalid amount");
        }else{
            balance += amount;


        }
    }

    public boolean withdraw(double amount){
        if(amount <= 0){
            System.out.println("Invalid amount");
            return false;

        } else if (amount > balance) {
            System.out.println("Not enough money");
            return false;
        }else{
            balance -= amount;
            return true;
        }
    }

    public void transfer(BankAccount to, double amount){
        if(to == null){
            System.out.println("Account not found");
            return;
        }
        if (to == this){
            System.out.println("Cannot transfer to the same account");
            return;
        }
        if (!withdraw(amount)){
            return;

        }
        to.deposit(amount);
    }


    public void showBalance(){
        System.out.println("Balance: " + balance);


    }
    public String getName(){
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String newName){
        if (newName != null && !newName.isBlank()) {
            this.name = newName;
        }else {
            System.out.println("Invalid name");
        }

    }
}
import javax.security.sasl.SaslException;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(String name, double balance, double interestRate){
        super(name, balance);
        this.interestRate = interestRate;
    }

    public void AddInterest(){
        deposit(getBalance() * interestRate / 100);
        showBalance();
    }
    @Override
    public void showBalance(){
        super.showBalance();
        System.out.println("Interest rate " + interestRate + " %" );


    }
}
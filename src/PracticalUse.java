/*Write a Java program to create a class called "BankAccount" with attributes for account number, account holder's name, and balance. Include methods for depositing and withdrawing money, as well as  checking the balance.
Create a subclass called "SavingsAccount" that adds an interest rate attribute and a method to apply interest.

-> Create a subclass called "SavingsAccount" that adds an interest rate of 4% and a method to apply interest. (edited)
-> create a subclass called "FDAccount" that adds interest rate of 6% and method to apply interest

Homework

-> Employee belongs to different department like tech, hr, accounting,
-> Calculate Salary and Bonus of different department
-> tech is 20 , hr is 10 accounting is 15 percent
 */




class Bank
{
    private String account;
    private String accountHolder;
    private  int  balance;


    public Bank(String account, String accountHolder, int balance)
    {
        this.account = account;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void DepositMoney(int amount)
    {
        balance = balance + amount;
        System.out.println("Printing the balance amount" + balance);
    }

    public void WithdrwalMoney(int amount)
    {
        balance = balance - amount;
        System.out.println("Printing the balance amount"+ balance);
    }
    public int CheckBalance()
    {
        return balance;
    }
}

class SavingAccount extends Bank
{
    private int interest;

    public SavingAccount(String account, String accountHolder, int balance, int interest )
    {
        super(account, accountHolder, balance);
        this.interest = interest;
    }

    public void ApplyIntrest()
    {

        interest = CheckBalance() *4/100;
        DepositMoney(interest);
    }
}

class FDAccount extends  Bank{

    private int interest;
    public FDAccount(String account, String accountHolder,int balance, int interest)
    {
        super(account, accountHolder, balance);
        this.interest = interest;
    }

    public void ApplyInterest()
    {
        DepositMoney(CheckBalance() * this.interest/100);
    }
}


public class PracticalUse {
public static  void main(String[] args)
{
    Bank bank = new Bank("12343","Sanyam Gujral", 10000);
    System.out.println("Printing the bank balance :  " + bank.CheckBalance());
    bank.DepositMoney(1000);
    System.out.println("Printing the bank balance :  " + bank.CheckBalance());
    bank.WithdrwalMoney(500);
    System.out.println("Printing the bank balance : " + bank.CheckBalance());
    SavingAccount savingAccount = new SavingAccount("2345","Shreya Gujral", 2000, 4);
    System.out.println("Printing the bank balance :  " + savingAccount.CheckBalance());
    savingAccount.ApplyIntrest();
    System.out.println("Printing the bank balance :  " + savingAccount.CheckBalance());
   FDAccount fdAccount = new FDAccount("12789", "Sam Gujral", 5000, 6);
    fdAccount.ApplyInterest();
    System.out.println("Printing the bank balance :  " + fdAccount.CheckBalance());
}
}
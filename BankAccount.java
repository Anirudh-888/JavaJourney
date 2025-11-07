public class BankAccount
{
    int AccountNumber;
    String HolderName;
    double Balance;
    final String BankName = "National Bank of Java";
    static int TotalAccounts;
    void deposit(double amount)
    {
        System.out.println("The amount added to the bank account is"+(amount+Balance));
        Balance = Balance+amount;
    }
    void withdraw(double amount)
    {
        System.out.println("The amount withdrawn from the bank account is"+(Balance-amount));
        Balance = Balance-amount;
    }
    void display()
    {
        System.out.println("The account details are"+(AccountNumber)+(HolderName)+(Balance));
    }
    static void ShowTotalAccounts()
    {
        System.out.println("The total number of accounts created is "+(TotalAccounts));
    }

    public BankAccount(int AccountNumber, String HolderName, double Balance) {
        this.AccountNumber = AccountNumber;
        this.HolderName = HolderName;
        this.Balance = Balance;
        TotalAccounts++;
    }
public static void main(String args[])
{
    BankAccount b1 = new BankAccount(52632142, "Prajwal", 20000);
    BankAccount b2 = new BankAccount(63640167, "Anirudh", 600000);
    b1.display();
    b1.deposit(500);
    b2.deposit(523652);
    b1.display();
    b2.display();
    BankAccount.ShowTotalAccounts();
}
}
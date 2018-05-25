public class Account {
    private String accountName;
    private double balance;

    //Constructor with 2 params (name and initial balance)
    public Account(String accountName, double balance) {
        this.accountName = accountName;

        if (balance > 0.0)
            this.balance = balance;
    }

    public void deposit (double depositAmount){
        if (depositAmount >0.0){
            balance += depositAmount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}

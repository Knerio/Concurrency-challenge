package dario;

public class BankAccount {
    private long noOfWithdrawals;
    private long accountValue;

    public BankAccount(long value) {
        this.accountValue = value;
    }

    public synchronized void withdraw(long value) {
        accountValue -= value;
        noOfWithdrawals++;
    }
    public synchronized void deposit(long value) {
        accountValue += value;
    }
    public synchronized long getAccountValue() {
        return accountValue;
    }
    public synchronized long getNoOfWithdrawals() {
        return noOfWithdrawals;
    }
}

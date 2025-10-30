package dario;

public class BankAccount {
    private long noOfWithdrawals = 0;
    private long noOfDeposits = 0;
    private long accountValue;
    private long lastWithdrawal;
    private final String name;

    public BankAccount(long value, String name) {
        this.accountValue = value;
        this.name = name;
    }

    public synchronized void withdraw(long value) {
        accountValue -= lastWithdrawal = value;
        noOfWithdrawals++;
    }

    public synchronized void cancelLastWithdraw() {
        accountValue += lastWithdrawal;
        noOfWithdrawals--;
    }

    public synchronized void deposit(long value) {
        noOfDeposits++;
        simulateLinkDrop();
        accountValue += value;
    }

    public void simulateLinkDrop() {
        long c = noOfDeposits;
        if (c == 1000 || c == 10_000) {
            throw new RuntimeException("Link dropped");
        }
    }

    public String getName() {
        return name;
    }

    public synchronized long getAccountValue() {
        return accountValue;
    }
    public synchronized long getNoOfWithdrawals() {
        return noOfWithdrawals;
    }
}

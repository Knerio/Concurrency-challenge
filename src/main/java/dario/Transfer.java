package dario;

public class Transfer {

    private final BankAccount from;
    private final BankAccount to;
    private final BankAccount service;
    private final long amount;

    public Transfer(BankAccount from, BankAccount to, BankAccount service, long amount) {
        this.from = from;
        this.to = to;
        this.service = service;
        this.amount = amount;
    }

    public synchronized void execute() {
        synchronized (Transfer.class) {
            to.deposit(amount);

            int fee = 0;
            if (from.getNoOfWithdrawals() + 1 > 10_000) {
                service.deposit(2);
                fee += 2;
            } else if (from.getNoOfWithdrawals() + 1 > 1_000) {
                service.deposit(1);
                fee += 1;
            }
            from.withdraw(amount + fee);
        }
    }
}

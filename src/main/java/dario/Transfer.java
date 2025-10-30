package dario;

public class Transfer {

    private final BankAccount from;
    private final BankAccount to;
    private final long amount;

    public Transfer(BankAccount from, BankAccount to, long amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public synchronized void execute() {
        int fee = 0;
        if (from.getNoOfWithdrawals() > 10_000) {
            fee = 2;
        } else if (from.getNoOfWithdrawals() > 1_000) {
            fee = 1;
        }
        from.withdraw(amount + fee);


        try {
            to.deposit(amount);
        } catch (RuntimeException ex) {
            System.out.println("--");
            System.out.println(to.getName());
            System.out.println(from.getName());
            System.out.println(amount);
            System.out.println(fee);
            System.out.println("---");
            from.cancelLastWithdraw();
        }
    }
}

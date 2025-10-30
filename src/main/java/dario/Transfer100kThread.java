package dario;

public class Transfer100kThread implements Runnable {

    private final Transfer transfer;
    private final BankAccount A, B, C;

    public Transfer100kThread(Transfer transfer, BankAccount a, BankAccount b, BankAccount c) {
        this.transfer = transfer;
        this.A = a;
        this.B = b;
        this.C = c;

    }

    @Override
    public void run() {
        for (int i = 0; i < 100_000; i++) {
            transfer.execute();
        }
        System.out.println("A: " + A.getAccountValue());
        System.out.println("B: " + B.getAccountValue());
        System.out.println("C: " + C.getAccountValue());
    }
}

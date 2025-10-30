package dario;


public class Main {
    static void main() {
        BankAccount A = new BankAccount(10_000_000, "A");
        BankAccount B = new BankAccount(10_000_000, "B");
        BankAccount C = new BankAccount(10_000_000, "C");

        Transfer transfer1 = new Transfer(A, B, 10);
        Transfer transfer2 = new Transfer(A, B, 10);
        Transfer transfer3 = new Transfer(B, C, 10);
        Transfer transfer4 = new Transfer(B, C, 10);
        Transfer transfer5 = new Transfer(C, A, 10);
        Transfer transfer6 = new Transfer(C, A, 10);

        new Thread(new Transfer100kThread(transfer1, A, B, C)).start();
        new Thread(new Transfer100kThread(transfer2, A, B, C)).start();
        new Thread(new Transfer100kThread(transfer3, A, B, C)).start();
        new Thread(new Transfer100kThread(transfer4, A, B, C)).start();
        new Thread(new Transfer100kThread(transfer5, A, B, C)).start();
        new Thread(new Transfer100kThread(transfer6, A, B, C)).start();

    }
}

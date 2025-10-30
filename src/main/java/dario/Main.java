package dario;


public class Main {
    static void main() {
        BankAccount A = new BankAccount(10_000_000);
        BankAccount B = new BankAccount(10_000_000);
        BankAccount C = new BankAccount(10_000_000);
        BankAccount service = new BankAccount(0);

        Transfer transfer1 = new Transfer(A, C, service, 10);
        Transfer transfer2 = new Transfer(A, C, service, 10);
        Transfer transfer3 = new Transfer(A, C, service, 10);
        Transfer transfer4 = new Transfer(A, C, service, 10);

        Transfer transfer5 = new Transfer(B, C, service, 10);
        Transfer transfer6 = new Transfer(B, C, service, 10);
        Transfer transfer7 = new Transfer(B, C, service, 10);
        Transfer transfer8 = new Transfer(B, C, service, 10);

        new Thread(new Transfer100kThread(transfer1, A, B, C, service)).start();
        new Thread(new Transfer100kThread(transfer2, A, B, C, service)).start();
        new Thread(new Transfer100kThread(transfer3, A, B, C, service)).start();
        new Thread(new Transfer100kThread(transfer4, A, B, C, service)).start();
        new Thread(new Transfer100kThread(transfer5, A, B, C, service)).start();
        new Thread(new Transfer100kThread(transfer6, A, B, C, service)).start();
        new Thread(new Transfer100kThread(transfer7, A, B, C, service)).start();
        new Thread(new Transfer100kThread(transfer8, A, B, C, service)).start();

    }
}

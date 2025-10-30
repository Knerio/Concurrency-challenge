package dario;

import dario.counter.Counter;
import dario.counter.CounterImpl;

public class Main {
    static void main() {
        Counter counter = new CounterImpl();

        new Thread(new CountThread(counter)).start();
        new Thread(new CountThread(counter)).start();
        new Thread(new CountThread(counter)).start();
        new Thread(new CountThread(counter)).start();
        new Thread(new CountThread(counter)).start();
        new Thread(new CountThread(counter)).start();
        new Thread(new CountThread(counter)).start();
        new Thread(new CountThread(counter)).start();
    }
}

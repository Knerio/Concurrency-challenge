package dario;

import dario.counter.Counter;

public class CountThread implements Runnable {

    private final Counter counter;

    public CountThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            counter.increment();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Counter: " + counter.get() + " (" +  (endTime - startTime) + "ms)");
    }
}

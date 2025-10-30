package dario;


public class Main {
    static void main() {
        Counter counter = new Counter();
        new Thread(() -> {
            long start = System.currentTimeMillis();
            for (int i = 0; i < 100_000_000; i++) {
                counter.setCounter1(counter.getCounter1() + 1);
            }
            System.out.println("Counter 1: " + counter.getCounter1() + " (" + (System.currentTimeMillis() - start) + "ms)");
        }).start();
        new Thread(() -> {
            long start = System.currentTimeMillis();
            for (int i = 0; i < 100_000_000; i++) {
                counter.setCounter2(counter.getCounter2() + 1);
            }
            System.out.println("Counter 2: " + counter.getCounter2() + " (" + (System.currentTimeMillis() - start) + "ms)");
        }).start();
        new Thread(() -> {
            long start = System.currentTimeMillis();
            for (int i = 0; i < 100_000_000; i++) {
                counter.setCounter3(counter.getCounter3() + 1);
            }
            System.out.println("Counter 3: " + counter.getCounter3() + " (" + (System.currentTimeMillis() - start) + "ms)");
        }).start();
        new Thread(() -> {
            long start = System.currentTimeMillis();
            for (int i = 0; i < 100_000_000; i++) {
                counter.setCounter4(counter.getCounter4() + 1);
            }
            System.out.println("Counter 4: " + counter.getCounter4() + " (" + (System.currentTimeMillis() - start) + "ms)");
        }).start();
        new Thread(() -> {
            long start = System.currentTimeMillis();
            for (int i = 0; i < 100_000_000; i++) {
                counter.setCounter5(counter.getCounter5() + 1);
            }
            System.out.println("Counter 5: " + counter.getCounter5() + " (" + (System.currentTimeMillis() - start) + "ms)");
        }).start();
        new Thread(() -> {
            long start = System.currentTimeMillis();
            for (int i = 0; i < 100_000_000; i++) {
                counter.setCounter6(counter.getCounter6() + 1);
            }
            System.out.println("Counter 6: " + counter.getCounter6() + " (" + (System.currentTimeMillis() - start) + "ms)");
        }).start();
        new Thread(() -> {
            long start = System.currentTimeMillis();
            for (int i = 0; i < 100_000_000; i++) {
                counter.setCounter7(counter.getCounter7() + 1);
            }
            System.out.println("Counter 7: " + counter.getCounter7() + " (" + (System.currentTimeMillis() - start) + "ms)");
        }).start();
        new Thread(() -> {
            long start = System.currentTimeMillis();
            for (int i = 0; i < 100_000_000; i++) {
                counter.setCounter8(counter.getCounter8() + 1);
            }
            System.out.println("Counter 8: " + counter.getCounter8() + " (" + (System.currentTimeMillis() - start) + "ms)");
        }).start();
    }
}

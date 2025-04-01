package Multithreading;

public class Counter {
    private int count = 0; // shared resource

    public  void increment() {
        synchronized (this) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}

    class MyThread3 extends Thread {
        private Counter counter;

        public MyThread3(Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        }

        public static void main(String[] args) {
            Counter counter = new Counter();
            MyThread3 t1 = new MyThread3(counter);
            MyThread3 t2 = new MyThread3(counter);
            t1.start();
            t2.start();
            try {
                t1.join();
                t2.join();
            } catch (Exception e) {
            }
            System.out.println(counter.getCount()); // Expected: 2000, Actual will be random <= 2000
        }
    }
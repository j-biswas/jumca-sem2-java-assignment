import java.util.concurrent.locks.ReentrantReadWriteLock;

public class code3 {
    private static int sharedVariable = 0;
    private static final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public static void main(String[] args) {
        Thread writer1 = new Thread(new Writer());
        Thread writer2 = new Thread(new Writer());
        Thread reader1 = new Thread(new Reader());
        Thread reader2 = new Thread(new Reader());

        writer1.start();
        writer2.start();
        reader1.start();
        reader2.start();
    }

    static class Reader implements Runnable {
        @Override
        public void run() {
            lock.readLock().lock();
            try {
                System.out.println(Thread.currentThread().getName() + " read value: " + sharedVariable);
            } finally {
                lock.readLock().unlock();
            }
        }
    }

    static class Writer implements Runnable {
        @Override
        public void run() {
            lock.writeLock().lock();
            try {
                sharedVariable++;
                System.out.println(Thread.currentThread().getName() + " incremented value to: " + sharedVariable);
            } finally {
                lock.writeLock().unlock();
            }
        }
    }
}

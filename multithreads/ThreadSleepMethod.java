public class ThreadSleepMethod extends Thread {
    @Override
    public void run() {
            try {
                for (int i = 1; i <= 5; i++) {
                    Thread.sleep(800);
                    System.out.println("CurrentThread" + "-" + i);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }

    public static void main(String[] args) {
            ThreadSleepMethod threadSleepMethod = new ThreadSleepMethod();
            threadSleepMethod.start();
    }
}

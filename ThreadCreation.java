public class ThreadCreation extends Thread {
    public int number;

    public ThreadCreation(int number) {
        this.number = number;
    }
    @Override
    public void run() {
        System.out.println("Welcome to Thread" + "-" + number);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            ThreadCreation threads = new ThreadCreation(i);
            threads.start();
        }
    }
}

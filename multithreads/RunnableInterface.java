package multithreads;

public class RunnableInterface implements Runnable{
    public int start;
    public int end;

    RunnableInterface(int start,int end){
        this.start=start;
        this.end=end;
    }

    @Override
    public void run() {
        for (int i=start; i<=end;i++) {
            System.out.println("Numbers: " + i);
        }
    }

    public static void main(String[] args) {
        Runnable runnable=new RunnableInterface(1,5);
        Runnable runnable1=new RunnableInterface(6,10);
        Thread thread=new Thread(runnable);
        Thread thread1=new Thread(runnable1);
        thread.start();
        thread1.start();
    }
}

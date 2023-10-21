
public class Main {


    public static void main(String[] args) {
        final Object resource=new Object();
        Thread thread1=new Thread(()->{
            synchronized (resource){
                System.out.println("thread1 runing ");
                try {
                    Thread.sleep(2000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        Thread thread2=new Thread(()->{
            synchronized (resource){
                System.out.println("thread2 runing");
                try {
                    Thread.sleep(100);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        thread1.start();
        thread2.start();

    }
}

public class Main {
    public static void main(String[] args) {

         final Object lock1=new Object();
         final Object lock2=new Object();

         Thread thread1 = new Thread(new task(lock1,lock2));
         Thread thread2=new Thread(new task(lock2,lock1));
         thread1.start();
         thread2.start();

    }
}
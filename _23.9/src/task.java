public class task implements Runnable  {
    private final Object lock1;
    private final Object lock2;

    public task(Object lock1,Object lock2) {
        this.lock1=lock1;
        this.lock2=lock2;
    }

    @Override
    public void run() {
        synchronized (lock1){
            System.out.println(Thread.currentThread().getName()+" hold a lock1 !");
            try {

                Thread.sleep(200);
            }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            System.out.println(Thread.currentThread().getName()+ " waiting !");
            synchronized (lock2){
                System.out.println(Thread.currentThread().getName()+" hold lock2 !");
            }
            }
        }
    }


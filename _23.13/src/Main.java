
public class Main {
    public static void main(String[] args) {
      CircularBuffer<Integer> buffer=new CircularBuffer<Integer>(5);
      Thread producer =new Thread(()->{
          for (int i=0;i<10;i++){
              try {
                  buffer.put(i);
                  System.out.println("producer :"+i);
                  Thread.sleep(1000);
              }
              catch (InterruptedException e){
                  e.printStackTrace();
              }
          }
      });

      Thread consumer= new Thread(()->{
          for (int i=0;i<10;i++){
              try {
                  int item=buffer.take();
                  System.out.println("consumer :"+item);
                  Thread.sleep(1000);
              }
              catch (InterruptedException e){
                  e.printStackTrace();
              }
          }
        });
      producer.start();
      consumer.start();
    }
}
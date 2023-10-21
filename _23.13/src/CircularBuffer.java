import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class CircularBuffer<T> {
    private final T[] buffer;
    private int size;
    private int capacity;
    private int head;
    private int tail;
    private Lock lock = new ReentrantLock();
    private Condition notFull = lock.newCondition();
    private Condition notEmpty = lock.newCondition();


    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = (T[]) new Object[capacity];
        this.size = 0;
        this.head = 0;
        this.tail = 0;
    }
    public void put(T item) throws InterruptedException{
        lock.lock();
        try{
            while (size==capacity){
                notFull.await();
            }
            buffer[head]=item;
            head=(head+1)%capacity;
            size++;
            notEmpty.signal();
        }
        finally {
            lock.unlock();
        }
    }
    public  T take()throws InterruptedException{
        lock.lock();
        try {
            while (size == 0) {
                notEmpty.await();
            }
            T item = buffer[tail];
            tail = (tail + 1) % capacity;
            size--;
            notFull.signal();
            return item;
        }
        finally {
            lock.unlock();
        }
    }
    public int getSize(){
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
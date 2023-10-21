import java.util.Observer;

public interface subject {
    public void registerObserver(observer o);
    public void removeobserver(observer o);
    public void notifyObserver();

}

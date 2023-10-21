import java.util.ArrayList;
import java.util.Observer;

public class weatherData implements subject{
    private ArrayList observers;
    private float tempreture;
    private float humidaty;
    private float pressure;
    public weatherData(){
        observers=new ArrayList();
    }



    @Override
    public void registerObserver(observer o) {
        observers.add(o);
    }

    @Override
    public void removeobserver(observer o) {
        int i= observers.indexOf(o);
        if(i>=0){
            observers.remove(o);
        }

    }

    @Override
    public void notifyObserver() {

        for(int i=0;i<observers.size();i++){
            observer observerr= (observer)observers.get(i);
            observerr.update(tempreture,humidaty,pressure);
        }
    }
    public void measurmentsChanged(){
        notifyObserver();
    }
    public void setMeasurment(float tempreture,float humidaty,float pressure){
        this.tempreture=tempreture;
        this.humidaty=humidaty;
        this.pressure=pressure;
        measurmentsChanged();
    }
}

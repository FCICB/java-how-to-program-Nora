public class currentConditionDisplay implements observer,display{
 private float temperture;
 private float humidaty;

 public currentConditionDisplay(subject weatherdata){

     weatherdata.registerObserver(this);
 }
    @Override
    public void display() {
        System.out.println("current conditin :"+temperture+"f degrees"+humidaty+"% humidaty");
    }

    @Override
    public void update(float temp, float humadity, float pressure) {
       this.temperture=temperture;
       this.humidaty=humadity;
       display();
    }
}

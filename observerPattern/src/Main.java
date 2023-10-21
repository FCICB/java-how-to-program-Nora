
public class Main {

        public static void main (String[]args){
           weatherData weather=new weatherData();
           currentConditionDisplay currentcondition=new currentConditionDisplay(weather);
           weather.setMeasurment(80,65,30.4f);

        }
    }

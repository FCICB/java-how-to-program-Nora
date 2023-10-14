
public class Main {
    public static void main(String[] args) {
        System.out.println("Mallard !");
     mallardDuck mallard = new mallardDuck();
     mallard.PerformFly();
     mallard.PerformQuack();
        System.out.println("modelDuck !");
     Duck model=new modelDuck();
     model.PerformFly();
     model.setFlyBehavior(new FlyRocket());
     model.PerformFly();

    }
}
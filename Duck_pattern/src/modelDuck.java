public class modelDuck extends Duck {
    public modelDuck(){
        flyBehavior=new FlyNoWay();
        quackbehavior=new Quack();
    }

    @Override
    public void Display() {
        System.out.println("I'm a Model Duck !");
    }
}

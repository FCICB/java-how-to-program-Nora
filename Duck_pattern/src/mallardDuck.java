public class mallardDuck extends Duck{

    public mallardDuck(){
      quackbehavior=new Quack();
      flyBehavior=new FlyWithWIngs();
    }
    @Override
    public void Display() {
        System.out.println("I'm a real mallard duck ");
    }
}

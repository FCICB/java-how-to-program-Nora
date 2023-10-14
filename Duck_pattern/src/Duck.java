public abstract class Duck {
    FlyBehavior flyBehavior;
    Quackbehavior quackbehavior;
    public Duck(){}
    public void swim (){
        System.out.println("all ducks float");
    }
    public abstract void Display();

    public void PerformFly(){
        flyBehavior.Fly();
    }
    public void PerformQuack(){
        quackbehavior.Quack();
    }
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior=fb;
    }
    public void setQuackbehavior(Quackbehavior qb){
        quackbehavior=qb;
    }
}

 public class Main {
    public static void main(String[] args) {
        MallardDuck duck=new MallardDuck();
        Turkey turkey=new WildTurkey();
        Duck turkeyadapter=new TurkeyAdapter(turkey);

        System.out.println("the turkey says ....");
        turkey.gobble();
        turkey.fly();

        System.out.println("the duck says ...");
        testDuck(duck);

        System.out.println("the turkey adapter says ...");
        testDuck(turkeyadapter);
    }
    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}

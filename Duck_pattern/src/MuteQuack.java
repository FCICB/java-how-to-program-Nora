public class MuteQuack implements Quackbehavior{
    @Override
    public void Quack() {
        System.out.println("<< silence >>");
    }
}

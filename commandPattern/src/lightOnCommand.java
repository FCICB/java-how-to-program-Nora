public class lightOnCommand implements Command{

    Light light;
    public lightOnCommand(Light light){
        this.light=light;
    }
    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}

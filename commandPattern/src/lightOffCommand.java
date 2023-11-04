public class lightOffCommand implements Command{
    Light light;
    public lightOffCommand(Light light){
        this.light=light;
    }
    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}

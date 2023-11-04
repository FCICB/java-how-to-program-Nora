
public class Main {

    public static void main(String[] args) {
        remoteControl remote =new remoteControl();
        Light lightLivingRoom=new Light("Living Room");
        lightOnCommand livingOnCommand=new lightOnCommand(lightLivingRoom);
        lightOffCommand livingOffCommand=new lightOffCommand(lightLivingRoom);

        remote.setCommand(0,livingOnCommand,livingOffCommand);
        remote.onButtenWasPushed(0);
        remote.offButtenWasPushed(0);
        System.out.println(remote);

        remote.undoButtenWasPushed();
        remote.offButtenWasPushed(0);
        remote.onButtenWasPushed(0);
        System.out.println(remote);
    }
}
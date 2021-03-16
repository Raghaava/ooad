package command.sample;

public class Remote {

    public static void main(String[] args) {
        Light light = new Light();
        Command slot1 = new LightOnCommand(light);
        Command slot2 = new LightOffCommand(light);

        slot1.execute();
        slot2.execute();
    }
}

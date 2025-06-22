public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();

        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        RemoteControl remote = new RemoteControl();

        // Turn light on
        remote.setCommand(lightOn);
        remote.pressButton();

        // Turn light off
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}

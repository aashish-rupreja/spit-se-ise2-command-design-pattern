package in.ac.spit.mca.se.ise2.tester;

import in.ac.spit.mca.se.ise2.invoker.Remote;
import in.ac.spit.mca.se.ise2.receiver.*;
import in.ac.spit.mca.se.ise2.command.impl.*;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV("Hall Room TV");
        TVSwitchOnCommand tvOnCommand = new TVSwitchOnCommand(tv);
        TVSwitchOffCommand tvOffCommand = new TVSwitchOffCommand(tv);

        Light hallRoomLight = new Light("Hall Room Light");
        LightOnCommand lightOnCommand = new LightOnCommand(hallRoomLight);
        LightOffCommand lightOffCommand = new LightOffCommand(hallRoomLight);

        Remote remote = new Remote(3, 0);
        remote.setOnOffCommand(1, tvOnCommand, tvOffCommand);
        remote.pressOnButton(1);
        remote.pressOffButton(1);
        remote.pressUndoButton();

        remote.setOnOffCommand(2, lightOnCommand, lightOffCommand);
        remote.pressOnButton(2);
        remote.pressOffButton(2);
    }
}
package in.ac.spit.mca.se.ise2.tester;

import in.ac.spit.mca.se.ise2.invoker.Remote;
import in.ac.spit.mca.se.ise2.receiver.*;
import in.ac.spit.mca.se.ise2.command.impl.*;

public class Main {
    public static void main(String[] args) {
        Remote remote = new Remote(1);
        TV tv = new TV("Hall Room TV");
        TVSwitchOnCommand tvOnCommand = new TVSwitchOnCommand(tv);
        TVSwitchOffCommand tvOffCommand = new TVSwitchOffCommand(tv);

        remote.setCommand(0, tvOnCommand, tvOffCommand);
        remote.pressOnButton(0);
        remote.pressOffButton(0);
    }
}
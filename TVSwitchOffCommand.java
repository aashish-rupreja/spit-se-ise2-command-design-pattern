package in.ac.spit.mca.se.ise2.command.impl;

import in.ac.spit.mca.se.ise2.command.Command;
import in.ac.spit.mca.se.ise2.receiver.TV;

public class TVSwitchOffCommand implements Command {

    private TV tv;

    public TVSwitchOffCommand() {}

    public TVSwitchOffCommand(TV tv) {
        this.tv = tv;
    }

    public void setTV(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        this.tv.switchOff();
    }

    public void undo() {
        this.tv.switchOn();
    }
}
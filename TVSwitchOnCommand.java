package in.ac.spit.mca.se.ise2.command.impl;

import in.ac.spit.mca.se.ise2.command.Command;
import in.ac.spit.mca.se.ise2.receiver.TV;

public class TVSwitchOnCommand implements Command {

    private TV tv;

    public TVSwitchOnCommand() {}

    public TVSwitchOnCommand(TV tv) {
        this.tv = tv;
    }

    public void setTV(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        this.tv.switchOn();
    }
}
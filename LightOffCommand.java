package in.ac.spit.mca.se.ise2.command.impl;

import in.ac.spit.mca.se.ise2.command.Command;
import in.ac.spit.mca.se.ise2.receiver.Light;

public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand() {}

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    public void execute() {
        this.light.switchOff();
    }

    public void undo() {
        this.light.switchOn();
    }
}
package in.ac.spit.mca.se.ise2.command.impl;

import in.ac.spit.mca.se.ise2.command.Command;
import in.ac.spit.mca.se.ise2.receiver.Light;

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand() {}

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    public void execute() {
        this.light.switchOn();
    }

    public void undo() {
        this.light.switchOff();
    }
}
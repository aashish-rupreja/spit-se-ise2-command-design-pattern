package in.ac.spit.mca.se.ise2.command.impl;

import in.ac.spit.mca.se.ise2.command.Command;
import in.ac.spit.mca.se.ise2.receiver.AC;

public class ACOnCommand implements Command {

    private AC ac;

    public ACOnCommand() {}

    public ACOnCommand(AC ac) {
        this.ac = ac;
    }

    public void setAC(AC ac) {
        this.ac = ac;
    }

    public void execute() {
        this.ac.switchOn();
    }

    public void undo() {
        this.ac.switchOff();
    }
}
package in.ac.spit.mca.se.ise2.command.impl;

import in.ac.spit.mca.se.ise2.command.Command;
import in.ac.spit.mca.se.ise2.receiver.AC;

public class ACDecrementTempCommand implements Command {

    private AC ac;

    public ACDecrementTempCommand() {}

    public ACDecrementTempCommand(AC ac) {
        this.ac = ac;
    }

    public void setAC(AC ac) {
        this.ac = ac;
    }

    public void execute() {
        this.ac.decrementTemperature();
    }

    public void undo() {
        this.ac.incrementTemperature();
    }
}
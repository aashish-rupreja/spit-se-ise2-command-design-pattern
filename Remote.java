package in.ac.spit.mca.se.ise2.invoker;

import in.ac.spit.mca.se.ise2.command.Command;
import in.ac.spit.mca.se.ise2.command.impl.*;
import java.util.List;
import java.util.ArrayList;

public class Remote {

  private Command[] onCommands;
  private Command[] offCommands;

  private Command[] incrementCommands;
  private Command[] decrementCommands;

  private Command prevCommand;

  public Remote(int noOfOnOffCommands, int noOfIncDecCommands) {
    onCommands = new Command[noOfOnOffCommands];
    offCommands = new Command[noOfOnOffCommands];

    incrementCommands = new Command[noOfIncDecCommands];
    decrementCommands = new Command[noOfIncDecCommands];

    Command noCommand = new NoCommand();
    for(int i = 0; i < noOfOnOffCommands; i++) {
      onCommands[i] = noCommand;
      offCommands[i] = noCommand;
    }

    for(int i = 0; i < noOfIncDecCommands; i++) {
      incrementCommands[i] = noCommand;
      decrementCommands[i] = noCommand;
    }
  }

  public void setOnOffCommand(int slotNo, Command onCommand, Command offCommand) {
    onCommands[slotNo-1] = onCommand;
    offCommands[slotNo-1] = offCommand;
  }

  public void setIncDecCommand(int slotNo, Command incrementCommand, Command decrementCommand) {
    incrementCommands[slotNo-1] = incrementCommand;
    decrementCommands[slotNo-1] = decrementCommand;
  }

  public void pressOnButton(int slotNo) {
    onCommands[slotNo-1].execute();
    prevCommand = onCommands[slotNo-1];
  }

  public void pressOffButton(int slotNo) {
    offCommands[slotNo-1].execute();
    prevCommand = offCommands[slotNo-1];
  }

  public void pressIncrementButton(int slotNo) {
    incrementCommands[slotNo-1].execute();
    prevCommand = incrementCommands[slotNo-1];
  }

  public void pressDecrementButton(int slotNo) {
    decrementCommands[slotNo-1].execute();
    prevCommand = decrementCommands[slotNo-1];
  }

  public void pressUndoButton() {
    prevCommand.undo();
  }
}

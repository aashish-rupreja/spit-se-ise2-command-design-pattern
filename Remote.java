package in.ac.spit.mca.se.ise2.invoker;

import in.ac.spit.mca.se.ise2.command.Command;
import in.ac.spit.mca.se.ise2.command.impl.*;
import java.util.List;
import java.util.ArrayList;

public class Remote {

  private Command[] onCommands;
  private Command[] offCommands;
  private Command prevCommand;

  public Remote(int noOfSlots) {
    onCommands = new Command[noOfSlots];
    offCommands = new Command[noOfSlots];

    Command noCommand = new NoCommand();
    for(int i = 0; i < noOfSlots; i++) {
      onCommands[i] = noCommand;
      offCommands[i] = noCommand;
    }
  }

  public void setCommand(int slotNo, Command onCommand, Command offCommand) {
    onCommands[slotNo-1] = onCommand;
    offCommands[slotNo-1] = offCommand;
  }

  public void pressOnButton(int slotNo) {
    onCommands[slotNo-1].execute();
    prevCommand = onCommands[slotNo-1];
  }

  public void pressOffButton(int slotNo) {
    offCommands[slotNo-1].execute();
    prevCommand = offCommands[slotNo-1];
  }

  public void pressUndoButton() {
    prevCommand.undo();
  }
}

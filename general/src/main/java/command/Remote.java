package command;

import command.commands.Command;

public class Remote {
    private Command[][] slots;

    public Remote() {
        this.slots = new Command[3][2];
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.slots[slot][0] = onCommand;
        this.slots[slot][1] = offCommand;
    }

    public void on(int slot) {
        this.slots[slot][0].execute();
    }

    public void off(int slot) {
        this.slots[slot][1].execute();
    }
}

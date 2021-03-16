package command.commands;

import command.Hottub;

public class HottubOnCommand implements Command {
    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.jetsOn();
        hottub.circulate();
        hottub.setTemperature(10);
    }

    @Override
    public void undo() {
        hottub.jetsOff();
    }
}

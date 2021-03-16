package command.commands;

import command.Sprinkler;

public class SprinklerOpenCommand implements Command {
    Sprinkler sprinkler;

    public SprinklerOpenCommand(Sprinkler sprinkler) {
        this.sprinkler = sprinkler;
    }

    @Override
    public void execute() {
        sprinkler.waterOn();
    }

    @Override
    public void undo() {
        sprinkler.waterOff();
    }
}

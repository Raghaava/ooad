package command.commands;

import command.Sprinkler;

public class SprinklerCloseCommand implements Command {
    Sprinkler sprinkler;

    public SprinklerCloseCommand(Sprinkler sprinkler) {
        this.sprinkler = sprinkler;
    }

    @Override
    public void execute() {
        sprinkler.waterOff();
    }

    @Override
    public void undo() {
        sprinkler.waterOn();
    }
}

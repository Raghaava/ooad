package command;

import command.commands.GarageDoorCloseCommand;
import command.commands.GarageDoorOpenCommand;
import command.commands.HottubOffCommand;
import command.commands.HottubOnCommand;
import command.commands.SprinklerCloseCommand;
import command.commands.SprinklerOpenCommand;

public class Demo {
    public static void main(String[] args) {
        GarageDoor ga = new GarageDoor();
        Hottub ht = new Hottub();
        Sprinkler sr = new Sprinkler();

        GarageDoorOpenCommand gdo = new GarageDoorOpenCommand(ga);
        GarageDoorCloseCommand gdc = new GarageDoorCloseCommand(ga);

        HottubOnCommand ho = new HottubOnCommand(ht);
        HottubOffCommand hf = new HottubOffCommand(ht);

        SprinklerOpenCommand so = new SprinklerOpenCommand(sr);
        SprinklerCloseCommand sc = new SprinklerCloseCommand(sr);

        Remote remote = new Remote();

        remote.setCommand(0, gdo, gdc);
        remote.setCommand(1, ho, hf);

        remote.setCommand(2, so, sc);

        remote.on(0);
        System.out.println("---------");
        remote.on(1);
        System.out.println("---------");
        remote.on(2);
        System.out.println("---------");


        remote.off(0);
        System.out.println("---------");
        remote.off(1);
        System.out.println("---------");
        remote.off(2);
        System.out.println("---------");
    }
}

package pattern.behavior.command;

import pattern.behavior.command.entity.Box;

public class SendPostBoxCommand implements Command {
    public void execute() {
        Box box = new Box();
        box.pack();
        box.send();
    }
}

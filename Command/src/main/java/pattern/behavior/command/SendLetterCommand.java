package pattern.behavior.command;

import pattern.behavior.command.entity.Letter;

public class SendLetterCommand implements Command{
    public void execute() {
        Letter letter = new Letter();
        letter.write();
        letter.send();
    }
}
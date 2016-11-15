package pattern.behavior.command;

import org.apache.log4j.Logger;
import pattern.behavior.command.entity.Letter;

public class SendLetterCommand implements Command{
    private static final Logger log = Logger.getLogger(SendLetterCommand.class);

    public void execute() {
        log.info("start execute");
        Letter letter = new Letter();
        letter.write();
        letter.send();
        log.info("finish execute");
    }
}
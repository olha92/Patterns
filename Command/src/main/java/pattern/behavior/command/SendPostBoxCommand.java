package pattern.behavior.command;

import org.apache.log4j.Logger;
import pattern.behavior.command.entity.Box;

public class SendPostBoxCommand implements Command {
    private static final Logger log = Logger.getLogger(SendPostBoxCommand.class);
    public void execute() {
        log.info("start execute");
        Box box = new Box();
        box.pack();
        box.send();
        log.info("finish execute");
    }
}

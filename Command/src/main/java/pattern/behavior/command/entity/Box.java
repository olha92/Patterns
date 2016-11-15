package pattern.behavior.command.entity;

import org.apache.log4j.Logger;

public class Box {
    private static final Logger log = Logger.getLogger(Box.class);

    public void pack() {
        log.info("pack");
    }

    public void send() {
        log.info("send");
    }
}

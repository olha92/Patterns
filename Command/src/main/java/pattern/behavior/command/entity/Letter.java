package pattern.behavior.command.entity;

import org.apache.log4j.Logger;

public class Letter {
    private static final Logger log = Logger.getLogger(Letter.class);

    public void write() {
        log.info("write");
    }

    public void send() {
        log.info("send");
    }
}

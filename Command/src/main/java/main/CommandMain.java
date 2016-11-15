package main;

import org.apache.log4j.Logger;
import pattern.behavior.command.Command;
import pattern.behavior.command.SendLetterCommand;
import pattern.behavior.command.SendPostBoxCommand;

import java.util.Random;

/**
 * CommandMain for example
 */
public class CommandMain {
    private static final Logger log = Logger.getLogger(CommandMain.class);
    private static final String SEND_LETTER = "send letter";
    private static final String SEND_POST_BOX = "send post box";
    private static final Random rand = new Random();

    public static void main(String[] args) {
        log.info("Start method main");
        for(int i = 0; i < 3; i++) {
            String commandKey = getCommandKey(i);
            Command command = getCommandByKey(commandKey);
            command.execute();
        }
        log.info("Finish method main");
    }

    private static String getCommandKey(int i) {
        int switchNumber = i%3;
        String result;
        switch(switchNumber){
            case 0: result = SEND_LETTER;
                break;
            case 1: result = SEND_POST_BOX;
                break;
            default: result = "other";
        }
        return result;
    }

    private static Command getCommandByKey(String commandKey) {
        Command command = new Command(){
            private final Logger log = Logger.getLogger(Command.class);
            public void execute() {
                log.info("nothing executes");
            }
        };
        if(SEND_POST_BOX.equalsIgnoreCase(commandKey)){
            command = new SendPostBoxCommand();
        }
        if(SEND_LETTER.equalsIgnoreCase(commandKey)){
            command = new SendLetterCommand();
        }
        return command;
    }
}

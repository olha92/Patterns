package pattern.behavior;

import org.apache.log4j.Logger;
import pattern.behavior.interpreter.Expression;

public class InterpreterClient {
    private static final Logger log = Logger.getLogger(InterpreterClient.class);
    public InterpreterContext interpreterContext;

    public InterpreterClient(InterpreterContext interpreterContext){
        log.info("Initialize with value " + interpreterContext);
        this.interpreterContext =interpreterContext;
    }

    public String interpret(String interpreted){
        log.info("value " + interpreted);
        Expression exp=null;
        //create rules for expressions
        return exp.interpret(interpreterContext);
    }
}

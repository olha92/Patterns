package pattern.behavior;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import pattern.behavior.expression.MenuExspression;
import pattern.behavior.expression.Expression;

public class InterpreterClient {
    private static final Logger log = Logger.getLogger(InterpreterClient.class);
    public InterpreterContext interpreterContext;

    public InterpreterClient(InterpreterContext interpreterContext){
        log.info("Initialize with value " + interpreterContext);
        this.interpreterContext =interpreterContext;
    }

    public String interpret(String interpreted){
        log.info("Start interpret with value " + interpreted);
        Expression expressionFull=null;
        String result = interpreted;
        if(StringUtils.isNotBlank(interpreted)){
            expressionFull = new MenuExspression(interpreted);
            result = expressionFull.interpret(interpreterContext);
        }
        return result;
    }
}

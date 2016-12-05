package main;

import org.apache.log4j.Logger;
import pattern.behavior.interpreter.AbstractExpression;
import pattern.behavior.interpreter.NonterminalExpression;
import pattern.behavior.interpreter.TerminalExpression;

public class InterpreterMain {
    private static final Logger log = Logger.getLogger(InterpreterMain.class);
    public static void main(String[] args){
        log.info("start method main");
        AbstractExpression terminalExpression = new TerminalExpression();
        terminalExpression.interpret();
        AbstractExpression nonterminalExpression = new NonterminalExpression();
        nonterminalExpression.interpret();
        log.info("finish method main");
    }
}

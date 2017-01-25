package main;

import org.apache.log4j.Logger;
import pattern.behavior.InterpreterClient;
import pattern.behavior.InterpreterContext;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class InterpreterMain {
    private static final Logger log = Logger.getLogger(InterpreterMain.class);
    public static void main(String[] args){
        try {
            String parsedIn = load("example");
            log.info("start method main");
            InterpreterClient ec = new InterpreterClient(new InterpreterContext());
            ec.interpret(parsedIn);
            log.info("finish method main");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String load(String examplePath) throws IOException {
        String path = InterpreterMain.class.getClassLoader().getResource(examplePath).getPath();
        Reader reader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(reader);
        StringBuilder stringBuilder = new StringBuilder();
        while(true) {
            String data = bufferedReader.readLine();
            if (data != null) {
                stringBuilder.append(data);
                stringBuilder.append(System.lineSeparator());
            }
            else break;
        }
        return stringBuilder.toString();
    }
}

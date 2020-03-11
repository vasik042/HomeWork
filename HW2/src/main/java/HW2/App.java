package HW2;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.logging.*;

public class App {

    private static Logger log = Logger.getLogger(App.class);

    public static void main( String[] args ) {

        PropertyConfigurator.configure("log4j.properties");

        log.debug("this is a debug log message");
        log.info("this is a info log message");
        log.warn("this is a warning log message");
        log.error("this is a error log message");
        log.fatal("this is a fatal log message");

    }
}

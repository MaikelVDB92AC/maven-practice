package org.mvdb.hello;
import org.apache.logging.log4j.*;

public class App
{
    // variables
    private static Logger logger = LogManager.getLogger();

    // methods
    public String sayHello() {
        logger.debug("Somebody called sayHello()");
        return "Hello World";
    }

    public static void main(String[] args){
        App app = new App();
        System.out.println(app.sayHello());
    }
}

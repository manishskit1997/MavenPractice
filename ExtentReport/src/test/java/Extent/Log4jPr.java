package Extent;

import org.apache.log4j.*;

public class Log4jPr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log= LogManager.getLogger("Log4jPr");
		System.out.println("using logger demo");
		log.info("Hello logger");
		log.debug("I am debugger");
		log.error("this error message");
		log.warn("I am warn");

	}

}

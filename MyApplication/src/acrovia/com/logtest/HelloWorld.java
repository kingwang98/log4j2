package acrovia.com.logtest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import acrovia.foo.Bar;

public class HelloWorld {

	static Logger logger = LogManager.getLogger(HelloWorld.class.getName());

	public static void main(String[] args) {
		//PropertyConfigurator.configure(HelloWorld.class.getResourceAsStream("log4j.properties"));
		logger.trace("Entering application.");
		
		logger.info("main info ");
		logger.warn("main warn ");
		logger.error("main error");
		logger.fatal("main fatal");
		
		Bar bar = new Bar();
		if (!bar.doIt()) {
			logger.error("Didn't do it.");
		}
		logger.trace("Exiting application.");

	}

}

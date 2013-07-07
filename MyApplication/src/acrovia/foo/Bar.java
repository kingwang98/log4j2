package acrovia.foo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Bar {
	  static Logger logger = LogManager.getLogger(Bar.class.getName());
	 
	  public boolean doIt() {
	    logger.entry();
	    logger.error("Did it again!");
	    logger.info("{} info ",Bar.class.getName());
	    logger.warn("{} warn ",Bar.class.getName());
	    logger.error("{} error ",Bar.class.getName());
	    logger.fatal("{} fatal",Bar.class.getName());
	    return logger.exit(false);
	  }
	}
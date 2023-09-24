package Utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j {

	 Logger logger = LogManager.getLogger();
	
	public void info(String message) {
		logger.info(message);
	}
	public void info(int num) {
		logger.info(num);
	}
	public void warn(String message) {
		logger.warn(message);
	}
	public void error(String message) {
		logger.error(message);
	}
	public void debug(String message) {
		logger.debug(message);
	}


}

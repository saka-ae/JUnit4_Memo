package chap10.sample10_07_03;

import java.util.logging.Logger;

public class LogTest {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger("chap10.sample10_07_03.LogTest");

		logger.severe("Power lost - running on backup!");
		logger.warning("Database connection lost, retrying..");

		logger.info("Startup complete.");

		logger.config("Server configuration: standalone, JVM version 1.4");

		logger.fine("Loading graphing package.");
		logger.finer("Doing pie chart");
		logger.finest("Starting bubble sort: value = " + 100);
	}

}

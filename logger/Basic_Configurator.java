package com.logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_Configurator {

	static  Logger log = Logger.getLogger(Basic_Configurator.class);

	

	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.debug("Debug");
		log.info("Information");
     log.warn("Warn");
	log.error("Error");
	log.fatal("Fatal");
	}

}

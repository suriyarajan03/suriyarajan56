package com.logger;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Property_File {
static  Logger log = Logger.getLogger(Property_File.class);

	

	public static void main(String[] args) {
	PropertyConfigurator.configure("log4j.properties");
		log.debug("Debug");
		log.info("Information");
     log.warn("Warn");
	log.error("Error");
	log.fatal("Fatal");
	
}
}

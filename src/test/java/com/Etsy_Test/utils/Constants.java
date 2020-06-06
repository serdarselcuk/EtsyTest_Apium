package com.Etsy_Test.utils;

public class Constants {

    public static final String DRIVER_TYPE = ConfigurationReader.getProperty("DRIVER_TYPE"),
                        URL = ConfigurationReader.getProperty(DRIVER_TYPE+"_URL"),
                        DEVICE_NAME =ConfigurationReader.getProperty(DRIVER_TYPE+"_DEVICE_NAME"),
                        VERSION = ConfigurationReader.getProperty(DRIVER_TYPE+"_VERSION"),
                        APP = ConfigurationReader.getProperty(DRIVER_TYPE+"_APP"),
                        ACTIVITY = ConfigurationReader.getProperty(DRIVER_TYPE+"_ACT"),
                        PLATFORM_NAME = ConfigurationReader.getProperty("platformName"),
                        PACKAGE = ConfigurationReader.getProperty(DRIVER_TYPE+"_PACK"),
                        APP_WAIT_ACT = ConfigurationReader.getProperty("appWaitActivity"),
                        APP_WAIT_PACK = ConfigurationReader.getProperty("appWaitPackage");

}

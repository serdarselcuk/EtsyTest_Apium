package com.Etsy_Test.utils;

import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import java.util.HashMap;
import java.util.Map;
import  static com.Etsy_Test.utils.Constants.*;

public class DesiredCap {

    private static Map<String, String> capabilitiesMap;

    static Map<String, String> getCapability(){

        if(capabilitiesMap == null){
        switch(DRIVER_TYPE) {

            case "remote":

                capabilitiesMap = new HashMap<String, String>() {

                    {
                        put("app", APP);
                        put("device", DEVICE_NAME);
                        put("os_version", VERSION);
                        put("project", "My First Project");
                        put("build", "My First Build");
                        put("name", "Bstack-[Java] Sample Test");
                    }
                };

                break;

            case "localbyApp":

                capabilitiesMap = new HashMap<String, String>() {

                    {
                        put(MobileCapabilityType.PLATFORM_NAME, PLATFORM_NAME);
                        put(MobileCapabilityType.PLATFORM_VERSION, VERSION);
                        put(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
                        put(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);
                        put(MobileCapabilityType.APP, APP);
                        put("appWaitActivity",APP_WAIT_ACT);
                        put("appWaitPackage",APP_WAIT_PACK);
                        put("appWaitDuration", "20000");
                    }
                };
                break;

            case "localbyActivity":

                capabilitiesMap = new HashMap<String, String>() {

                    {
                        put(MobileCapabilityType.PLATFORM_NAME,PLATFORM_NAME);
                        put(MobileCapabilityType.PLATFORM_VERSION, VERSION);
                        put(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
                        put(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);
                        put("appPackage",PACKAGE );
                        put("appActivity",ACTIVITY);
                        put(MobileCapabilityType.CLEAR_SYSTEM_FILES,"false");
                        put("noReset","true");


                    }
                };
                break;

            }
        }
    return capabilitiesMap;
    }
}

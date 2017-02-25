package com.JackDeg.JacksFixes.util;

import com.JackDeg.JacksFixes.Reference.Reference;
import cpw.mods.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

public class LogHelper
{
    public static void log(Level logLevel, String object)
    {
        FMLLog.log(Reference.MOD_ID, logLevel, String.valueOf(object));
    }

    public static void info(Object object) { log(Level.INFO, String.valueOf(object)); }
}

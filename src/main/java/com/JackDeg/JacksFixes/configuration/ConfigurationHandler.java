package com.JackDeg.JacksFixes.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        Configuration configuration = new Configuration(configFile);

        try
        {
            configuration.load();

            boolean skinning = configuration.get(Configuration.CATEGORY_GENERAL, "skinning", false, "Used to determine weather the skinning mechanic is used.").getBoolean(false);
        }
        catch (Exception e)
        {

        }
        finally
        {
            configuration.save();
        }
    }
}


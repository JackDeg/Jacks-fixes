package com.JackDeg.JacksFixes.handler;

import com.JackDeg.JacksFixes.Reference.Reference;
import com.JackDeg.JacksFixes.util.LogHelper;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{

    public static Configuration configuration;

    public static void init(File configFile) {
        configuration = new Configuration(configFile);

        try {
            configuration.load();

            boolean skinning = configuration.get(Configuration.CATEGORY_GENERAL, "skinning", false, "Used to determine weather the skinning mechanic is used.").getBoolean(false);
        } catch (Exception e) {

        } finally {
            if (configuration.hasChanged()) {
                configuration.save();
            }
        }
    }

    /*@SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {

        }
    }*/
}


package com.JackDeg.JacksFixes.handler;

import com.JackDeg.JacksFixes.Reference.Reference;
import com.JackDeg.JacksFixes.init.Recipes;
import com.JackDeg.JacksFixes.util.LogHelper;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{

    public static Configuration configuration;

    public static boolean skinning = true;

    public static void init(File configFile) {
        if (configuration == null)
        {
            LogHelper.warn("No config detected, generating new one.");
            configuration = new Configuration(configFile);
            loadConfiguration();
        }


    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            //configuration.load();
            loadConfiguration();
            Recipes.init();
            LogHelper.info("Config has been loaded");
        }
    }

    private static void loadConfiguration()
    {
       skinning = configuration.getBoolean("skinning", Configuration.CATEGORY_GENERAL, skinning, "Used to determine weather the skinning mechanic is used.");

       if (configuration.hasChanged())
       {
           LogHelper.info("Config has been changed");
           configuration.save();
       }
    }
}


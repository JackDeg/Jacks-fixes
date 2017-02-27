package com.JackDeg.JacksFixes.Reference;

import com.JackDeg.JacksFixes.handler.ConfigurationHandler;
import net.minecraftforge.common.config.Configuration;
import static com.JackDeg.JacksFixes.handler.ConfigurationHandler.configuration;

public class Config
{
    public static final boolean skinningEnabled = configuration.getBoolean("skinning", Configuration.CATEGORY_GENERAL, ConfigurationHandler.skinning, "Used to determine weather the skinning mechanic is used.");
}

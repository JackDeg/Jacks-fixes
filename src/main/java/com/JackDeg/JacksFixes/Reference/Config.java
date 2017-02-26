package com.JackDeg.JacksFixes.Reference;

import com.JackDeg.JacksFixes.handler.ConfigurationHandler;
import net.minecraftforge.common.config.Configuration;

public class Config
{
    public static final boolean skinningEnabled = ConfigurationHandler.configuration.get(Configuration.CATEGORY_GENERAL, "skinning", false).getBoolean(false);
}

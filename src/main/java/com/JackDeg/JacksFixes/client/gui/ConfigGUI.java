package com.JackDeg.JacksFixes.client.gui;

import com.JackDeg.JacksFixes.Reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import com.JackDeg.JacksFixes.handler.ConfigurationHandler;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import java.util.List;

public class ConfigGUI extends GuiConfig
    {
        public ConfigGUI(GuiScreen guiScreen)
        {
            super(guiScreen,
                    new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                    Reference.MOD_ID,
                    false,
                    false,
                    GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
        }
    }

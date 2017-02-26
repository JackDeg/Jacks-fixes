package com.JackDeg.JacksFixes;

import com.JackDeg.JacksFixes.Reference.Config;
import com.JackDeg.JacksFixes.Reference.Reference;
import com.JackDeg.JacksFixes.handler.ConfigurationHandler;
import com.JackDeg.JacksFixes.init.ModItems;
import com.JackDeg.JacksFixes.init.Recipes;
import com.JackDeg.JacksFixes.proxy.Iproxy;
import com.JackDeg.JacksFixes.util.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class JacksFixes
{

    @Mod.Instance(Reference.MOD_ID)
    public static JacksFixes instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static Iproxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //Load Config
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        //Load Items & Blocks
        ModItems.init();
        LogHelper.info("Ha! My Pre Init completed successfully!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        Recipes.init();
        LogHelper.info("Init Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Looks like skinning is set to " + Config.skinningEnabled);
    }
}

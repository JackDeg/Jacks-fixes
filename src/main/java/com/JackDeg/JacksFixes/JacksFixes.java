package com.JackDeg.JacksFixes;

import com.JackDeg.JacksFixes.Reference.Reference;
import com.JackDeg.JacksFixes.configuration.ConfigurationHandler;
import com.JackDeg.JacksFixes.proxy.Iproxy;
import com.JackDeg.JacksFixes.util.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class JacksFixes
{

    @Mod.Instance(Reference.MOD_ID)
    public static JacksFixes instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static Iproxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        LogHelper.info("Ha! My Pre Init completed successfully!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("Init");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        System.out.println("PostInit");
    }
}

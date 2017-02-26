package com.JackDeg.JacksFixes.init;

import com.JackDeg.JacksFixes.item.ItemJF;
import com.JackDeg.JacksFixes.item.ItemKnife;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
    {
        private static final ItemJF Knife = new ItemKnife();

        public static void init()
        {
            GameRegistry.registerItem(Knife, "Knife");
        }
    }

package com.JackDeg.JacksFixes.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class Recipes
    {
        public static void init()
        {
            GameRegistry.addRecipe(new ItemStack(ModItems.Knife), " I", "s " , 'I', new ItemStack(Items.iron_ingot), 's', new ItemStack(Items.stick));
            GameRegistry.addShapelessRecipe(new ItemStack(Items.leather), new ItemStack(Items.rotten_flesh), new ItemStack(ModItems.Knife, 1, OreDictionary.WILDCARD_VALUE));
        }
    }

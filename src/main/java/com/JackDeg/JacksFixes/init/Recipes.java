package com.JackDeg.JacksFixes.init;

import com.JackDeg.JacksFixes.Reference.Config;
import com.JackDeg.JacksFixes.util.LogHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class Recipes
    {
        public static void init()
        {
            if(Config.skinningEnabled == true)
            {
                LogHelper.info("Loading Skinning Recipes");
                GameRegistry.addRecipe(new ItemStack(ModItems.Knife), " I", "s " , 'I', new ItemStack(Items.iron_ingot), 's', new ItemStack(Items.stick));
                GameRegistry.addShapelessRecipe(new ItemStack(Items.leather), new ItemStack(Items.rotten_flesh), new ItemStack(ModItems.Knife, 1, OreDictionary.WILDCARD_VALUE));
            }
            else
            {
                LogHelper.info("Loading non-Skinning recipes");
                GameRegistry.addShapelessRecipe(new ItemStack(Items.leather), new ItemStack(Items.rotten_flesh));
            }

            /*OG Recipe
            GameRegistry.addRecipe(new ItemStack(ModItems.Knife), " I", "s " , 'I', new ItemStack(Items.iron_ingot), 's', new ItemStack(Items.stick));
            GameRegistry.addShapelessRecipe(new ItemStack(Items.leather), new ItemStack(Items.rotten_flesh), new ItemStack(ModItems.Knife, 1, OreDictionary.WILDCARD_VALUE));
            */
        }
    }

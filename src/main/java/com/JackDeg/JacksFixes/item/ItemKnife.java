package com.JackDeg.JacksFixes.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ItemKnife extends ItemJF
    {
        public ItemKnife()
        {
            super();
            this.setCreativeTab(CreativeTabs.tabTools);
            this.setUnlocalizedName("Knife");
            this.setMaxDamage(255);
        }

        @Override
        public boolean isRepairable()
        {
            return false;
        }

        @Override
        public ItemStack getContainerItem(ItemStack itemStack )
        {
            itemStack.setItemDamage( itemStack.getItemDamage() + 1 );
            return itemStack;
        }

        @Override
        public boolean hasContainerItem( ItemStack stack )
        {
            return true;
        }

        @Override
        public boolean doesContainerItemLeaveCraftingGrid( ItemStack par1ItemStack )
        {
            return false;
        }
    }

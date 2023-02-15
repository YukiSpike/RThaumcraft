package com.Yuki_Spike.rthaumcraft.items;

import com.Yuki_Spike.rthaumcraft.Main;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;

public class ItemTestStick extends Item {
    public ItemTestStick() {
        super(new Properties().tab(Main.MAIN_TAB));
    }

    @Override
    public InteractionResult onItemUseFirst(ItemStack stack, UseOnContext context) {

        return super.onItemUseFirst(stack, context);
    }

    public class OpenGUI{
        public OpenGUI(){
        }
    }
}

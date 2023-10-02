package com.Yuki_Spike.rthaumcraft.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class KeyBinding {
    public static final String KEY_CATEGORY_RTHAUMCRAFT = "key.category.rthaumcraft.all";
    public static final String KEY_CHANGE_FOCUS = "key.rthaumcraft.change_focus";

    public static final KeyMapping CHANGEFOCUS_KEY = new KeyMapping(KEY_CHANGE_FOCUS, KeyConflictContext.IN_GAME, InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_F, KEY_CATEGORY_RTHAUMCRAFT);

}

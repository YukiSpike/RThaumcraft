package com.Yuki_Spike.rthaumcraft.screen;

import com.Yuki_Spike.rthaumcraft.Main;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import org.lwjgl.opengl.GL11;

import java.awt.*;

public class TestRendAspect extends Screen {
    public static final ResourceLocation AQUA = new ResourceLocation(Main.MOD_ID, "textures/aspects/aqua.png");

    protected TestRendAspect(Component p_96550_) {
        super(p_96550_);
    }

    @Override
    public void render(PoseStack poseStack, int mouseX, int mouseY, float partialTicks) {
        renderBackground(poseStack);
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, AQUA);

        Color c = new Color(3986684);
        float red = c.getRed()/255.0F;
        float green = c.getGreen()/255.0F;
        float blue = c.getBlue()/255.0F;
        GL11.glColor3f(red,green,blue);

        this.blit(poseStack, mouseX, mouseY, 32, 32, 32, 32);

        GL11.glColor3f(1.0F,1.0F,1.0F);
        super.render(poseStack, mouseX, mouseY, partialTicks);
    }
}

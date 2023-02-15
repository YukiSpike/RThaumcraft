package com.Yuki_Spike.rthaumcraft.screen;

import com.Yuki_Spike.rthaumcraft.Main;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;

import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class AlchemicalFurnace_Screen extends AbstractContainerScreen<AlchemicalFurnace_Menu>{
    public static final ResourceLocation TEXTURE = new ResourceLocation(Main.MOD_ID, "textures/gui/gui_alchemyfurnace.png");

//    private FluidTankRenderer renderer;

    public AlchemicalFurnace_Screen(AlchemicalFurnace_Menu menu, Inventory inventory, Component component) {
        super(menu, inventory, component);
    }

    @Override
    protected void init() {
        super.init();
//        assignFluidRenderer();
    }
    
//    private void assignFluidRenderer() {
//        renderer = new FluidTankRenderer(64000, true, 9, 55);
//   }

    @Override
    protected void renderBg(PoseStack posestack, float partialtick, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        this.blit(posestack, x, y, 0, 0, imageWidth, imageHeight);
        renderProgressArrow(posestack, x, y);
//        renderer.render(posestack, x + 60, y + 8, menu.getFluidStack());
    }

    private void renderProgressArrow(PoseStack posestack, int x, int y) {
        if(menu.isCrafting()) {
            blit(posestack, x + 105, y + 13, 176, 0, 9, menu.getScaledProgress());
        }
    }

    @Override
    public void render(PoseStack posestack, int mouseX, int mouseY, float delata) {
        renderBackground(posestack);
        super.render(posestack, mouseX, mouseY, delata);
        renderTooltip(posestack, mouseX, mouseY);

    }
}

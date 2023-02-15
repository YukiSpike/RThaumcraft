package com.Yuki_Spike.rthaumcraft.entity.render;

import javax.annotation.Nullable;

import com.Yuki_Spike.rthaumcraft.Main;
import com.Yuki_Spike.rthaumcraft.entity.Cultistleader_Entity;
import com.Yuki_Spike.rthaumcraft.entity.model.Cultistleader_EntityModel;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;


public class Cultistleader_EntityRender extends GeoEntityRenderer<Cultistleader_Entity>{

    public Cultistleader_EntityRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new Cultistleader_EntityModel());
        this.shadowRadius = 0.5f;
    }

    @Override
    public ResourceLocation getTextureLocation(Cultistleader_Entity instance) {
        //return LOCATION_BY_VARIANT.get(instance.getVariant());
    	return new ResourceLocation(Main.MOD_ID, "textures/entity/cultist_leader.png");
    }

    @Override
    public RenderType getRenderType(Cultistleader_Entity animatable, float partialTicks, PoseStack stack,
            @Nullable MultiBufferSource renderTypeBuffer, @Nullable VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
//        if(animatable.isBaby()) {
//            stack.scale(0.4F, 0.4F, 0.4F);
//        } else {
//            stack.scale(0.8F, 0.8F, 0.8F);
//        }
    	stack.scale(1F, 1F, 1F);

        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}

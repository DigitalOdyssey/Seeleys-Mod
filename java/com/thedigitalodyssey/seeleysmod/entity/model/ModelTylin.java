package com.thedigitalodyssey.seeleysmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelCow - Either Mojang or a mod author
 * Created using Tabula 6.0.0
 */
public class ModelTylin extends ModelBase {
    public ModelRenderer tylin_body;
    public ModelRenderer tylin_leg_back_left;
    public ModelRenderer tylin_leg_front_left;
    public ModelRenderer tylin_leg_back_right;
    public ModelRenderer tylin_leg_front_right;
    public ModelRenderer tylin_head;

    public ModelTylin() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.tylin_leg_front_left = new ModelRenderer(this, 0, 16);
        this.tylin_leg_front_left.setRotationPoint(4.0F, 12.0F, -6.0F);
        this.tylin_leg_front_left.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.tylin_leg_front_right = new ModelRenderer(this, 0, 16);
        this.tylin_leg_front_right.setRotationPoint(-4.0F, 12.0F, -6.0F);
        this.tylin_leg_front_right.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.tylin_leg_back_right = new ModelRenderer(this, 0, 16);
        this.tylin_leg_back_right.setRotationPoint(-4.0F, 12.0F, 7.0F);
        this.tylin_leg_back_right.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.tylin_head = new ModelRenderer(this, 0, 0);
        this.tylin_head.setRotationPoint(0.0F, 7.0F, -6.5F);
        this.tylin_head.addBox(-4.0F, -4.0F, -6.0F, 8, 8, 6, 0.0F);
        this.tylin_body = new ModelRenderer(this, 18, 4);
        this.tylin_body.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.tylin_body.addBox(-6.0F, -10.0F, -7.0F, 12, 18, 10, 0.0F);
        this.setRotateAngle(tylin_body, 1.5707963267948966F, 0.0F, 0.0F);
        this.tylin_leg_back_left = new ModelRenderer(this, 0, 16);
        this.tylin_leg_back_left.setRotationPoint(4.0F, 12.0F, 7.0F);
        this.tylin_leg_back_left.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.tylin_leg_front_left.render(f5);
        this.tylin_leg_front_right.render(f5);
        this.tylin_leg_back_right.render(f5);
        this.tylin_head.render(f5);
        this.tylin_body.render(f5);
        this.tylin_leg_back_left.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
    	this.tylin_leg_front_left.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.tylin_leg_back_left.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.tylin_leg_front_right.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.tylin_leg_back_right.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    }
}

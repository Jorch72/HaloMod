package halocraft;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMongoose extends ModelBase
{
  //fields
    ModelRenderer Wheel1;
    ModelRenderer Wheel2;
    ModelRenderer Wheel3;
    ModelRenderer Wheel4;
    ModelRenderer Base;
    ModelRenderer Rim1Part1;
    ModelRenderer Rim1Part2;
    ModelRenderer Rim1Part3;
    ModelRenderer Rim2Part3;
    ModelRenderer Rim2Part2;
    ModelRenderer Rim3Part1;
    ModelRenderer Rim3Part2;
    ModelRenderer Rim3Part3;
    ModelRenderer Rim4Part1;
    ModelRenderer FrontBumper;
    ModelRenderer RightFootHold;
    ModelRenderer LeftPanel;
    ModelRenderer RightPanel;
    ModelRenderer LeftFootHold;
  
  public ModelMongoose()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Wheel1 = new ModelRenderer(this, 0, 0);
      Wheel1.addBox(0F, 0F, 0F, 1, 5, 5);
      Wheel1.setRotationPoint(7F, 19F, -8F);
      Wheel1.setTextureSize(64, 32);
      Wheel1.mirror = true;
      setRotation(Wheel1, 0F, 0F, 0F);
      Wheel2 = new ModelRenderer(this, 0, 0);
      Wheel2.addBox(0F, 0F, 0F, 1, 5, 5);
      Wheel2.setRotationPoint(-8F, 19F, -8F);
      Wheel2.setTextureSize(64, 32);
      Wheel2.mirror = true;
      setRotation(Wheel2, 0F, 0F, 0F);
      Wheel3 = new ModelRenderer(this, 0, 0);
      Wheel3.addBox(0F, 0F, 0F, 1, 5, 5);
      Wheel3.setRotationPoint(7F, 19F, 3F);
      Wheel3.setTextureSize(64, 32);
      Wheel3.mirror = true;
      setRotation(Wheel3, 0F, 0F, 0F);
      Wheel4 = new ModelRenderer(this, 0, 0);
      Wheel4.addBox(0F, 0F, 0F, 1, 5, 5);
      Wheel4.setRotationPoint(-8F, 19F, 3F);
      Wheel4.setTextureSize(64, 32);
      Wheel4.mirror = true;
      setRotation(Wheel4, 0F, 0F, 0F);
      Base = new ModelRenderer(this, 0, 0);
      Base.addBox(0F, 0F, 0F, 14, 0, 16);
      Base.setRotationPoint(-7F, 18F, -8F);
      Base.setTextureSize(64, 32);
      Base.mirror = true;
      setRotation(Base, 0F, 0F, 0F);
      Rim1Part1 = new ModelRenderer(this, 0, 0);
      Rim1Part1.addBox(0F, 0F, 0F, 2, 1, 7);
      Rim1Part1.setRotationPoint(7F, 18F, -9F);
      Rim1Part1.setTextureSize(64, 32);
      Rim1Part1.mirror = true;
      setRotation(Rim1Part1, 0F, 0F, 0F);
      Rim1Part2 = new ModelRenderer(this, 0, 0);
      Rim1Part2.addBox(0F, 0F, 0F, 1, 3, 1);
      Rim1Part2.setRotationPoint(8F, 18F, -3F);
      Rim1Part2.setTextureSize(64, 32);
      Rim1Part2.mirror = true;
      setRotation(Rim1Part2, 0F, 0F, 0F);
      Rim1Part3 = new ModelRenderer(this, 0, 0);
      Rim1Part3.addBox(0F, 0F, 0F, 1, 3, 1);
      Rim1Part3.setRotationPoint(8F, 18F, -9F);
      Rim1Part3.setTextureSize(64, 32);
      Rim1Part3.mirror = true;
      setRotation(Rim1Part3, 0F, 0F, 0F);
      Rim2Part3 = new ModelRenderer(this, 0, 0);
      Rim2Part3.addBox(0F, 0F, 0F, 1, 3, 1);
      Rim2Part3.setRotationPoint(-9F, 18F, -3F);
      Rim2Part3.setTextureSize(64, 32);
      Rim2Part3.mirror = true;
      setRotation(Rim2Part3, 0F, 0F, 0F);
      Rim1Part1 = new ModelRenderer(this, 0, 0);
      Rim1Part1.addBox(0F, 0F, 0F, 2, 1, 7);
      Rim1Part1.setRotationPoint(-9F, 18F, -9F);
      Rim1Part1.setTextureSize(64, 32);
      Rim1Part1.mirror = true;
      setRotation(Rim1Part1, 0F, 0F, 0F);
      Rim2Part2 = new ModelRenderer(this, 0, 0);
      Rim2Part2.addBox(0F, 0F, 0F, 1, 3, 1);
      Rim2Part2.setRotationPoint(-9F, 18F, -9F);
      Rim2Part2.setTextureSize(64, 32);
      Rim2Part2.mirror = true;
      setRotation(Rim2Part2, 0F, 0F, 0F);
      Rim3Part1 = new ModelRenderer(this, 0, 0);
      Rim3Part1.addBox(0F, 0F, 0F, 2, 1, 7);
      Rim3Part1.setRotationPoint(7F, 18F, 2F);
      Rim3Part1.setTextureSize(64, 32);
      Rim3Part1.mirror = true;
      setRotation(Rim3Part1, 0F, 0F, 0F);
      Rim3Part2 = new ModelRenderer(this, 0, 0);
      Rim3Part2.addBox(0F, 0F, 0F, 1, 3, 1);
      Rim3Part2.setRotationPoint(8F, 18F, 2F);
      Rim3Part2.setTextureSize(64, 32);
      Rim3Part2.mirror = true;
      setRotation(Rim3Part2, 0F, 0F, 0F);
      Rim3Part3 = new ModelRenderer(this, 0, 0);
      Rim3Part3.addBox(0F, 0F, 0F, 1, 3, 1);
      Rim3Part3.setRotationPoint(8F, 18F, 8F);
      Rim3Part3.setTextureSize(64, 32);
      Rim3Part3.mirror = true;
      setRotation(Rim3Part3, 0F, 0F, 0F);
      Rim4Part1 = new ModelRenderer(this, 0, 0);
      Rim4Part1.addBox(0F, 0F, 0F, 2, 1, 7);
      Rim4Part1.setRotationPoint(-9F, 18F, 2F);
      Rim4Part1.setTextureSize(64, 32);
      Rim4Part1.mirror = true;
      setRotation(Rim4Part1, 0F, 0F, 0F);
      Rim2Part3 = new ModelRenderer(this, 0, 0);
      Rim2Part3.addBox(0F, 0F, 0F, 1, 3, 1);
      Rim2Part3.setRotationPoint(-9F, 18F, 8F);
      Rim2Part3.setTextureSize(64, 32);
      Rim2Part3.mirror = true;
      setRotation(Rim2Part3, 0F, 0F, 0F);
      Rim2Part3 = new ModelRenderer(this, 0, 0);
      Rim2Part3.addBox(0F, 0F, 0F, 1, 3, 1);
      Rim2Part3.setRotationPoint(-9F, 18F, 2F);
      Rim2Part3.setTextureSize(64, 32);
      Rim2Part3.mirror = true;
      setRotation(Rim2Part3, 0F, 0F, 0F);
      FrontBumper = new ModelRenderer(this, 0, 0);
      FrontBumper.addBox(0F, 0F, 0F, 14, 2, 3);
      FrontBumper.setRotationPoint(-7F, 17F, -10F);
      FrontBumper.setTextureSize(64, 32);
      FrontBumper.mirror = true;
      setRotation(FrontBumper, 0F, 0F, 0F);
      RightFootHold = new ModelRenderer(this, 0, 0);
      RightFootHold.addBox(0F, 0F, 0F, 1, 1, 4);
      RightFootHold.setRotationPoint(-9F, 21F, -2F);
      RightFootHold.setTextureSize(64, 32);
      RightFootHold.mirror = true;
      setRotation(RightFootHold, 0F, 0F, 0F);
      LeftPanel = new ModelRenderer(this, 0, 0);
      LeftPanel.addBox(0F, 0F, 0F, 1, 4, 4);
      LeftPanel.setRotationPoint(6F, 18.2F, -2F);
      LeftPanel.setTextureSize(64, 32);
      LeftPanel.mirror = true;
      setRotation(LeftPanel, 0F, 0F, -0.2443461F);
      RightPanel = new ModelRenderer(this, 0, 0);
      RightPanel.addBox(0F, 0F, 0F, 1, 4, 4);
      RightPanel.setRotationPoint(-7F, 18.1F, -2F);
      RightPanel.setTextureSize(64, 32);
      RightPanel.mirror = true;
      setRotation(RightPanel, 0F, 0F, 0.2443461F);
      LeftFootHold = new ModelRenderer(this, 0, 0);
      LeftFootHold.addBox(0F, 0F, 0F, 1, 1, 4);
      LeftFootHold.setRotationPoint(8F, 21F, -2F);
      LeftFootHold.setTextureSize(64, 32);
      LeftFootHold.mirror = true;
      setRotation(LeftFootHold, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Wheel1.render(f5);
    Wheel2.render(f5);
    Wheel3.render(f5);
    Wheel4.render(f5);
    Base.render(f5);
    Rim1Part1.render(f5);
    Rim1Part2.render(f5);
    Rim1Part3.render(f5);
    Rim2Part3.render(f5);
    Rim1Part1.render(f5);
    Rim2Part2.render(f5);
    Rim3Part1.render(f5);
    Rim3Part2.render(f5);
    Rim3Part3.render(f5);
    Rim4Part1.render(f5);
    Rim2Part3.render(f5);
    Rim2Part3.render(f5);
    FrontBumper.render(f5);
    RightFootHold.render(f5);
    LeftPanel.render(f5);
    RightPanel.render(f5);
    LeftFootHold.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
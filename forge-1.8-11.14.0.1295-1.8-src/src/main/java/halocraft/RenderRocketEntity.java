package halocraft;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderRocketEntity extends Render {
	private static final ResourceLocation rocketTextures = new ResourceLocation("halocraft:textures/entities/RocketRender.png");
	public RenderRocketEntity(RenderManager rendermanager) {
		super(rendermanager);
		shadowSize = 0.5F;
		// TODO Auto-generated constructor stub
	}
	protected ResourceLocation getEntityTexture(Entity entity){
		return rocketTextures;
	}
	public void render(EntityRocket rocket, double d, double d1, double d2, float f, float f1)
	{
		if(rocket.ticksExisted < 1)
			return;
		bindEntityTexture(rocket);
		GL11.glPushMatrix();
		GL11.glTranslatef((float) d, (float) d1, (float) d2);
		GL11.glRotatef(f, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(90F -rocket.prevRotationPitch - (rocket.rotationPitch - rocket.prevRotationPitch) * f1, 1.0F, 0.0F, 0.0F);
		ModelBase model = new ModelRocket();
		if(model != null)
			model.render(rocket, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
	}

	@Override
	public void doRender(Entity entity, double d, double d1, double d2, float f, float f1)
	{
		render((EntityRocket) entity, d, d1, d2, f, f1);
	}
	
}

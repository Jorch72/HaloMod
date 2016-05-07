package io.github.hsyyid.halocraft.entities.vehicles.render;

import io.github.hsyyid.halocraft.entities.vehicles.EntityWarthogTurret;
import io.github.hsyyid.halocraft.util.RenderingUtil;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderWarthogTurretEntity extends Render<EntityWarthogTurret>
{
	private final IBakedModel model = RenderingUtil.loadModel("halocraft:entity/WarthogTurret.obj");

	public RenderWarthogTurretEntity(RenderManager renderManager)
	{
		super(renderManager);
		this.shadowSize = 0.5F;
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityWarthogTurret entityWarthog)
	{
		return null;
	}

	@Override
	public void doRender(EntityWarthogTurret entity, double posX, double posY, double posZ, float yaw, float partialTicks)
	{
		GlStateManager.pushMatrix();
		{
			GlStateManager.translate(posX, posY + 0.8, posZ);
			GlStateManager.rotate(-entity.rotationYaw, 0, 1, 0);

			GlStateManager.pushMatrix();
			{
				RenderingUtil.renderModel(model, -1);
			}
			GlStateManager.popMatrix();
		}
		GlStateManager.popMatrix();
	}
}

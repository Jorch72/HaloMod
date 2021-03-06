package io.github.hsyyid.halocraft.entities;

import io.github.hsyyid.halocraft.items.firearms.PlasmaRifle;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackRanged;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class EntityBlueElite extends EntityMob implements IMob, IRangedAttackMob
{
	public EntityBlueElite(World worldIn)
	{
		super(worldIn);

		this.setSize(0.9F, 1.5F);
		this.experienceValue = 5;
		this.tasks.addTask(1, new EntityAIAttackRanged(this, 0.4D, 3, 24));
		this.tasks.addTask(2, new EntityAIWander(this, this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue()));
		this.tasks.addTask(3, new EntityAISwimming(this));
		this.tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		this.tasks.addTask(5, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityPlayer>(this, EntityPlayer.class, true));
	}

	@Override
	public ItemStack getHeldItemMainhand()
	{
		return new ItemStack(PlasmaRifle.instance, 1);
	}

	protected boolean isAIEnabled()
	{
		return true;
	}

	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(30.0F);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5D);
	}

	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase entityLivingIn, float p_82196_2_)
	{
		EntityGreenPlasma greenPlasma = new EntityGreenPlasma(this.worldObj, this);

		if (this.getAttackTarget() != null)
		{
			double d0 = this.getAttackTarget().posX - this.posX;
			double d1 = this.getAttackTarget().getEntityBoundingBox().maxY - 0.2F - this.posY;
			double d2 = this.getAttackTarget().posZ - this.posZ;

			double d3 = MathHelper.sqrt_double(d0 * d0 + d2 * d2);

			if (d3 >= 1.0E-7D)
			{
				float f2 = (float) (Math.atan2(d2, d0) * 180.0D / Math.PI) - 90.0F;
				float f3 = (float) (-(Math.atan2(d1, d3) * 180.0D / Math.PI));
				double d4 = d0 / d3;
				double d5 = d2 / d3;
				greenPlasma.setLocationAndAngles(this.posX + d4, this.posY, this.posZ + d5, f2, f3);
				greenPlasma.setThrowableHeading(d0, d1, d2, 1, 0.25f);
			}

			this.worldObj.spawnEntityInWorld(greenPlasma);
		}
	}
}

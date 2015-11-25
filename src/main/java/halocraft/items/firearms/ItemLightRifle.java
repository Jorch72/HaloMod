package halocraft.items.firearms;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import halocraft.HaloCraft;
import halocraft.entities.EntityBullet;
import halocraft.entities.EntityOrangePlasma;
import halocraft.items.ItemAmmoAssaultRifle;
import halocraft.items.ItemCarbineAmmo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemLightRifle extends ItemFirearm
{
	public static String name = "itemLightRifle";
	public static ItemFirearm instance = new ItemLightRifle();
	
	public ItemLightRifle()
	{
		super();

		this.damage = 15;
		this.ammo = HaloCraft.ammoAssaultRifle;
		this.clipRounds = 32;
		this.setUnlocalizedName("halocraft:" + name.toLowerCase());
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn)
	{
		if (playerIn.capabilities.isCreativeMode || this.canDamageAmmo(worldIn, playerIn))
		{
			worldIn.playSoundAtEntity(playerIn, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
			
			if (!worldIn.isRemote)
			{
				EntityOrangePlasma bullet = new EntityOrangePlasma(worldIn, playerIn);
				bullet.damage = this.damage;
				worldIn.spawnEntityInWorld(bullet);
				itemStackIn.damageItem(1, playerIn);
			}
		}
		
		return itemStackIn;
	}
}
package io.github.hsyyid.halocraft.armor;

import io.github.hsyyid.halocraft.proxies.CommonProxy;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class HaloArmor extends ItemArmor
{
	public HaloArmor(ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlotIn)
	{
		super(material, renderIndex, equipmentSlotIn);

		this.setCreativeTab(CommonProxy.haloCreativeTab);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot equipmentSlotIn, String layer)
	{
		if (stack.getItem().equals(CommonProxy.jetpack))
		{
			return "halocraft:textures/armor/Jetpack_layer_1.png";
		}
		else if (stack.getItem().equals(CommonProxy.spartanHelmet) || stack.getItem().equals(CommonProxy.spartanChestplate) || stack.getItem().equals(CommonProxy.spartanBoots))
		{
			return "halocraft:textures/armor/HaloArmor_layer_1.png";
		}
		else if (stack.getItem().equals(CommonProxy.spartanLeggings))
		{
			return "halocraft:textures/armor/HaloArmor_layer_2.png";
		}
		else if (stack.getItem().equals(CommonProxy.redSpartanHelmet) || stack.getItem().equals(CommonProxy.redSpartanChestplate) || stack.getItem().equals(CommonProxy.redSpartanBoots))
		{
			return "halocraft:textures/armor/RedHaloArmor_layer_1.png";
		}
		else if (stack.getItem().equals(CommonProxy.redSpartanLeggings))
		{
			return "halocraft:textures/armor/RedHaloArmor_layer_2.png";
		}
		else if (stack.getItem().equals(CommonProxy.greenSpartanHelmet) || stack.getItem().equals(CommonProxy.greenSpartanChestplate) || stack.getItem().equals(CommonProxy.greenSpartanBoots))
		{
			return "halocraft:textures/armor/GreenHaloArmor_layer_1.png";
		}
		else if (stack.getItem().equals(CommonProxy.greenSpartanLeggings))
		{
			return "halocraft:textures/armor/GreenHaloArmor_layer_2.png";
		}
		else if (stack.getItem().equals(CommonProxy.blueSpartanHelmet) || stack.getItem().equals(CommonProxy.blueSpartanChestplate) || stack.getItem().equals(CommonProxy.blueSpartanBoots))
		{
			return "halocraft:textures/armor/BlueHaloArmor_layer_1.png";
		}
		else if (stack.getItem().equals(CommonProxy.blueSpartanLeggings))
		{
			return "halocraft:textures/armor/BlueHaloArmor_layer_2.png";
		}

		return null;
	}
}

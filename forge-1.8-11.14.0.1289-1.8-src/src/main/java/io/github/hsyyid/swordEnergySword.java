package io.github.hsyyid;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class swordEnergySword extends Item{
	Item swordEnergySword;
	public static CreativeTabs haloWeapons = new CreativeTabs("Halo Weapons"){
	public Item getTabIconItem(){
	return Items.diamond_sword;
	}
	};

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
	swordEnergySword = new Item().setCreativeTab(haloWeapons).setUnlocalizedName("energySword");
	GameRegistry.registerItem(swordEnergySword, "Energy Sword");
	}
}

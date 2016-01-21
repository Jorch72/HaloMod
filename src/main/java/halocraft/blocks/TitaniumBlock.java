package halocraft.blocks;

import halocraft.proxies.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.Random;

public class TitaniumBlock extends Block
{
	public static final TitaniumBlock instance = new TitaniumBlock(Material.iron);
	public static final String name = "TitaniumBlock";

	public TitaniumBlock(Material material)
	{
		super(material);
		setHardness(4.0F); // 33% harder than diamond
		setStepSound(Block.soundTypePiston); // sounds got renamed, look in Block class for what blocks have what sounds
		setUnlocalizedName("halocraft:" + name.toLowerCase()); // changed in 1.7
		setCreativeTab(CommonProxy.haloCreativeTab);
		setHarvestLevel("pickaxe", 3);
	}

	public Block getItemDropped(int metadata, Random random, int fortune)
	{
		return TitaniumBlock.instance;
	}
}

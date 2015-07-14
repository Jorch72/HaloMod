package halocraft.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class RedPlasmaBlock extends Block {
	public static final RedPlasmaBlock instance = new RedPlasmaBlock(Material.iron);
    public static final String name = "RedPlasmaBlock";
    
    public RedPlasmaBlock(Material material) 
    {
            super(material);
            setHardness(4.0F); // 33% harder than diamond
            setStepSound(Block.soundTypePiston); // sounds got renamed, look in Block class for what blocks have what sounds
            setUnlocalizedName("halocraft:" + name.toLowerCase()); // changed in 1.7
            setCreativeTab(CreativeTabs.tabBlock);
            setHarvestLevel("pickaxe", 3);
    }

 
	public Block getItemDropped(int metadata, Random random, int fortune) {
        return RedPlasmaBlock.instance;
    }

}
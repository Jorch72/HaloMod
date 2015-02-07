package halocraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid="halocraft", version="pre1.0")
public class Main{
	public static String MODID = "halocraft";
	public static String VERSION = "1";
	//World Generation
	public static HaloGenerationClass HaloOreGen;
	//Armor Material
	public static ArmorMaterial HaloArmor;
	public static ArmorMaterial CovenantArmor;
	public static ArmorMaterial ActiveCamoArmor;
	//Weapons
	public static ItemSword swordEnergySword;
	//Blocks
	public static Block forerunnerBlock;
	public final static Block HaloOre = new HaloOre(Material.rock);
	//Entities
	public static Entity mobElite;
	public static Entity rocket;
	public static Entity bullet;
	public static Entity entityMongoose;
	//Armor
	public static int helmetID = 0;
	public static int chestplateID = 0;
	public static int leggingID = 0;
	public static int bootID = 0;
	public static Item SpartanHelmet;
	public static Item SpartanChestplate;
	public static Item SpartanLeggings;
	public static Item SpartanBoots;
	public static Item RedSpartanHelmet;
	public static Item RedSpartanChestplate;
	public static Item RedSpartanLeggings;
	public static Item RedSpartanBoots;
	public static Item GreenSpartanHelmet;
	public static Item GreenSpartanChestplate;
	public static Item GreenSpartanLeggings;
	public static Item GreenSpartanBoots;
	public static Item BlueSpartanHelmet;
	public static Item BlueSpartanChestplate;
	public static Item BlueSpartanLeggings;
	public static Item BlueSpartanBoots;
	public static Item CovenantHelmet;
	public static Item CovenantChestplate;
	public static Item CovenantLeggings;
	public static Item CovenantBoots;
	public static Item covenantPiece;
	public static Item ActiveCamoHelmet;
	public static Item ActiveCamoChestplate;
	public static Item ActiveCamoLeggings;
	public static Item ActiveCamoBoots;
	//Items
	public static Item HaloIngot = new HaloIngot();
	public static Item rocketLauncher;
	public static Item ammoRocket;
	public static Item itemAssaultRifle;
	public static Item ammoAssaultRifle;
	public static Item itemBattleRifle;
	public static Item itemMongoose;
	@EventHandler
	public void init(FMLPreInitializationEvent e){
		HaloArmor = EnumHelper.addArmorMaterial("HaloArmor", "halocraft:textures/models/armor/HaloArmor", 100, new int[]{6, 6, 10, 8}, 30);
		CovenantArmor = EnumHelper.addArmorMaterial("CovenantArmor", "halocraft:textures/models/armor/CovenantArmor", 85, new int[]{4, 4, 10, 8}, 30);
		ActiveCamoArmor = EnumHelper.addArmorMaterial("ActiveCamoArmor", "halocraft:textures/models/armor/ActiveCamoArmor", 100, new int[]{6, 6, 10, 8}, 30);
		HaloOreGen = new HaloGenerationClass();
		covenantPiece = new CovenantPiece();
		rocketLauncher = new rocketLauncher();
		ammoRocket = new itemRocket();
		ammoAssaultRifle = new ammoAssaultRifle();
		itemAssaultRifle = new itemAssaultRifle();
		itemBattleRifle = new itemBattleRifle();
		itemMongoose = new ItemMongoose();
		BlueSpartanHelmet = new HaloArmor(HaloArmor, helmetID, 0).setUnlocalizedName("BlueSpartanHelmet");
		BlueSpartanChestplate = new HaloArmor(HaloArmor, chestplateID, 1).setUnlocalizedName("BlueSpartanChestplate");
		BlueSpartanLeggings = new HaloArmor(HaloArmor, leggingID, 2).setUnlocalizedName("BlueSpartanLeggings");
		BlueSpartanBoots = new HaloArmor(HaloArmor, bootID, 3).setUnlocalizedName("BlueSpartanBoots");
		GreenSpartanHelmet = new HaloArmor(HaloArmor, helmetID, 0).setUnlocalizedName("GreenSpartanHelmet");
		GreenSpartanChestplate = new HaloArmor(HaloArmor, chestplateID, 1).setUnlocalizedName("GreenSpartanChestplate");
		GreenSpartanLeggings = new HaloArmor(HaloArmor, leggingID, 2).setUnlocalizedName("GreenSpartanLeggings");
		GreenSpartanBoots = new HaloArmor(HaloArmor, bootID, 3).setUnlocalizedName("GreenSpartanBoots");
		RedSpartanHelmet = new HaloArmor(HaloArmor, helmetID, 0).setUnlocalizedName("RedSpartanHelmet");
		RedSpartanChestplate = new HaloArmor(HaloArmor, chestplateID, 1).setUnlocalizedName("RedSpartanChestplate");
		RedSpartanLeggings = new HaloArmor(HaloArmor, leggingID, 2).setUnlocalizedName("RedSpartanLeggings");
		RedSpartanBoots = new HaloArmor(HaloArmor, bootID, 3).setUnlocalizedName("RedSpartanBoots");
		SpartanHelmet = new HaloArmor(HaloArmor, helmetID, 0).setUnlocalizedName("SpartanHelmet");
		SpartanChestplate = new HaloArmor(HaloArmor, chestplateID, 1).setUnlocalizedName("SpartanChestplate");
		SpartanLeggings = new HaloArmor(HaloArmor, leggingID, 2).setUnlocalizedName("SpartanLeggings");
		SpartanBoots = new HaloArmor(HaloArmor, bootID, 3).setUnlocalizedName("SpartanBoots");
		CovenantHelmet = new CovenantArmor(CovenantArmor, helmetID, 0).setUnlocalizedName("CovenantHelmet");
		CovenantChestplate = new CovenantArmor(CovenantArmor, chestplateID, 1).setUnlocalizedName("CovenantChestplate");
		CovenantLeggings = new CovenantArmor(CovenantArmor, leggingID, 2).setUnlocalizedName("CovenantLeggings");
		CovenantBoots = new CovenantArmor(CovenantArmor, bootID, 3).setUnlocalizedName("CovenantBoots");
		ActiveCamoHelmet = new ActiveCamoArmor(ActiveCamoArmor, helmetID, 0).setUnlocalizedName("ActiveCamoHelmet");
		ActiveCamoChestplate = new ActiveCamoArmor(ActiveCamoArmor, chestplateID, 1).setUnlocalizedName("ActiveCamoChestplate");
		ActiveCamoLeggings = new ActiveCamoArmor(ActiveCamoArmor, leggingID, 2).setUnlocalizedName("ActiveCamoLeggings");
		ActiveCamoBoots = new ActiveCamoArmor(ActiveCamoArmor, bootID, 3).setUnlocalizedName("ActiveCamoBoots");
		swordEnergySword = new swordEnergySword(ToolMaterial.EMERALD);
		GameRegistry.registerItem(swordEnergySword, "energySword");
		forerunnerBlock = new forerunnerBlock(Material.rock);
		entityMongoose = new EntityMongoose(null);
		rocket = new EntityRocket(null);
		bullet = new EntityBullet(null);
		mobElite = new EntityElite(null);
		int randomID3 = EntityRegistry.findGlobalUniqueEntityId();
		System.out.println("RENDERING BULLET");
		EntityRegistry.registerModEntity(EntityBullet.class, "Bullet", randomID3, this, 250, 50, true);
		int randomID4 = EntityRegistry.findGlobalUniqueEntityId();
		System.out.println("RENDERING MONGOOSE");
		EntityRegistry.registerModEntity(EntityMongoose.class, "Mongoose", randomID4, this, 250, 50, true);
		int randomID2 = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerModEntity(EntityRocket.class, "Rocket", randomID2, this, 250, 50, true);
		int randomID = EntityRegistry.findGlobalUniqueEntityId();
		System.out.println("RENDERING ELITE");
		EntityRegistry.registerGlobalEntityID(EntityElite.class, "Elite", randomID, 230, 78);
		EntityRegistry.addSpawn(EntityElite.class, 15, 4, 10, EnumCreatureType.MONSTER, BiomeGenBase.taigaHills, BiomeGenBase.jungle, 
				BiomeGenBase.jungleHills, BiomeGenBase.plains, BiomeGenBase.taiga, BiomeGenBase.forest, 
				BiomeGenBase.forestHills, BiomeGenBase.swampland, BiomeGenBase.river, BiomeGenBase.beach, 
				BiomeGenBase.desert, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.desertHills, BiomeGenBase.frozenRiver, BiomeGenBase.icePlains, 
				BiomeGenBase.coldBeach, BiomeGenBase.coldTaiga, BiomeGenBase.megaTaiga, BiomeGenBase.coldTaigaHills, BiomeGenBase.stoneBeach, BiomeGenBase.extremeHillsPlus, 
				BiomeGenBase.birchForest, BiomeGenBase.savanna, BiomeGenBase.mesa, BiomeGenBase.roofedForest, BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore, BiomeGenBase.mesaPlateau);
		//EntityRegistry.registerModEntity(EntityElite.class,"Elite", randomID, this, 250, 50, true);
		GameRegistry.registerItem(itemMongoose, "itemMongoose");
		GameRegistry.registerItem(covenantPiece, "covenantPiece");
		GameRegistry.registerBlock(forerunnerBlock, "forerunnerBlock");
		GameRegistry.registerItem(SpartanHelmet, "SpartanHelmet");
		GameRegistry.registerItem(SpartanChestplate, "SpartanChestplate");
		GameRegistry.registerItem(SpartanLeggings, "SpartanLeggings");
		GameRegistry.registerItem(SpartanBoots, "SpartanBoots");
		GameRegistry.registerBlock(HaloOre, "HaloOre");
		GameRegistry.registerItem(HaloIngot, "HaloIngot");
		GameRegistry.registerItem(rocketLauncher, "rocketLauncher");
		GameRegistry.registerItem(ammoRocket, "ammoRocket");
		GameRegistry.registerItem(ammoAssaultRifle, "ammoAssaultRifle");
		GameRegistry.registerItem(itemAssaultRifle, "itemAssaultRifle");
		GameRegistry.registerItem(itemBattleRifle, "itemBattleRifle");
		GameRegistry.registerItem(RedSpartanHelmet, "RedSpartanHelmet");
		GameRegistry.registerItem(RedSpartanChestplate, "RedSpartanChestplate");
		GameRegistry.registerItem(RedSpartanLeggings, "RedSpartanLeggings");
		GameRegistry.registerItem(RedSpartanBoots, "RedSpartanBoots");
		GameRegistry.registerItem(GreenSpartanHelmet, "GreenSpartanHelmet");
		GameRegistry.registerItem(GreenSpartanChestplate, "GreenSpartanChestplate");
		GameRegistry.registerItem(GreenSpartanLeggings, "GreenSpartanLeggings");
		GameRegistry.registerItem(GreenSpartanBoots, "GreenSpartanBoots");
		GameRegistry.registerItem(BlueSpartanHelmet, "BlueSpartanHelmet");
		GameRegistry.registerItem(BlueSpartanChestplate, "BlueSpartanChestplate");
		GameRegistry.registerItem(BlueSpartanLeggings, "BlueSpartanLeggings");
		GameRegistry.registerItem(BlueSpartanBoots, "BlueSpartanBoots");
		GameRegistry.registerItem(CovenantHelmet, "CovenantHelmet");
		GameRegistry.registerItem(CovenantChestplate, "CovenantChestplate");
		GameRegistry.registerItem(CovenantLeggings, "CovenantLeggings");
		GameRegistry.registerItem(CovenantBoots, "CovenantBoots");
		GameRegistry.registerItem(ActiveCamoHelmet, "ActiveCamoHelmet");
		GameRegistry.registerItem(ActiveCamoChestplate, "ActiveCamoChestplate");
		GameRegistry.registerItem(ActiveCamoLeggings, "ActiveCamoLeggings");
		GameRegistry.registerItem(ActiveCamoBoots, "ActiveCamoBoots");
		//Recipies
		GameRegistry.addRecipe(new ItemStack(SpartanHelmet, 1), new Object[]{"XXX","X X", 'X', HaloIngot});
		GameRegistry.addRecipe(new ItemStack(SpartanChestplate, 1), new Object[]{"X X","XXX", "XXX", 'X', HaloIngot});
		GameRegistry.addRecipe(new ItemStack(SpartanLeggings, 1), new Object[]{"XXX","X X","X X", 'X', HaloIngot});
		GameRegistry.addRecipe(new ItemStack(SpartanBoots, 1), new Object[]{"X X","X X", 'X', covenantPiece});
		GameRegistry.addRecipe(new ItemStack(CovenantHelmet, 1), new Object[]{"XXX","X X", 'X', covenantPiece});
		GameRegistry.addRecipe(new ItemStack(CovenantChestplate, 1), new Object[]{"X X","XXX", "XXX", 'X', covenantPiece});
		GameRegistry.addRecipe(new ItemStack(CovenantLeggings, 1), new Object[]{"XXX","X X","X X", 'X', covenantPiece});
		GameRegistry.addRecipe(new ItemStack(CovenantBoots, 1), new Object[]{"X X","X X", 'X', covenantPiece});
		GameRegistry.addRecipe(new ItemStack(ammoRocket, 5), new Object[]{" X "," X ", " X ", 'X', HaloIngot});
		//Active Camo Armor
		GameRegistry.addShapelessRecipe(new ItemStack(ActiveCamoHelmet, 1), new ItemStack(Items.golden_carrot, 1), new ItemStack(Items.fermented_spider_eye, 1), new ItemStack(Items.nether_wart, 1), SpartanHelmet);
		GameRegistry.addShapelessRecipe(new ItemStack(ActiveCamoChestplate, 1), new ItemStack(Items.golden_carrot, 1), new ItemStack(Items.fermented_spider_eye, 1), new ItemStack(Items.nether_wart, 1), SpartanChestplate);
		GameRegistry.addShapelessRecipe(new ItemStack(ActiveCamoLeggings, 1), new ItemStack(Items.golden_carrot, 1), new ItemStack(Items.fermented_spider_eye, 1), new ItemStack(Items.nether_wart, 1), SpartanLeggings);
		GameRegistry.addShapelessRecipe(new ItemStack(ActiveCamoBoots, 1), new ItemStack(Items.golden_carrot, 1), new ItemStack(Items.fermented_spider_eye, 1), new ItemStack(Items.nether_wart, 1), SpartanBoots);
		//Red Spartan Armor
		GameRegistry.addShapelessRecipe(new ItemStack(RedSpartanHelmet, 1), new ItemStack(Items.dye, 1, 1), SpartanHelmet);
		GameRegistry.addShapelessRecipe(new ItemStack(RedSpartanChestplate, 1), new ItemStack(Items.dye, 1, 1), SpartanChestplate);
		GameRegistry.addShapelessRecipe(new ItemStack(RedSpartanLeggings, 1), new ItemStack(Items.dye, 1, 1), SpartanLeggings);
		GameRegistry.addShapelessRecipe(new ItemStack(RedSpartanBoots, 1), new ItemStack(Items.dye, 1, 1), SpartanBoots);
		//Green Spartan Armor
		GameRegistry.addShapelessRecipe(new ItemStack(GreenSpartanHelmet, 1), new ItemStack(Items.dye, 1, 10), SpartanHelmet);
		GameRegistry.addShapelessRecipe(new ItemStack(GreenSpartanChestplate, 1), new ItemStack(Items.dye, 1, 10), SpartanChestplate);
		GameRegistry.addShapelessRecipe(new ItemStack(GreenSpartanLeggings, 1), new ItemStack(Items.dye, 1, 10), SpartanLeggings);
		GameRegistry.addShapelessRecipe(new ItemStack(GreenSpartanBoots, 1), new ItemStack(Items.dye, 1, 10), SpartanBoots);
		//Blue Spartan Armor
		GameRegistry.addShapelessRecipe(new ItemStack(BlueSpartanHelmet, 1), new ItemStack(Items.dye, 1, 6), SpartanHelmet);
		GameRegistry.addShapelessRecipe(new ItemStack(BlueSpartanChestplate, 1), new ItemStack(Items.dye, 1, 6), SpartanChestplate);
		GameRegistry.addShapelessRecipe(new ItemStack(BlueSpartanLeggings, 1), new ItemStack(Items.dye, 1, 6), SpartanLeggings);
		GameRegistry.addShapelessRecipe(new ItemStack(BlueSpartanBoots, 1), new ItemStack(Items.dye, 1, 6), SpartanBoots);
		ItemStack gunStack = new ItemStack(Items.gunpowder);
		GameRegistry.addRecipe(new ItemStack(rocketLauncher, 1), new Object[]{"XXX", "XYX", "XYX", 'X', HaloIngot, 'Y', gunStack});
		ItemStack ironStack = new ItemStack(Items.iron_ingot);
		GameRegistry.addRecipe(new ItemStack(itemAssaultRifle, 1), new Object[]{"ZXX", " ZX", " YZ", 'X', HaloIngot, 'Y', gunStack, 'Z', ironStack});
		ItemStack goldStack = new ItemStack(Items.gold_ingot);
		GameRegistry.addRecipe(new ItemStack(ammoAssaultRifle, 15), new Object[]{" X ", " X ", "XYX", 'X', goldStack, 'Y', gunStack});
		GameRegistry.addSmelting(HaloOre, new ItemStack(HaloIngot, 1), 0.1f);
		GameRegistry.addShapelessRecipe(new ItemStack(covenantPiece, 1), new ItemStack(Items.blaze_rod, 1), new ItemStack(Items.coal, 1));
		//World Gen
		GameRegistry.registerWorldGenerator(HaloOreGen, 1);
	}
	@EventHandler
	public void init(FMLInitializationEvent e){
		ModelResourceLocation res = new ModelResourceLocation("halocraft:energySword", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(swordEnergySword, 0, res);
		ModelResourceLocation res2 = new ModelResourceLocation("halocraft:HaloIngot", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(HaloIngot, 0, res2);
		ModelResourceLocation res3 = new ModelResourceLocation("halocraft:SpartanChestplate", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(SpartanChestplate, 0, res3);
		ModelResourceLocation res4 = new ModelResourceLocation("halocraft:SpartanHelmet", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(SpartanHelmet, 0, res4);
		ModelResourceLocation res5 = new ModelResourceLocation("halocraft:SpartanLeggings", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(SpartanLeggings, 0, res5);
		ModelResourceLocation res6 = new ModelResourceLocation("halocraft:SpartanBoots", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(SpartanBoots, 0, res6);
		ModelResourceLocation res7 = new ModelResourceLocation("halocraft:ammoRocket", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ammoRocket, 0, res7);
		ModelResourceLocation res8 = new ModelResourceLocation("halocraft:rocketLauncher", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(rocketLauncher, 0, res8);
		ModelResourceLocation res9 = new ModelResourceLocation("halocraft:ammoAssaultRifle", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ammoAssaultRifle, 0, res9);
		ModelResourceLocation res10 = new ModelResourceLocation("halocraft:itemAssaultRifle", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemAssaultRifle, 0, res10);
		ModelResourceLocation res11 = new ModelResourceLocation("halocraft:itemBattleRifle", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBattleRifle, 0, res11);
		ModelResourceLocation res12 = new ModelResourceLocation("halocraft:itemMongoose", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemMongoose, 0, res12);
		//Registering Red Spartan Armor
		ModelResourceLocation res13 = new ModelResourceLocation("halocraft:RedSpartanChestplate", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(RedSpartanChestplate, 0, res13);
		ModelResourceLocation res14 = new ModelResourceLocation("halocraft:RedSpartanHelmet", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(RedSpartanHelmet, 0, res14);
		ModelResourceLocation res15 = new ModelResourceLocation("halocraft:RedSpartanLeggings", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(RedSpartanLeggings, 0, res15);
		ModelResourceLocation res16 = new ModelResourceLocation("halocraft:RedSpartanBoots", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(RedSpartanBoots, 0, res16);
		//Rendering Green Spartan Armor
		ModelResourceLocation res17 = new ModelResourceLocation("halocraft:GreenSpartanChestplate", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(GreenSpartanChestplate, 0, res17);
		ModelResourceLocation res18 = new ModelResourceLocation("halocraft:GreenSpartanHelmet", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(GreenSpartanHelmet, 0, res18);
		ModelResourceLocation res19 = new ModelResourceLocation("halocraft:GreenSpartanLeggings", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(GreenSpartanLeggings, 0, res19);
		ModelResourceLocation res20 = new ModelResourceLocation("halocraft:GreenSpartanBoots", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(GreenSpartanBoots, 0, res20);
		//Rendering Blue Spartan Armor
		ModelResourceLocation res21 = new ModelResourceLocation("halocraft:BlueSpartanChestplate", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(BlueSpartanChestplate, 0, res21);
		ModelResourceLocation res22 = new ModelResourceLocation("halocraft:BlueSpartanHelmet", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(BlueSpartanHelmet, 0, res22);
		ModelResourceLocation res23 = new ModelResourceLocation("halocraft:BlueSpartanLeggings", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(BlueSpartanLeggings, 0, res23);
		ModelResourceLocation res24 = new ModelResourceLocation("halocraft:BlueSpartanBoots", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(BlueSpartanBoots, 0, res24);
		//Rendering Default Covenant Armor
		ModelResourceLocation res26 = new ModelResourceLocation("halocraft:CovenantChestplate", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(CovenantChestplate, 0, res26);
		ModelResourceLocation res27 = new ModelResourceLocation("halocraft:CovenantHelmet", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(CovenantHelmet, 0, res27);
		ModelResourceLocation res28 = new ModelResourceLocation("halocraft:CovenantLeggings", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(CovenantLeggings, 0, res28);
		ModelResourceLocation res29 = new ModelResourceLocation("halocraft:CovenantBoots", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(CovenantBoots, 0, res29);
		//Rendering ActiveCamo Armor
		ModelResourceLocation res30 = new ModelResourceLocation("halocraft:ActiveCamoChestplate", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ActiveCamoChestplate, 0, res30);
		ModelResourceLocation res31 = new ModelResourceLocation("halocraft:ActiveCamoHelmet", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ActiveCamoHelmet, 0, res31);
		ModelResourceLocation res32 = new ModelResourceLocation("halocraft:ActiveCamoLeggings", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ActiveCamoLeggings, 0, res32);
		ModelResourceLocation res33 = new ModelResourceLocation("halocraft:ActiveCamoBoots", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ActiveCamoBoots, 0, res33);
		//Rendering Halo Ore
		Item itemBlockSimple = GameRegistry.findItem("halocraft", "HaloOre");
		ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("halocraft:HaloOre", "inventory");
		final int DEFAULT_ITEM_SUBTYPE = 0;
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockSimple, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation);
		//Rendering Entities
		RenderingRegistry.registerEntityRenderingHandler(EntityMongoose.class, new RenderMongooseEntity(Minecraft.getMinecraft().getRenderManager()));
		RenderingRegistry.registerEntityRenderingHandler(EntityBullet.class, new RenderBulletEntity(Minecraft.getMinecraft().getRenderManager()));
		RenderingRegistry.registerEntityRenderingHandler(EntityRocket.class, new RenderRocketEntity(Minecraft.getMinecraft().getRenderManager()));
		RenderingRegistry.registerEntityRenderingHandler(EntityElite.class, new RenderEliteEntity(Minecraft.getMinecraft().getRenderManager(), new ModelBiped(), 0));
		ModelResourceLocation res25 = new ModelResourceLocation("halocraft:covenantPiece", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(covenantPiece, 0, res25);
	}
}


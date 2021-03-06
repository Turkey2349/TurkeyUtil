package com.turkey.turkeyUtil.items.tools;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class UtilTools
{
	public static ToolMaterial flint = EnumHelper.addToolMaterial("Flint", 0, 100, 3.0F, 1.0F, 14);
	public static ToolMaterial fabulousDiamond = EnumHelper.addToolMaterial("Fabulous_Diamond", 3, 2000, 12.0F, 4.0F, 22);
	public static ToolMaterial hammerMaterial = EnumHelper.addToolMaterial("Hammer_Material", 1, 100, 3.0F, 1.0F, 14);

	public static Item woodHammer;
	public static Item stoneHammer;
	public static Item ironHammer;
	public static Item goldHammer;
	public static Item diamondHammer;

	public static Item bgShield;

	public static Item soulReaper;
	public static Item soulEssenceReaper;

	public static UtilSword fabulousSword;
	public static UtilPickaxe fabulousPickaxe;
	public static UtilSpade fabulousSpade;
	public static UtilAxe fabulousAxe;
	public static UtilHoe fabulousHoe;

	public static UtilSword flintSword;
	public static UtilPickaxe flintPickaxe;
	public static UtilSpade flintSpade;
	public static UtilAxe flintAxe;
	public static UtilHoe flintHoe;

	public static void loadTools()
	{
		GameRegistry.registerItem(woodHammer = new Hammer("Wooden_Hammer", 16, hammerMaterial), "Wooden_Hammer");
		GameRegistry.registerItem(stoneHammer = new Hammer("Stone_Hammer", 32, hammerMaterial), "Stone_Hammer");
		GameRegistry.registerItem(ironHammer = new Hammer("Iron_Hammer", 64, hammerMaterial), "Iron_Hammer");
		GameRegistry.registerItem(goldHammer = new Hammer("Gold_Hammer", 10, hammerMaterial), "Gold_Hammer");
		GameRegistry.registerItem(diamondHammer = new Hammer("Diamond_Hammer", 390, hammerMaterial), "Diamond_Hammer");

		GameRegistry.registerItem(bgShield = new BuildGuildShield(), "Build_Guild_Shield");

		GameRegistry.registerItem(soulReaper = new SoulReaper(), "Soul_Reaper");
		GameRegistry.registerItem(soulEssenceReaper = new SoulEssanceReaper(), "Soul_Essence_Reaper");

		GameRegistry.registerItem(fabulousSword = new UtilSword("Fabulous_Sword", fabulousDiamond), "Fabulous_Sword");
		GameRegistry.registerItem(fabulousPickaxe = new UtilPickaxe("Fabulous_Pickaxe", fabulousDiamond), "Fabulous_Pickaxe");
		GameRegistry.registerItem(fabulousSpade = new UtilSpade("Fabulous_Shovel", fabulousDiamond), "Fabulous_Shovel");
		GameRegistry.registerItem(fabulousAxe = new UtilAxe("Fabulous_Axe", fabulousDiamond), "Fabulous_Axe");
		GameRegistry.registerItem(fabulousHoe = new UtilHoe("Fabulous_Hoe", fabulousDiamond), "Fabulous_Hoe");

		GameRegistry.registerItem(flintSword = new UtilSword("Flint_Sword", flint), "Flint_Sword");
		GameRegistry.registerItem(flintPickaxe = new UtilPickaxe("Flint_Pickaxe", flint), "Flint_Pickaxe");
		GameRegistry.registerItem(flintSpade = new UtilSpade("Flint_Shovel", flint), "Flint_Shovel");
		GameRegistry.registerItem(flintAxe = new UtilAxe("Flint_Axe", flint), "Flint_Axe");
		GameRegistry.registerItem(flintHoe = new UtilHoe("Flint_Hoe", flint), "Flint_Hoe");
	}
}

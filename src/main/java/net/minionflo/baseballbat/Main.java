package net.minionflo.baseballbat;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minionflo.baseballbat.Tools.CopperMaterial;
import net.minionflo.baseballbat.Tools.DiamondMaterial;
import net.minionflo.baseballbat.Tools.GoldMaterial;
import net.minionflo.baseballbat.Tools.IronMaterial;
import net.minionflo.baseballbat.Tools.NetheriteMaterial;
import net.minionflo.baseballbat.Tools.StoneMaterial;
import net.minionflo.baseballbat.Tools.WoodMaterial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("Baseballbat");

	public static ToolItem WOOD_BASEBALLBAT = new SwordItem(WoodMaterial.INSTANCE, -1, -2F,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static ToolItem STONE_BASEBALLBAT = new SwordItem(StoneMaterial.INSTANCE, -1, -2F,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static ToolItem IRON_BASEBALLBAT = new SwordItem(IronMaterial.INSTANCE, -1, -2F,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static ToolItem DIAMOND_BASEBALLBAT = new SwordItem(DiamondMaterial.INSTANCE, -1, -2F,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static ToolItem NETHERITE_BASEBALLBAT = new SwordItem(NetheriteMaterial.INSTANCE, -1, -2F,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static ToolItem GOLD_BASEBALLBAT = new SwordItem(GoldMaterial.INSTANCE, -1, -2F,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static ToolItem COPPER_BASEBALLBAT = new SwordItem(CopperMaterial.INSTANCE, -1, -2F,
			new Item.Settings().group(ItemGroup.COMBAT));

	@Override
	public void onInitialize() {
		LOGGER.info("Adding Baseball Bats");
		Registry.register(Registry.ITEM, new Identifier("baseballbat", "wood_baseballbat"), WOOD_BASEBALLBAT);
		Registry.register(Registry.ITEM, new Identifier("baseballbat", "stone_baseballbat"), STONE_BASEBALLBAT);
		Registry.register(Registry.ITEM, new Identifier("baseballbat", "gold_baseballbat"), GOLD_BASEBALLBAT);
		Registry.register(Registry.ITEM, new Identifier("baseballbat", "copper_baseballbat"), COPPER_BASEBALLBAT);
		Registry.register(Registry.ITEM, new Identifier("baseballbat", "iron_baseballbat"), IRON_BASEBALLBAT);
		Registry.register(Registry.ITEM, new Identifier("baseballbat", "diamond_baseballbat"), DIAMOND_BASEBALLBAT);
		Registry.register(Registry.ITEM, new Identifier("baseballbat", "netherite_baseballbat"), NETHERITE_BASEBALLBAT);
	}
}

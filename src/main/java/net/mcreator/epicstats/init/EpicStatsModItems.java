
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.epicstats.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.epicstats.item.BookofMemoriesItem;
import net.mcreator.epicstats.item.BookOfShadowSacrificeItem;
import net.mcreator.epicstats.EpicStatsMod;

public class EpicStatsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EpicStatsMod.MODID);
	public static final RegistryObject<Item> BOOK_OF_SHADOW_SACRIFICE = REGISTRY.register("book_of_shadow_sacrifice", () -> new BookOfShadowSacrificeItem());
	public static final RegistryObject<Item> BOOKOF_MEMORIES = REGISTRY.register("bookof_memories", () -> new BookofMemoriesItem());
}

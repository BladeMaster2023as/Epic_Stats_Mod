
package net.mcreator.epicstats.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class BookofMemoriesItem extends Item {
	public BookofMemoriesItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.EPIC));
	}
}

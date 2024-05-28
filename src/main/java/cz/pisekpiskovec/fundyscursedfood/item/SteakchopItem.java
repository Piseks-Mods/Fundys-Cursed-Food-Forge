
package cz.pisekpiskovec.fundyscursedfood.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class SteakchopItem extends Item {
	public SteakchopItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(16).saturationMod(25.6f).meat().build()));
	}
}

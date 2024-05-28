
package cz.pisekpiskovec.fundyscursedfood.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class SteakcochopItem extends Item {
	public SteakcochopItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(21).saturationMod(31.6f).meat().build()));
	}
}


package cz.pisekpiskovec.fundyscursedfood.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class SteakcochickchopItem extends Item {
	public SteakcochickchopItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(27).saturationMod(38.8f).meat().build()));
	}
}

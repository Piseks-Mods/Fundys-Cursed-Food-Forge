
package cz.pisekpiskovec.fundyscursedfood.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class SteakcochicarrochopieItem extends Item {
	public SteakcochicarrochopieItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(32).saturationMod(42.8f).meat().build()));
	}
}

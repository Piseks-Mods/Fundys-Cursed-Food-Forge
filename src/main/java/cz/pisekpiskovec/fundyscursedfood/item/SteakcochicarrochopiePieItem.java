
package cz.pisekpiskovec.fundyscursedfood.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class SteakcochicarrochopiePieItem extends Item {
	public SteakcochicarrochopiePieItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(40).saturationMod(47.6f).meat().build()));
	}
}

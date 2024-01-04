package ninjadude75.villageexapansion.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import ninjadude75.villageexapansion.villager.ModVillagers;

public class ModCustomTrades {
    public static void registerCustomTrades() {

        TradeOfferHelper.registerVillagerOffers(ModVillagers.HUNTER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.PORKCHOP, 10),
                            5, 10, 0.075f));
                });
    }
}

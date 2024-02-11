package net.embromoney.item;

import net.embromoney.EmbroMoney;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.util.Identifier;



public class ModItems {
    public static final Item ONE = registerItem("one_embroniy", new Item(new FabricItemSettings()));
    public static final Item FIVE = registerItem("five_embroniy", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(ONE);
        entries.add(FIVE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EmbroMoney.MOD_ID, name), item);
    }

    public static  void registerModItems() {
        EmbroMoney.LOGGER.info("Регестрируем Модовые предметы #" + EmbroMoney.MOD_ID);
    }
}

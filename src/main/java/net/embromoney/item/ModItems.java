package net.embromoney.item;

import net.embromoney.EmbroMoney;
import net.embromoney.item.custom.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.util.Identifier;
import net.embromoney.item.ModItems;
import net.embromoney.item.custom.ModArmorItem;




public class ModItems {
    public static final Item ONE = registerItem("one_embroniy", new Item(new FabricItemSettings().maxCount ( 50 )));
    public static final Item FIVE = registerItem("five_embroniy", new Item(new FabricItemSettings().maxCount ( 50 )));
    public static final Item TEN = registerItem("ten_embroniy", new Item(new FabricItemSettings().maxCount ( 50 )));
    public static final Item FIFTY = registerItem("fifty_embroniy", new Item(new FabricItemSettings().maxCount ( 50 )));
    public static final Item ONE_HUNDRED = registerItem("one_hundred_embroniy", new Item(new FabricItemSettings().maxCount ( 50 )));
    public static final Item FIVE_HUNDRED = registerItem("five_hundred_embroniy", new Item(new FabricItemSettings().maxCount ( 50 )));
    public static final Item THOUSAND = registerItem("thousand_embroniy", new Item(new FabricItemSettings().maxCount ( 50 )));
    public static final Item FIVETHOUSAND = registerItem("five_thousand_embroniy", new Item(new FabricItemSettings().maxCount ( 50 )));
    public static final Item TENTHOUSAND = registerItem("ten_thousand_embroniy", new Item(new FabricItemSettings().maxCount ( 50 )));


    public static final Item MILITARY_HELMET_BROWN = registerItem("brown_military_helmet",
            new ArmorItem(ModArmorMaterials.ONE, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item MILITARY_CHESTPLATE_BROWN = registerItem("brown_military_chestplate",
            new ArmorItem(ModArmorMaterials.ONE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));

    public static final Item MILITARY_LEGGING_BROWN = registerItem("brown_military_leggings",
            new ArmorItem(ModArmorMaterials.ONE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));

    public static final Item MILITARY_BOOTS_BROWN = registerItem("brown_military_boots",
            new ArmorItem(ModArmorMaterials.ONE, ArmorItem.Type.BOOTS, new FabricItemSettings()));


    public static final Item MILITARY_HELMET_SAND = registerItem("sand_military_helmet",
            new ArmorItem(ModArmorSand.FIVE, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item MILITARY_CHESTPLATE_SAND = registerItem("sand_military_chestplate",
            new ArmorItem(ModArmorSand.FIVE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));

    public static final Item MILITARY_LEGGING_SAND = registerItem("sand_military_leggings",
            new ArmorItem(ModArmorSand.FIVE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));

    public static final Item MILITARY_BOOTS_SAND = registerItem("sand_military_boots",
            new ArmorItem(ModArmorSand.FIVE, ArmorItem.Type.BOOTS, new FabricItemSettings()));



    public static final Item MILITARY_HELMET_GREEN = registerItem("green_military_helmet",
            new ArmorItem(ModArmorGreen.TEN, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item MILITARY_CHESTPLATE_GREEN = registerItem("green_military_chestplate",
            new ArmorItem(ModArmorGreen.TEN, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));

    public static final Item MILITARY_LEGGING_GREEN = registerItem("green_military_leggings",
            new ArmorItem(ModArmorGreen.TEN, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));

    public static final Item MILITARY_BOOTS_GREEN = registerItem("green_military_boots",
            new ArmorItem(ModArmorGreen.TEN, ArmorItem.Type.BOOTS, new FabricItemSettings()));


    public static final Item MILITARY_HELMET_SNOW = registerItem("snow_military_helmet",
            new ArmorItem(ModArmorSnow.ONE_HUNDRED, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item MILITARY_CHESTPLATE_SNOW = registerItem("snow_military_chestplate",
            new ArmorItem(ModArmorSnow.ONE_HUNDRED, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));

    public static final Item MILITARY_LEGGING_SNOW = registerItem("snow_military_leggings",
            new ArmorItem(ModArmorSnow.ONE_HUNDRED, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));

    public static final Item MILITARY_BOOTS_SNOW = registerItem("snow_military_boots",
            new ArmorItem(ModArmorSnow.ONE_HUNDRED, ArmorItem.Type.BOOTS, new FabricItemSettings()));


    //-

    public static final Item IRON_RESIN = registerItem("iron_resin", new Item(new FabricItemSettings().maxCount(64)));

    public static final Item NIGHT_LENTILE = registerItem("night_lentile", new Item(new FabricItemSettings().maxCount(64)));

    public static final Item MILITARY_PLATE = registerItem("military_plate", new Item(new FabricItemSettings().maxCount ( 64 )));

    public static final Item AIR_BAG = registerItem("air_bag", new Item(new FabricItemSettings().maxCount( 64 )));

    public static final Item BROKEN_CRYSTAL_GRAVITA = registerItem("broken_crystal_gravita", new Item(new FabricItemSettings().maxCount ( 6 )));


    public static final Item CRYSTAL_GRAVITA = registerItem("crystal_gravita", new Item(new FabricItemSettings().maxCount ( 1 )));



    public static final Item HELMET_GRAVITA = registerItem("helmet_gravita",
            new ModArmorItem4(ModArmorSpe.CRYSTAL_GRAVITA, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item CHESTPLATE_GRAVITA = registerItem("chestplate_gravita",
            new ModArmorItem3(ModArmorSpe.CRYSTAL_GRAVITA, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));

    public static final Item LEGGING_GRAVITA = registerItem("leggings_gravita",
            new ModArmorItem2(ModArmorSpe.CRYSTAL_GRAVITA, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));

    public static final Item BOOTS_GRAVITA = registerItem("boots_gravita",
            new ModArmorItem(ModArmorSpe.CRYSTAL_GRAVITA, ArmorItem.Type.BOOTS, new FabricItemSettings()));


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(ONE);
        entries.add(FIVE);
        entries.add(TEN);
        entries.add(FIFTY);
        entries.add(ONE_HUNDRED);
        entries.add(FIVE_HUNDRED);
        entries.add(THOUSAND);
        entries.add(FIVETHOUSAND);
        entries.add(TENTHOUSAND);
        entries.add(NIGHT_LENTILE);
        entries.add(IRON_RESIN);
        entries.add(MILITARY_PLATE);
        entries.add(BROKEN_CRYSTAL_GRAVITA);
        entries.add(CRYSTAL_GRAVITA);



    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EmbroMoney.MOD_ID, name), item);
    }

    public static  void registerModItems() {
        EmbroMoney.LOGGER.info("Регестрируем Модовые предметы #" + EmbroMoney.MOD_ID);
    }
}

package net.embromoney.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.embromoney.item.ModItems;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.MILITARY_HELMET_BROWN, ModItems.MILITARY_CHESTPLATE_BROWN, ModItems.MILITARY_LEGGING_BROWN, ModItems.MILITARY_BOOTS_BROWN, ModItems.MILITARY_HELMET_SAND, ModItems.MILITARY_CHESTPLATE_SAND, ModItems.MILITARY_LEGGING_SAND, ModItems.MILITARY_BOOTS_SAND, ModItems.MILITARY_BOOTS_GREEN, ModItems.MILITARY_CHESTPLATE_GREEN, ModItems.MILITARY_LEGGING_GREEN, ModItems.MILITARY_HELMET_GREEN, ModItems.MILITARY_BOOTS_SNOW, ModItems.MILITARY_CHESTPLATE_SNOW, ModItems.MILITARY_LEGGING_SNOW, ModItems.MILITARY_HELMET_SNOW, ModItems.BOOTS_GRAVITA, ModItems.CHESTPLATE_GRAVITA, ModItems.LEGGING_GRAVITA, ModItems.HELMET_GRAVITA, ModItems.OFFICER_HELMET, ModItems.TEST);


    }
}




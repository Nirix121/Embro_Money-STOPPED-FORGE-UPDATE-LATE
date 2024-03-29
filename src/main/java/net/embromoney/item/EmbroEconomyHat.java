package net.embromoney.item;

import com.google.common.collect.Multimap;
import dev.emi.trinkets.api.SlotAttributes;
import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.item.ItemStack;

import java.util.UUID;

public class EmbroEconomyHat extends TrinketItem {

    public EmbroEconomyHat(Settings settings) {
        super(settings);
    }
   public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        var modifiers = super.getModifiers(stack, slot, entity, uuid);

       SlotAttributes.addSlotModifier(modifiers, "head/hats", uuid, 1, EntityAttributeModifier.Operation.ADDITION);


       return modifiers;
   }






}

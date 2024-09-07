package net.teninsomniak.moretools.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ScytheItem extends SwordItem {
    String[] repairIngredient;

    public ScytheItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, String... repairIngredient) {
        super(toolMaterial, attackDamage, attackSpeed,
                new FabricItemSettings().group(ModItemGroup.SCYTHES));
        this.repairIngredient = repairIngredient;
    }

    @Override
    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        List<Item> potentialIngredients = new ArrayList<>(List.of());
        Arrays.stream(repairIngredient).toList().forEach(repIngredient ->
                potentialIngredients.add(
                        Registry.ITEM.get(new Identifier(repIngredient))));


        return potentialIngredients.contains(ingredient.getItem());
    }
}

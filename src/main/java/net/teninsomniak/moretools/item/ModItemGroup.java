package net.teninsomniak.moretools.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.teninsomniak.moretools.MoreTools;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup SCYTHES = FabricItemGroupBuilder.build(
            new Identifier(MoreTools.MOD_ID, "scythes"), () ->new ItemStack(ModItems.WOODEN_SCYTHE));
}
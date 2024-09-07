package net.teninsomniak.moretools.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
//import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.teninsomniak.moretools.MoreTools;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item WOODEN_SCYTHE = registerItem("wooden_scythe",
            new Item(new FabricItemSettings().group(ModItemGroup.SCYTHES)));
    public static final Item STONE_SCYTHE = registerItem("stone_scythe",
            new Item(new FabricItemSettings().group(ModItemGroup.SCYTHES)));
    public static final Item IRON_SCYTHE = registerItem("iron_scythe",
            new Item(new FabricItemSettings().group(ModItemGroup.SCYTHES)));
    public static final Item GOLD_SCYTHE = registerItem("gold_scythe",
            new Item(new FabricItemSettings().group(ModItemGroup.SCYTHES)));
    public static final Item DIAMOND_SCYTHE = registerItem("diamond_scythe",
            new Item(new FabricItemSettings().group(ModItemGroup.SCYTHES)));
    public static final Item NETHERITE_SCYTHE = registerItem("netherite_scythe",
            new Item(new FabricItemSettings().group(ModItemGroup.SCYTHES)));
    public static final Item TEST_ITEM = registerItem("test_item",
            new Item(new FabricItemSettings().group(ModItemGroup.SCYTHES)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MoreTools.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MoreTools.LOGGER.debug("Registering Mod Items for " + MoreTools.MOD_ID);
    }
}
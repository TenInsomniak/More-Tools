package net.teninsomniak.moretools.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
//import net.minecraft.item.ItemGroup;
import net.teninsomniak.moretools.MoreTools;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item WOODEN_SCYTHE = registerItem("wooden_scythe",
            new Item(new FabricItemSettings().group(ModItemGroup.SCYTHES)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MoreTools.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MoreTools.LOGGER.debug("Registering Mod Items for " + MoreTools.MOD_ID);
    }
}
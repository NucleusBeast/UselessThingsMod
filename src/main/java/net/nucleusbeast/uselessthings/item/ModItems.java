package net.nucleusbeast.uselessthings.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.nucleusbeast.uselessthings.UselessThings;
import net.nucleusbeast.uselessthings.item.advanced.MajesticStick;
import net.nucleusbeast.uselessthings.item.tools.ModPickaxeItem;

public class ModItems {

    //Adding items:
    public static final Item NUCLEUS_CORE = registerItem("nucleus_core", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item PEARL_SHARD = registerItem("pearl_shard", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item MAJESTIC_STICK = registerItem("majestic_stick", new MajesticStick(new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    //todo: metal for tools

    //Adding tools:


    //Functions:
    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(UselessThings.MOD_ID, name), item);
    }
    public static void registerModItems(){
        UselessThings.LOGGER.info("Registering ModItems for "+ UselessThings.MOD_ID +" mod!");
    }
}

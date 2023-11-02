package net.mythrilbagels.bagelscauldron.item;

import net.minecraftforge.registries.RegistryObject;
import net.mythrilbagels.bagelscauldron.BagelsCauldron;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BagelsCauldron.MOD_ID);

    // public static final RegistryObject<Item> EXAMPLE = ITEMS.register("example",
            // () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

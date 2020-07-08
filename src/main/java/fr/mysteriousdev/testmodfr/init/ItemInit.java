package fr.mysteriousdev.testmodfr.init;

import fr.mysteriousdev.testmodfr.TestModFr;
import fr.mysteriousdev.testmodfr.item.EnderMaskItem;
import fr.mysteriousdev.testmodfr.item.RightClickItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestModFr.MODID);

    public static final RegistryObject<Item> SIMPLE_ITEM = ITEMS.register("simple_item", () -> new Item((new Item.Properties()).group(TestModFr.TEST_GROUP).maxStackSize(16)));
    public static final RegistryObject<Item> RC_ITEM = ITEMS.register("rc_item", () -> new RightClickItem((new Item.Properties()).group(TestModFr.TEST_GROUP).maxStackSize(16)));
    public static final RegistryObject<Item> ENDER_MASK = ITEMS.register("ender_mask", () -> new EnderMaskItem((new Item.Properties()).group(TestModFr.TEST_GROUP).maxStackSize(1)));


}

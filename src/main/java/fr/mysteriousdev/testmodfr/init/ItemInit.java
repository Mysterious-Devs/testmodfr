package fr.mysteriousdev.testmodfr.init;

import fr.mysteriousdev.testmodfr.TestModFr;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestModFr.MODID);

    public static final RegistryObject<Item> SIMPLE_ITEM = ITEMS.register("simple_item", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS).maxStackSize(16)));


}

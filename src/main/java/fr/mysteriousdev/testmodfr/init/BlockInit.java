package fr.mysteriousdev.testmodfr.init;

import fr.mysteriousdev.testmodfr.TestModFr;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TestModFr.MODID);
    public static final DeferredRegister<Item> ITEM_BLOCK = DeferredRegister.create(ForgeRegistries.ITEMS, TestModFr.MODID);

    public static final RegistryObject<Block> SIMPLE_BLOCK = createBlock("simple_block", () -> new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE)));

    private static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS.register(name, supplier);
        ITEM_BLOCK.register(name, () -> new BlockItem(block.get(), new Item.Properties().group(TestModFr.TEST_GROUP)));
        return block;
    }

}

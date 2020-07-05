package fr.mysteriousdev.testmodfr.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class RightClickItem extends Item {

    public RightClickItem(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {

        playerIn.inventory.addItemStackToInventory(new ItemStack(Items.DIAMOND, 48));

        return ActionResult.resultPass(playerIn.getHeldItem(handIn));

    }
}

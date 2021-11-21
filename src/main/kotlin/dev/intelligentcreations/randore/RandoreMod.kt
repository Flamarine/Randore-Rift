package dev.intelligentcreations.randore

import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.block.material.MaterialColor
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.util.ResourceLocation
import org.dimdev.rift.listener.BlockAdder
import org.dimdev.rift.listener.ItemAdder

class RandoreMod : BlockAdder, ItemAdder {

    internal var RANDOM_ORE: Block = Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(4.0F, 6.0F))
    internal var NETHER_RANDOM_ORE: Block = Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(3.0F, 6.0F))
    internal var END_RANDOM_ORE: Block = Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(5.0F, 6.0F))

    override fun registerBlocks() {
        Block.register(ResourceLocation("randore:random_ore"), RANDOM_ORE)
        Block.register(ResourceLocation("randore:nether_random_ore"), NETHER_RANDOM_ORE)
        Block.register(ResourceLocation("randore:end_random_ore"), END_RANDOM_ORE)
    }

    override fun registerItems() {
        Item.register(RANDOM_ORE, ItemGroup.BUILDING_BLOCKS)
        Item.register(NETHER_RANDOM_ORE, ItemGroup.BUILDING_BLOCKS)
        Item.register(END_RANDOM_ORE, ItemGroup.BUILDING_BLOCKS)
    }
}

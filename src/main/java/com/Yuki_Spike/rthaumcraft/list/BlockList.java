package com.Yuki_Spike.rthaumcraft.list;

import com.Yuki_Spike.rthaumcraft.Main;
import com.Yuki_Spike.rthaumcraft.blocks.CustomCrucible;
import com.Yuki_Spike.rthaumcraft.items.CustomLamp;

import net.minecraft.core.BlockPos;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StainedGlassBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;
import java.util.function.Supplier;

public class BlockList {
        public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
                        Main.MOD_ID);
        public static final DeferredRegister<Item> ITEMS = ItemList.ITEMS;

        public static final RegistryObject<Block> WOOD_GREAT = register("wood_great",
                () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                        .strength(2.0F, 2.0F).sound(SoundType.WOOD)),
                object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Block> TABLE = register("table",
                () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                        .strength(2.0F, 2.0F).sound(SoundType.WOOD).noOcclusion()),
                object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Block> CRUCIBLE = register("crucible",
                () -> new CustomCrucible(BlockBehaviour.Properties.of(Material.METAL)
                                        .strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()
                                        .requiresCorrectToolForDrops()),
                        object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Block> THAUMIUM_BLOCK = register("thaumium_block",
                () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                                        .strength(2.0F, 5.0F).sound(SoundType.METAL)
                                        .requiresCorrectToolForDrops()),
                        object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Block> VOID_BLOCK = register("void_block",
                () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                                        .strength(2.0F, 5.0F).sound(SoundType.METAL)
                                        .requiresCorrectToolForDrops()),
                        object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Block> SALIS_MUNDUS_BLOCK = register("salis_mundus_block",
                () -> new Block(BlockBehaviour.Properties.of(Material.SAND)
                                        .strength(0.5F, 1.0F).sound(SoundType.SAND)),
                        object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Block> AMBER_BLOCK = register("amber_block",
                () -> new CustomLamp(BlockBehaviour.Properties.of(Material.STONE)
                                        .strength(3.0F, 3.0F)
                                        .sound(SoundType.STONE).lightLevel(state -> state.getValue(CustomLamp.LIT) ? 15 : 0)
                                        .requiresCorrectToolForDrops()),
                        object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Block> AMBER_BRICK = register("amber_brick",
                () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                                        .strength(3.0F, 3.0F).sound(SoundType.STONE)
                                        .requiresCorrectToolForDrops()),
                        object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.MAIN_TAB)));


        public static final RegistryObject<Block> AMBER_ORE = registerBlock("amber_ore",
                () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                                        .strength(3.0F, 3.0F).requiresCorrectToolForDrops()
                                        .sound(SoundType.STONE), UniformInt.of(3, 10)), Main.MAIN_TAB);

        public static final RegistryObject<Block> CINNIBAR_ORE = registerBlock("cinnibar_ore",
                () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                                        .strength(3.0F, 3.0F).requiresCorrectToolForDrops()
                                        .sound(SoundType.STONE), UniformInt.of(3, 10)), Main.MAIN_TAB);

        public static final RegistryObject<Block> DEEPSLATE_AMBER_ORE = registerBlock("deepslate_amber_ore",
                () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                                        .strength(4.5F, 3.0F).requiresCorrectToolForDrops()
                                        .sound(SoundType.STONE), UniformInt.of(3, 10)), Main.MAIN_TAB);

        public static final RegistryObject<Block> DEEPSLATE_CINNIBAR_ORE = registerBlock("deepslate_cinnibar_ore",
                () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                                        .strength(4.5F, 3.0F).requiresCorrectToolForDrops()
                                        .sound(SoundType.STONE), UniformInt.of(3, 10)), Main.MAIN_TAB);                                        

        public static final RegistryObject<Block> SHARD_AIR_ORE = registerBlock("shard_air_ore",
                () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                                        .strength(3.0F, 3.0F).requiresCorrectToolForDrops()
                                        .sound(SoundType.STONE), UniformInt.of(3, 10)), Main.MAIN_TAB);
 
        public static final RegistryObject<Block> SHARD_FIRE_ORE = registerBlock("shard_fire_ore",
                () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                                        .strength(3.0F, 3.0F).requiresCorrectToolForDrops()
                                        .sound(SoundType.STONE), UniformInt.of(3, 10)), Main.MAIN_TAB);

        public static final RegistryObject<Block> SHARD_WATER_ORE = registerBlock("shard_water_ore",
                () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                                        .strength(3.0F, 3.0F).requiresCorrectToolForDrops()
                                        .sound(SoundType.STONE), UniformInt.of(3, 10)), Main.MAIN_TAB);

        public static final RegistryObject<Block> SHARD_EARTH_ORE = registerBlock("shard_earth_ore",
                () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                                        .strength(3.0F, 3.0F).requiresCorrectToolForDrops()
                                        .sound(SoundType.STONE), UniformInt.of(3, 10)), Main.MAIN_TAB);

        public static final RegistryObject<Block> SHARD_ORDER_ORE = registerBlock("shard_order_ore",
                () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                                        .strength(3.0F, 3.0F).requiresCorrectToolForDrops()
                                        .sound(SoundType.STONE), UniformInt.of(3, 10)), Main.MAIN_TAB);
                                        
        public static final RegistryObject<Block> SHARD_ENTROPY_ORE = registerBlock("shard_entropy_ore",
                () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                                        .strength(3.0F, 3.0F).requiresCorrectToolForDrops()
                                        .sound(SoundType.STONE), UniformInt.of(3, 10)), Main.MAIN_TAB);
        
        private static <T extends Block> RegistryObject<T> registerBlock(final String name,
                        final Supplier<? extends T> block) {
                                return BLOCKS.register(name, block);
                        }

        private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block,
                                   Function<RegistryObject<T>, Supplier<? extends Item>> item) {
                                        RegistryObject<T> obj = registerBlock(name, block);
                                        ITEMS.register(name, item.apply(obj));
                                        return obj;
                                }

        private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
                RegistryObject<T> toReturn = BLOCKS.register(name, block);
                registerBlockItem(name, toReturn, tab);
                return toReturn;
        }

        private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                               CreativeModeTab tab) {
                                                return ItemList.ITEMS.register(name, () -> new BlockItem(block.get(),
                                                new Item.Properties().tab(tab)));
                                        }

//        private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
//                return BLOCKS.register(name, block);
//        }

        public static Supplier<Block> createStainedGlassFromColor(DyeColor color) {
                return () -> new StainedGlassBlock(color, BlockBehaviour.Properties.of(Material.GLASS, color).strength(0.3F)
                .sound(SoundType.GLASS).noOcclusion().isValidSpawn(BlockList::never).isRedstoneConductor(BlockList::never).isSuffocating(BlockList::never).isViewBlocking(BlockList::never));
        }

        public static boolean always(BlockState state, BlockGetter reader, BlockPos pos) {
                return true;
        }

        public static boolean never(BlockState state, BlockGetter reader, BlockPos pos) {
                return false;
        }

        public static boolean always(BlockState state, BlockGetter reader, BlockPos pos, EntityType<?> entityType) {
                return true;
        }

        public static boolean never(BlockState state, BlockGetter reader, BlockPos pos, EntityType<?> entityType) {
                return false;
        }
}

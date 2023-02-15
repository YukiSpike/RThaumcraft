package com.Yuki_Spike.rthaumcraft.list;

import com.Yuki_Spike.rthaumcraft.Main;
import com.Yuki_Spike.rthaumcraft.blocks.*;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StainedGlassBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
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
                () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                                @Override
                                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                                        return true;
                                }
                                @Override
                                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                                        return 20;
                                }
                                @Override
                                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                                        return 5;
                                }
                        },
                object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Block> WOOD_SILVER = register("wood_silver",
                () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                        @Override
                        public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                                return true;
                        }
                        @Override
                        public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                                return 20;
                        }
                        @Override
                        public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                                return 5;
                        }
                },
                object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.MAIN_TAB)));
        
        public static final RegistryObject<Block> WOOD_SILVER_KNOT = register("wood_silver_knot",
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)),
                object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Block> WOOD_SILVER_LEAVES = register("wood_silver_leaves",
                () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).noOcclusion()) {
                        @Override
                        public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                                return true;
                        }
                        @Override
                        public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                                return 60;
                        }
                        @Override
                        public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                                return 30;
                        }
                },
                object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Block> WOOD_GREAT_LEAVES = register("wood_great_leaves",
                () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).noOcclusion()) {
                        @Override
                        public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                                return true;
                        }
                        @Override
                        public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                                return 60;
                        }
                        @Override
                        public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                                return 30;
                        }
                },
                object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Block> WOOD_GREAT_PLANKS = register("wood_great_planks",
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                        @Override
                        public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                                return true;
                        }
                        @Override
                        public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                                return 20;
                        }
                        @Override
                        public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                                return 5;
                        }
                },
                object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Block> WOOD_SILVER_PLANKS = register("wood_silver_planks",
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                        @Override
                        public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                                return true;
                        }
                        @Override
                        public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                                return 20;
                        }
                        @Override
                        public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                                return 5;
                        }
                },
                object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Block> WOOD_GREAT_SAPLING = register("wood_great_sapling",
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING).noOcclusion()),
                object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Block> WOOD_SILVER_SAPLING = register("wood_silver_sapling",
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING).noOcclusion()),
                object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Block> SHIMMERLEAF = register("shimmerleaf",
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()),
                object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.MAIN_TAB)));


        public static final RegistryObject<Block> ARCANE_PLATE = register("arcane_plate",
                () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                        .strength(2.0F, 2.0F).sound(SoundType.WOOD).noOcclusion()),
                object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Block> ARCANE_DOOR = register("arcane_door",
                () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                        .strength(2.0F, 2.0F).sound(SoundType.WOOD).noOcclusion()),
                object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Block> ARCANE_BRICK = register("arcane_brick",
                () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                        .strength(2.0F, 2.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()),
                object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Block> ARCANE_STONE = register("arcane_stone",
                () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                        .strength(2.0F, 2.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()),
                object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.MAIN_TAB)));
                
        public static final RegistryObject<Block> RUNIC_MATRIX = register("runic_matrix",
                () -> new CustomRunicMatrix(BlockBehaviour.Properties.of(Material.STONE)
                        .strength(2.0F, 2.0F).sound(SoundType.STONE).requiresCorrectToolForDrops().noOcclusion()),
                object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.MAIN_TAB)));
        
        public static final RegistryObject<Block> ALCHEMY_BLOCK = register("alchemy_block",
                () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                        .strength(2.0F, 2.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()),
                object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.MAIN_TAB)));
        
        public static final RegistryObject<Block> ALCHEMY_BLOCK_ADV = register("alchemy_block_adv",
                () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                        .strength(2.0F, 2.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()),
                object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Block> MAGIC_TALLOW_BLOCK = register("magic_tallow_block",
                () -> new Block(BlockBehaviour.Properties.of(Material.SNOW)
                        .strength(2.0F, 2.0F).sound(SoundType.SNOW)),
                object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Block> FLESH_BLOCK = register("flesh_block",
                () -> new Block(BlockBehaviour.Properties.of(Material.SNOW)
                        .strength(2.0F, 2.0F).sound(SoundType.SNOW)),
                object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Block> ARCANE_LAMP = register("arcane_lamp",
                () -> new CustomLamp(BlockBehaviour.Properties.of(Material.METAL)
                        .strength(2.0F, 2.0F).noOcclusion()
                        .sound(SoundType.METAL).lightLevel(state -> state.getValue(CustomLamp.LIT) ? 15 : 0)),
                object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Block> ARCANE_WORKTABLE = register("arcane_worktable",
                () -> new CustomWorktable(BlockBehaviour.Properties.of(Material.WOOD)
                        .strength(2.0F, 2.0F).sound(SoundType.WOOD).noOcclusion()),
                object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Block> TABLE = register("table",
                () -> new CustomTable(BlockBehaviour.Properties.of(Material.WOOD)
                        .strength(2.0F, 2.0F).sound(SoundType.WOOD).noOcclusion()),
                object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Block> RESEARCH_TABLE = register("research_table",
                () -> new Researchtable_Block(BlockBehaviour.Properties.of(Material.WOOD)
                        .strength(2.0F, 2.0F).sound(SoundType.WOOD).noOcclusion()),
                object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Block> ARCANE_PEDESTAL = register("arcane_pedestal",
                () -> new CustomPedestal(BlockBehaviour.Properties.of(Material.STONE)
                        .strength(2.0F, 2.0F).sound(SoundType.STONE).noOcclusion()),
                object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.MAIN_TAB)));
              
        public static final RegistryObject<Block> WARDED_GLASS = register("warded_glass",
                () -> new GlassBlock(BlockBehaviour.Properties.of(Material.GLASS)
                        .strength(1.0F, 1.0F).sound(SoundType.GLASS).noOcclusion()),
                object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Block> CRUCIBLE = register("crucible",
                () -> new CustomCrucible(BlockBehaviour.Properties.of(Material.METAL)
                        .strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()
                        .requiresCorrectToolForDrops()),
                object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Block> ALCHEMICAL_FURNACE = register("alchemical_furnace",
                () -> new AlchemicalFurnace_Block(BlockBehaviour.Properties.of(Material.STONE)
                        .strength(2.0F, 3.0F).sound(SoundType.STONE)
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
                () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                                        .strength(3.0F, 3.0F).sound(SoundType.STONE)
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

        public static final RegistryObject<Block> SHARD_AER_ORE = registerBlock("shard_aer_ore",
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

        public static final RegistryObject<Block> JAR = registerBlock("jar",
                () -> new Jar_Block(BlockBehaviour.Properties.of(Material.GLASS).noOcclusion()
                        .strength(1.0F, 1.0F).sound(SoundType.GLASS)), Main.MAIN_TAB);
        
        public static final RegistryObject<Block> JAR_void = registerBlock("jar_void",
                () -> new Jar_Block(BlockBehaviour.Properties.of(Material.GLASS).noOcclusion()
                        .strength(1.0F, 1.0F).sound(SoundType.GLASS)), Main.MAIN_TAB);

        public static final RegistryObject<Block> OBSIDIAN_TILE = register("obsidian_tile",
                () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6.0F, 10.0F).sound(SoundType.STONE)
                       .requiresCorrectToolForDrops()),
                object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Block> OBSIDIAN_TOTEM = register("obsidian_totem",
                () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6.0F, 10.0F).sound(SoundType.STONE)
                        .requiresCorrectToolForDrops()),
                object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Block> OBELISK = registerBlock("obelisk",
                () -> new Obelisk_Block(BlockBehaviour.Properties.of(Material.STONE).strength(6.0F, 10.0F)
                .sound(SoundType.STONE).noOcclusion()), Main.MAIN_TAB);

        public static final RegistryObject<Block> OBELISK_SIDE = registerBlock("obelisk_side",
                () -> new Obeliskside_Block(BlockBehaviour.Properties.of(Material.STONE).strength(6.0F, 10.0F)
                .sound(SoundType.STONE).noOcclusion()), Main.MAIN_TAB);

        public static final RegistryObject<Block> BANNER_CULTIST = registerBlock("banner_cultist",
                () -> new Banner_Block(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD)), Main.MAIN_TAB);


        public static final RegistryObject<LiquidBlock> DEATHWATER_BLOCK = BLOCKS.register("deathwater_block",
                () -> new LiquidBlock(FluidList.SOURCE_DEATHWATER, BlockBehaviour.Properties.copy(Blocks.WATER).noOcclusion()));

        public static final RegistryObject<LiquidBlock> WARDED_TERRA_BLOCK = BLOCKS.register("warded_terra_block",
                () -> new LiquidBlock(FluidList.SOURCE_DEATHWATER, BlockBehaviour.Properties.copy(Blocks.WATER).noOcclusion()));





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

        public static void register(IEventBus eventBus) {
                BLOCKS.register(eventBus);
        }

}

package com.Yuki_Spike.rthaumcraft.init;

import com.Yuki_Spike.rthaumcraft.RThaumcraft;
import com.Yuki_Spike.rthaumcraft.blocks.*;
import com.Yuki_Spike.rthaumcraft.world.tree.GreatTreeGrower;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.flag.FeatureFlag;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.grower.OakTreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RThaumcraft.MODID);

    //宏伟木
    public static final RegistryObject<Block> GREAT_SAPLING = registerBlock("great_sapling",
            () -> new SaplingBlock(new GreatTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_GREAT_SAPLING = BLOCKS.register("potted_great_sapling",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.GREAT_SAPLING, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> GREAT_LEAVES = registerBlock("great_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).noOcclusion()));
    public static final RegistryObject<Block> GREAT_LOG = registerBlock("great_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> GREAT_WOOD = registerBlock("great_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_GREAT_LOG = registerBlock("stripped_great_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_GREAT_WOOD = registerBlock("stripped_great_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> GREAT_PLANKS = registerBlock("great_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> GREAT_STAIRS = registerBlock("great_stairs",
            () -> new StairBlock(() -> ModBlocks.GREAT_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> GREAT_SLAB = registerBlock("great_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> GREAT_FENCE = registerBlock("great_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> GREAT_FENCE_GATE = registerBlock("great_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), ModWoodType.GREAT));
    public static final RegistryObject<Block> GREAT_DOOR = registerBlock("great_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of().mapColor(GREAT_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(3.0F).noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY), ModBlockSetType.GREAT));
    public static final RegistryObject<Block> GREAT_TRAPDOOR = registerBlock("great_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), ModBlockSetType.GREAT));
    public static final RegistryObject<Block> GREAT_BUTTON = registerBlock("great_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).noCollission().strength(0.5F).sound(SoundType.WOOD), ModBlockSetType.GREAT, 30, true));
    public static final RegistryObject<Block> GREAT_PRESSURE_PLATE = registerBlock("great_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.BASS).ignitedByLava().forceSolidOn().mapColor(GREAT_PLANKS.get().defaultMapColor()).noCollission().strength(0.5F).sound(SoundType.WOOD), ModBlockSetType.GREAT));
    public static final RegistryObject<Block> GREAT_SIGN = registerBlock("great_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().forceSolidOn().noCollission().strength(1.0F).sound(SoundType.WOOD), ModWoodType.GREAT));
    public static final RegistryObject<Block> GREAT_WALL_SIGN = registerBlock("great_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().forceSolidOn().noCollission().strength(1.0F).sound(SoundType.WOOD).lootFrom(GREAT_SIGN), ModWoodType.GREAT));
    public static final RegistryObject<Block> GREAT_HANGING_SIGN = registerBlock("great_hanging_sign",
            () -> new ModCeilingHangingSignBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().forceSolidOn().noCollission().strength(1.0F).sound(SoundType.WOOD), ModWoodType.GREAT));
    public static final RegistryObject<Block> GREAT_WALL_HANGING_SIGN = registerBlock("great_wall_hanging_sign",
            () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().forceSolidOn().noCollission().strength(1.0F).sound(SoundType.WOOD).lootFrom(GREAT_HANGING_SIGN), ModWoodType.GREAT));
    //银树
    public static final RegistryObject<Block> SILVER_SAPLING = registerBlock("silver_sapling",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> SILVER_LEAVES = registerBlock("silver_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).noOcclusion()));
    public static final RegistryObject<Block> SILVER_LOG = registerBlock("silver_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> SILVER_WOOD = registerBlock("silver_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_SILVER_LOG = registerBlock("stripped_silver_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_SILVER_WOOD = registerBlock("stripped_silver_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> SILVER_PLANKS = registerBlock("silver_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> SILVER_STAIRS = registerBlock("silver_stairs",
            () -> new StairBlock(() -> ModBlocks.SILVER_LOG.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> SILVER_SLAB = registerBlock("silver_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> SILVER_FENCE = registerBlock("silver_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> SILVER_FENCE_GATE = registerBlock("silver_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), ModWoodType.SILVER));
    public static final RegistryObject<Block> SILVER_DOOR = registerBlock("silver_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of().mapColor(SILVER_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(3.0F).noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY), ModBlockSetType.SILVER));
    public static final RegistryObject<Block> SILVER_TRAPDOOR = registerBlock("silver_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), ModBlockSetType.SILVER));
    public static final RegistryObject<Block> SILVER_BUTTON = registerBlock("silver_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).noCollission().strength(0.5F).sound(SoundType.WOOD), ModBlockSetType.SILVER, 30, true));
    public static final RegistryObject<Block> SILVER_PRESSURE_PLATE = registerBlock("silver_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.BASS).ignitedByLava().forceSolidOn().mapColor(SILVER_PLANKS.get().defaultMapColor()).noCollission().strength(0.5F).sound(SoundType.WOOD), ModBlockSetType.SILVER));
    public static final RegistryObject<Block> SILVER_SIGN = registerBlock("silver_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().forceSolidOn().noCollission().strength(1.0F).sound(SoundType.WOOD), ModWoodType.SILVER));
    public static final RegistryObject<Block> SILVER_WALL_SIGN = registerBlock("silver_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().forceSolidOn().noCollission().strength(1.0F).sound(SoundType.WOOD).lootFrom(SILVER_SIGN), ModWoodType.SILVER));
    public static final RegistryObject<Block> SILVER_HANGING_SIGN = registerBlock("silver_hanging_sign",
            () -> new ModCeilingHangingSignBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().forceSolidOn().noCollission().strength(1.0F).sound(SoundType.WOOD), ModWoodType.SILVER));
    public static final RegistryObject<Block> SILVER_WALL_HANGING_SIGN = registerBlock("silver_wall_hanging_sign",
            () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().forceSolidOn().noCollission().strength(1.0F).sound(SoundType.WOOD).lootFrom(SILVER_HANGING_SIGN), ModWoodType.SILVER));


    public static final RegistryObject<Block> ARCANE_STONE = registerBlock("arcane_stone",
            () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().mapColor(MapColor.STONE).strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ARCANE_STONE_STAIRS = registerBlock("arcane_stone_stairs",
            () -> new StairBlock(() -> ModBlocks.ARCANE_STONE.get().defaultBlockState(), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ARCANE_STONE_SLAB = registerBlock("arcane_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ARCANE_STONE_WALL = registerBlock("arcane_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ARCANE_BLOCK = registerBlock("arcane_block",
            () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().mapColor(MapColor.STONE).strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ARCANE_BLOCK_STAIRS = registerBlock("arcane_block_stairs",
            () -> new StairBlock(() -> ModBlocks.ARCANE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ARCANE_BLOCK_SLAB = registerBlock("arcane_block_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ARCANE_BLOCK_WALL = registerBlock("arcane_block_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ARCANE_DOOR = registerBlock("arcane_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of().mapColor(GREAT_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(6.0F).noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY), ModBlockSetType.GREAT));
    public static final RegistryObject<Block> ARCANE_PRESSURE_PLATE = registerBlock("arcane_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.BASS).ignitedByLava().forceSolidOn().mapColor(GREAT_PLANKS.get().defaultMapColor()).noCollission().strength(0.5F).sound(SoundType.WOOD), ModBlockSetType.GREAT));

    public static final RegistryObject<Block> THAUMIUM_BLOCK = registerBlock("thaumium_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> VOID_BLOCK = registerBlock("void_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> FLESH_BLOCK = registerBlock("flesh_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DIRT).strength(0.5F)));
    public static final RegistryObject<Block> TALLOW_BLOCK = registerBlock("tallow_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DIRT).strength(0.5F)));

    public static final RegistryObject<Block> TABLE = registerBlock("table",
            () -> new ModTable(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> TABLE_CRAFT = registerBlock("table_craft",
            () -> new ModTable_Craft(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> TABLE_RESEARCH = registerBlock("table_research",
            () -> new ModTable_Research(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> ARCANE_LAMP = registerBlock("arcane_lamp",
            () -> new ModLamp(BlockBehaviour.Properties.of().strength(3.5F).noOcclusion().requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN).lightLevel(state -> state.getValue(ModLamp.LIT) ? 15 : 0)));
    public static final RegistryObject<Block> ARCANE_LAMP_GROWTH = registerBlock("arcane_lamp_growth",
            () -> new ModLamp(BlockBehaviour.Properties.of().strength(3.5F).noOcclusion().requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN).lightLevel(state -> state.getValue(ModLamp.LIT) ? 15 : 0)));
    public static final RegistryObject<Block> ARCANE_LAMP_FERTILITY = registerBlock("arcane_lamp_fertility",
            () -> new ModLamp(BlockBehaviour.Properties.of().strength(3.5F).noOcclusion().requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN).lightLevel(state -> state.getValue(ModLamp.LIT) ? 15 : 0)));
    public static final RegistryObject<Block> ALCHEMICAL_FURNACE = registerBlock("alchemical_furnace",
            () -> new ModAlchemicalFurnace(BlockBehaviour.Properties.of().strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    //矿物
    public static final RegistryObject<Block> ORE_AMBER = registerBlock("ore_amber",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> ORE_DEEPSLATE_AMBER = registerBlock("ore_deepslate_amber",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> ORE_CINNIBAR = registerBlock("ore_cinnibar",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> ORE_DEEPSLATE_CINNIBAR = registerBlock("ore_deepslate_cinnibar",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> ORE_SHARD_AER = registerBlock("ore_shard_aer",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(4, 10)));
    public static final RegistryObject<Block> ORE_SHARD_FIRE = registerBlock("ore_shard_fire",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(4, 10)));
    public static final RegistryObject<Block> ORE_SHARD_WATER = registerBlock("ore_shard_water",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(4, 10)));
    public static final RegistryObject<Block> ORE_SHARD_EARTH = registerBlock("ore_shard_earth",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(4, 10)));
    public static final RegistryObject<Block> ORE_SHARD_ORDER = registerBlock("ore_shard_order",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(4, 10)));
    public static final RegistryObject<Block> ORE_SHARD_ENTROPY = registerBlock("ore_shard_entropy",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(4, 10)));

    //液体
    public static final RegistryObject<LiquidBlock> DEATHWATER_BLOCK = registerBlock("deathwater_block",
            () -> new LiquidBlock(ModFluids.SOURCE_DEATHWATER, BlockBehaviour.Properties.copy(Blocks.WATER)));

//    public static final RegistryObject<LiquidBlock> ESSENTIA_AER_BLOCK = registerBlock("essentia_aer_block",
//            () -> new LiquidBlock(ModFluids.SOURCE_ESSENTIA_AER, BlockBehaviour.Properties.copy(Blocks.WATER)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

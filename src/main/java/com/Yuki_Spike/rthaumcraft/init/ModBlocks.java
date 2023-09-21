package com.Yuki_Spike.rthaumcraft.init;

import com.Yuki_Spike.rthaumcraft.RThaumcraft;
import com.Yuki_Spike.rthaumcraft.blocks.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RThaumcraft.MODID);

    //宏伟木
    public static final RegistryObject<Block> GREAT_SAPLING = BLOCKS.register("great_sapling",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> GREAT_LEAVES = BLOCKS.register("great_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).noOcclusion()));
    public static final RegistryObject<Block> GREAT_LOG = BLOCKS.register("great_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> GREAT_WOOD = BLOCKS.register("great_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_GREAT_LOG = BLOCKS.register("stripped_great_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_GREAT_WOOD = BLOCKS.register("stripped_great_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> GREAT_PLANKS = BLOCKS.register("great_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> GREAT_STAIRS = BLOCKS.register("great_stairs",
            () -> new StairBlock(() -> ModBlocks.GREAT_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> GREAT_SLAB = BLOCKS.register("great_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> GREAT_FENCE = BLOCKS.register("great_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> GREAT_FENCE_GATE = BLOCKS.register("great_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), ModWoodType.GREAT));
    public static final RegistryObject<Block> GREAT_DOOR = BLOCKS.register("great_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of().mapColor(GREAT_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(3.0F).noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY), ModBlockSetType.GREAT));
    public static final RegistryObject<Block> GREAT_TRAPDOOR = BLOCKS.register("great_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), ModBlockSetType.GREAT));
    public static final RegistryObject<Block> GREAT_BUTTON = BLOCKS.register("great_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).noCollission().strength(0.5F).sound(SoundType.WOOD), ModBlockSetType.GREAT, 30, true));
    public static final RegistryObject<Block> GREAT_PRESSURE_PLATE = BLOCKS.register("great_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.BASS).ignitedByLava().forceSolidOn().mapColor(GREAT_PLANKS.get().defaultMapColor()).noCollission().strength(0.5F).sound(SoundType.WOOD), ModBlockSetType.GREAT));
    public static final RegistryObject<Block> GREAT_SIGN = BLOCKS.register("great_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().forceSolidOn().noCollission().strength(1.0F).sound(SoundType.WOOD), ModWoodType.GREAT));
    public static final RegistryObject<Block> GREAT_WALL_SIGN = BLOCKS.register("great_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().forceSolidOn().noCollission().strength(1.0F).sound(SoundType.WOOD).lootFrom(GREAT_SIGN), ModWoodType.GREAT));
    public static final RegistryObject<Block> GREAT_HANGING_SIGN = BLOCKS.register("great_hanging_sign",
            () -> new ModCeilingHangingSignBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().forceSolidOn().noCollission().strength(1.0F).sound(SoundType.WOOD), ModWoodType.GREAT));
    public static final RegistryObject<Block> GREAT_WALL_HANGING_SIGN = BLOCKS.register("great_wall_hanging_sign",
            () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().forceSolidOn().noCollission().strength(1.0F).sound(SoundType.WOOD).lootFrom(GREAT_HANGING_SIGN), ModWoodType.GREAT));
    //银树
    public static final RegistryObject<Block> SILVER_SAPLING = BLOCKS.register("silver_sapling",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> SILVER_LEAVES = BLOCKS.register("silver_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).noOcclusion()));
    public static final RegistryObject<Block> SILVER_LOG = BLOCKS.register("silver_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> SILVER_WOOD = BLOCKS.register("silver_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_SILVER_LOG = BLOCKS.register("stripped_silver_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_SILVER_WOOD = BLOCKS.register("stripped_silver_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> SILVER_PLANKS = BLOCKS.register("silver_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> SILVER_STAIRS = BLOCKS.register("silver_stairs",
            () -> new StairBlock(() -> ModBlocks.SILVER_LOG.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> SILVER_SLAB = BLOCKS.register("silver_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> SILVER_FENCE = BLOCKS.register("silver_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> SILVER_FENCE_GATE = BLOCKS.register("silver_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), ModWoodType.SILVER));
    public static final RegistryObject<Block> SILVER_DOOR = BLOCKS.register("silver_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of().mapColor(SILVER_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(3.0F).noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY), ModBlockSetType.SILVER));
    public static final RegistryObject<Block> SILVER_TRAPDOOR = BLOCKS.register("silver_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), ModBlockSetType.SILVER));
    public static final RegistryObject<Block> SILVER_BUTTON = BLOCKS.register("silver_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).noCollission().strength(0.5F).sound(SoundType.WOOD), ModBlockSetType.SILVER, 30, true));
    public static final RegistryObject<Block> SILVER_PRESSURE_PLATE = BLOCKS.register("silver_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.BASS).ignitedByLava().forceSolidOn().mapColor(SILVER_PLANKS.get().defaultMapColor()).noCollission().strength(0.5F).sound(SoundType.WOOD), ModBlockSetType.SILVER));
    public static final RegistryObject<Block> SILVER_SIGN = BLOCKS.register("silver_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().forceSolidOn().noCollission().strength(1.0F).sound(SoundType.WOOD), ModWoodType.SILVER));
    public static final RegistryObject<Block> SILVER_WALL_SIGN = BLOCKS.register("silver_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().forceSolidOn().noCollission().strength(1.0F).sound(SoundType.WOOD).lootFrom(SILVER_SIGN), ModWoodType.SILVER));
    public static final RegistryObject<Block> SILVER_HANGING_SIGN = BLOCKS.register("silver_hanging_sign",
            () -> new ModCeilingHangingSignBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().forceSolidOn().noCollission().strength(1.0F).sound(SoundType.WOOD), ModWoodType.SILVER));
    public static final RegistryObject<Block> SILVER_WALL_HANGING_SIGN = BLOCKS.register("silver_wall_hanging_sign",
            () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().forceSolidOn().noCollission().strength(1.0F).sound(SoundType.WOOD).lootFrom(SILVER_HANGING_SIGN), ModWoodType.SILVER));


    public static final RegistryObject<Block> ARCANE_STONE = BLOCKS.register("arcane_stone",
            () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().mapColor(MapColor.STONE).strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ARCANE_STONE_STAIRS = BLOCKS.register("arcane_stone_stairs",
            () -> new StairBlock(() -> ModBlocks.ARCANE_STONE.get().defaultBlockState(), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ARCANE_STONE_SLAB = BLOCKS.register("arcane_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ARCANE_STONE_WALL = BLOCKS.register("arcane_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ARCANE_BLOCK = BLOCKS.register("arcane_block",
            () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().mapColor(MapColor.STONE).strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ARCANE_BLOCK_STAIRS = BLOCKS.register("arcane_block_stairs",
            () -> new StairBlock(() -> ModBlocks.ARCANE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ARCANE_BLOCK_SLAB = BLOCKS.register("arcane_block_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ARCANE_BLOCK_WALL = BLOCKS.register("arcane_block_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> THAUMIUM_BLOCK = BLOCKS.register("thaumium_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> VOID_BLOCK = BLOCKS.register("void_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> FLESH_BLOCK = BLOCKS.register("flesh_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DIRT).strength(0.5F)));
    public static final RegistryObject<Block> TALLOW_BLOCK = BLOCKS.register("tallow_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DIRT).strength(0.5F)));

    public static final RegistryObject<Block> TABLE = BLOCKS.register("table",
            () -> new ModTable(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> TABLE_CRAFT = BLOCKS.register("table_craft",
            () -> new ModTable_Craft(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> TABLE_RESEARCH = BLOCKS.register("table_research",
            () -> new ModTable_Research(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD).noOcclusion()));

    //矿物
    public static final RegistryObject<Block> ORE_AMBER = BLOCKS.register("ore_amber",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> ORE_DEEPSLATE_AMBER = BLOCKS.register("ore_deepslate_amber",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ORE_CINNIBAR = BLOCKS.register("ore_cinnibar",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> ORE_DEEPSLATE_CINNIBAR = BLOCKS.register("ore_deepslate_cinnibar",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ORE_SHARD_AER = BLOCKS.register("ore_shard_aer",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> ORE_SHARD_FIRE = BLOCKS.register("ore_shard_fire",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> ORE_SHARD_WATER = BLOCKS.register("ore_shard_water",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> ORE_SHARD_EARTH = BLOCKS.register("ore_shard_earth",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> ORE_SHARD_ORDER = BLOCKS.register("ore_shard_order",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> ORE_SHARD_ENTROPY = BLOCKS.register("ore_shard_entropy",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));



    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

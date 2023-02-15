package com.Yuki_Spike.rthaumcraft.list;

import com.Yuki_Spike.rthaumcraft.Main;
import com.google.common.base.Supplier;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AspectList {
        public static final DeferredRegister<Item> ASPECTITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

        public static final RegistryObject<Item> AER = register("aer",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
        
        public static final RegistryObject<Item> ALIENIS = register("alienis",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
        
        public static final RegistryObject<Item> AQUA = register("aqua",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
        
        public static final RegistryObject<Item> ARBOR = register("arbor",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
        
        public static final RegistryObject<Item> AURAM = register("auram",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
        
        public static final RegistryObject<Item> BESTIA = register("bestia",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
        
        public static final RegistryObject<Item> COGNITIO = register("cognitio",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
        
        public static final RegistryObject<Item> CORPUS = register("corpus",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
        
        public static final RegistryObject<Item> EXANIMIS = register("exanimis",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
        
        public static final RegistryObject<Item> FABRICO = register("fabrico",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
        
        public static final RegistryObject<Item> FAMES = register("fames",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
        
        public static final RegistryObject<Item> GELUM = register("gelum",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
        
        public static final RegistryObject<Item> HERBA = register("herba",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
        
        public static final RegistryObject<Item> HUMANUS = register("humanus",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
        
        public static final RegistryObject<Item> IGNIS = register("ignis",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
        
        public static final RegistryObject<Item> INSTRUMENTUM = register("instrumentum",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
        
        public static final RegistryObject<Item> ITER = register("iter",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
        
        public static final RegistryObject<Item> LIMUS = register("limus",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
        
        public static final RegistryObject<Item> LUCRUM = register("lucrum",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
        
        public static final RegistryObject<Item> LUX = register("lux",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
        
        public static final RegistryObject<Item> MACHINA = register("machina",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
        
        public static final RegistryObject<Item> MESSIS = register("messis",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
                
        public static final RegistryObject<Item> METALLUM = register("metallum",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
                
        public static final RegistryObject<Item> METO = register("meto",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
                
        public static final RegistryObject<Item> MORTUUS = register("mortuus",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
                
        public static final RegistryObject<Item> MOTUS = register("motus",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
                
        public static final RegistryObject<Item> ORDO = register("ordo",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
                
        public static final RegistryObject<Item> PANNUS = register("pannus",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
                
        public static final RegistryObject<Item> PERDITIO = register("perditio",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
                
        public static final RegistryObject<Item> PERFODIO = register("perfodio",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
                
        public static final RegistryObject<Item> PERMUTATIO = register("permutatio",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
                
        public static final RegistryObject<Item> POTENTIA = register("potentia",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
                
        public static final RegistryObject<Item> PRAECANTATIO = register("praecantatio",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
                
        public static final RegistryObject<Item> SANO = register("sano",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
                
        public static final RegistryObject<Item> SENSUS = register("sensus",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
                
        public static final RegistryObject<Item> SPIRITUS = register("spiritus",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
                
        public static final RegistryObject<Item> TELUM = register("telum",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
                
        public static final RegistryObject<Item> TEMPESTAS = register("tempestas",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
                
        public static final RegistryObject<Item> TENEBRAE = register("tenebrae",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
                
        public static final RegistryObject<Item> TERRA = register("terra",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
                
        public static final RegistryObject<Item> TUTAMEN = register("tutamen",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
                
        public static final RegistryObject<Item> VENENUM = register("venenum",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
                
        public static final RegistryObject<Item> VICTUS = register("victus",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
                        
        public static final RegistryObject<Item> VINCULUM = register("vinculum",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
                        
        public static final RegistryObject<Item> VITIUM = register("vitium",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
                        
        public static final RegistryObject<Item> VITREUS = register("vitreus",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
                        
        public static final RegistryObject<Item> VOLATUS = register("volatus",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
        


        private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
            return ASPECTITEMS.register(name, item);
    }
    public static void register(IEventBus eventBus) {
        ASPECTITEMS.register(eventBus);
}

}
package net.mantori;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.mantori.entity.ModEntityTypes;
import net.mantori.item.ModItems;
import net.mantori.sounds.ModSounds;
import net.mantori.util.ModRenderHelper;
import net.mantori.world.feature.ModConfiguredFeatures;
import net.mantori.world.gen.ModWorldGen;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.world.biome.Biome;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mantori implements ModInitializer {

    public static final String MOD_ID = "mantori";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModConfiguredFeatures.registerConfiguredFeatures();

        ModItems.registerModItems();
        ModSounds.registerSounds();
        ModEntityTypes.registerModEntities();
        ModRenderHelper.setRenderLayers();
        BiomeModifications.addSpawn(
                BiomeSelectors.categories(Biome.Category.THEEND),
                SpawnGroup.CREATURE,
                ModEntityTypes.GREATER_APHID_ENTITY_TYPE,
                80,
                2,
                4);
        BiomeModifications.addSpawn(
                BiomeSelectors.categories(Biome.Category.THEEND),
                SpawnGroup.CREATURE,
                ModEntityTypes.LESSER_APHID_ENTITY_TYPE,
                90,
                4,
                6);
        ModWorldGen.generateModWorldGen();
    }
}

package net.mantori.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.mantori.world.feature.ModPlacedFeatures;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModFeatureGeneration {
    public static void generateBushes() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.THE_END),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BEETLEBERRY_BUSH_PLACED.getKey().get());
    }

    public static void generateGrass() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.THE_END),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.END_GRASS_PLACED.getKey().get());
    }
}

package io.github.cpearl0.ctnhcore.data.recipe;

import io.github.cpearl0.ctnhcore.registry.CTNHRecipeTypes;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

public class PhotovoltaicPowerRecipes {
    public static void init(Consumer<FinishedRecipe> provider) {
        CTNHRecipeTypes.PHOTOVOLTAIC_POWER.recipeBuilder("powering").circuitMeta(0)
                .duration(20)
                .EUt(-120)
                .save(provider);
    }
}

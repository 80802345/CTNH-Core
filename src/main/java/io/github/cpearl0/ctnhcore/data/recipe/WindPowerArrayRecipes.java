package io.github.cpearl0.ctnhcore.data.recipe;

import io.github.cpearl0.ctnhcore.registry.CTNHRecipeTypes;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

public class WindPowerArrayRecipes {
    public static void init(Consumer<FinishedRecipe> provider) {
        CTNHRecipeTypes.WIND_POWER_ARRAY.recipeBuilder("wind_power").circuitMeta(0)
                .duration(20)
                .EUt(-32)
                .save(provider);
    }
}

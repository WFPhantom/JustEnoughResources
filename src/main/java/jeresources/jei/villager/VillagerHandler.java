package jeresources.jei.villager;

import jeresources.entries.VillagerEntry;
import jeresources.jei.JEIConfig;
import mezz.jei.api.recipe.IRecipeHandler;
import mezz.jei.api.recipe.IRecipeWrapper;

import javax.annotation.Nonnull;

public class VillagerHandler implements IRecipeHandler<VillagerEntry>
{
    @Nonnull
    @Override
    public Class<VillagerEntry> getRecipeClass()
    {
        return VillagerEntry.class;
    }

    @Nonnull
    @Override
    public String getRecipeCategoryUid()
    {
        return JEIConfig.VILLAGER;
    }

    @Nonnull
    @Override
    public IRecipeWrapper getRecipeWrapper(@Nonnull VillagerEntry recipe)
    {
        return new VillagerWrapper(recipe);
    }

    @Override
    public boolean isRecipeValid(@Nonnull VillagerEntry recipe)
    {
        return true;
    }
}

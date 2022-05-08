package net.minionflo.baseballbat.Tools;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class IronMaterial implements ToolMaterial{

    public static final IronMaterial INSTANCE = new IronMaterial();

    @Override
    public int getDurability() {
        // TODO Auto-generated method stub
        return 250;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        // TODO Auto-generated method stub
        return 0F;
    }

    @Override
    public float getAttackDamage() {
        // TODO Auto-generated method stub
        return 7.0F;
    }

    @Override
    public int getMiningLevel() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getEnchantability() {
        // TODO Auto-generated method stub
        return 10;
    }

    @Override
    public Ingredient getRepairIngredient() {
        // TODO Auto-generated method stub
        return Ingredient.ofItems(Items.IRON_BLOCK);
    }
    
}

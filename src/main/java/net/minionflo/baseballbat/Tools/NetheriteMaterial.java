package net.minionflo.baseballbat.Tools;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class NetheriteMaterial implements ToolMaterial{

    public static final NetheriteMaterial INSTANCE = new NetheriteMaterial();

    @Override
    public int getDurability() {
        // TODO Auto-generated method stub
        return 2031;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        // TODO Auto-generated method stub
        return 0F;
    }

    @Override
    public float getAttackDamage() {
        // TODO Auto-generated method stub
        return 10.0F;
    }

    @Override
    public int getMiningLevel() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getEnchantability() {
        // TODO Auto-generated method stub
        return 1;
    }

    @Override
    public Ingredient getRepairIngredient() {
        // TODO Auto-generated method stub
        return Ingredient.ofItems(Items.NETHERITE_BLOCK);
    }
    
}

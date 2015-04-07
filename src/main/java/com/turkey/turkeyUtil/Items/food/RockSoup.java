package com.turkey.turkeyUtil.Items.food;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class RockSoup extends TurkeyItemFood
{
	public RockSoup()
	{
		super(4, .25f, false, "Rock_Soup", "rock_soup", 64);
		super.addLore("MMMMM Tasty");
	}

	public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player)
	{
		player.attackEntityFrom(DamageSource.starve, 2.0f);

		if(!world.isRemote)
			player.performHurtAnimation();
		
		player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 600, 0));
		return super.onEaten(stack, world, player);
	}
}
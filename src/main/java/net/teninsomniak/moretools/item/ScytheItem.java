package net.teninsomniak.moretools.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.world.World;

import java.util.List;

public class ScytheItem extends SwordItem {
    public ScytheItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Item.Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
    private float getSweepingDamage(ItemStack stack) {
        return this.getAttackDamage() * 0.5F;
    }
    private void sweepAttack(PlayerEntity player, LivingEntity target, ItemStack stack) {
        World world = player.getWorld();
        double sweepRadius = 7.5D;
        List<Entity> nearbyEntity = world.getOtherEntities(player, target.getBoundingBox().expand(sweepRadius, 0.25D, sweepRadius));
        for (Entity entity : nearbyEntity) {
            LivingEntity livingEntity = (LivingEntity) entity;
            livingEntity.damage(DamageSource.player(player), getSweepingDamage(stack));
            world.addParticle(net.minecraft.particle.ParticleTypes.SWEEP_ATTACK, livingEntity.getX(), livingEntity.getY(), livingEntity.getZ(), 0.0D, 0.0D, 0.0D);
        }
    }
}

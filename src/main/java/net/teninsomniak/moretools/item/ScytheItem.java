package net.teninsomniak.moretools.item;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;

public class ScytheItem extends SwordItem {
    public ScytheItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Item.Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (attacker instanceof PlayerEntity player) {
            float criticalBonus = 1.5f;
            target.damage(DamageSource.player(player), this.getAttackDamage() * criticalBonus);

            World world = player.getWorld();
            world.addParticle(net.minecraft.particle.ParticleTypes.CRIT, target.getX(), target.getY(), target.getZ(), 0.5, 0.5, 0.5);
            world.playSound(null, target.getBlockPos(), net.minecraft.sound.SoundEvents.ENTITY_PLAYER_ATTACK_CRIT, net.minecraft.sound.SoundCategory.PLAYERS, 1.0f, 1.0f);
        }
        return super.postHit(stack, target, attacker);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!stack.hasEnchantments()) {
            stack.addEnchantment(net.minecraft.enchantment.Enchantments.SWEEPING, 3);
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;  // Prevents additional enchantments
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return false;  // Shows the enchantment glint
    }
}

package net.justmili.mixin;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Item.class)
public class SwordBlocking {
    @Inject(method = "use", at = @At("HEAD"), cancellable = true)
    private void use(Level world, Player player, InteractionHand hand, CallbackInfoReturnable<InteractionResultHolder<ItemStack>> cir) {
        if (player.getOffhandItem().getItem() instanceof ShieldItem ||
            player.getMainHandItem().getItem() instanceof ShieldItem) return;

        ItemStack stack = player.getItemInHand(hand);
        if (stack.getItem() instanceof SwordItem) {
            player.startUsingItem(hand);
            cir.setReturnValue(InteractionResultHolder.consume(stack));
        }
    }

    @Inject(method = "getUseAnimation", at = @At("HEAD"), cancellable = true)
    private void getUseAnimation(ItemStack stack, CallbackInfoReturnable<UseAnim> cir) {
        if (stack.getItem() instanceof SwordItem) {
            cir.setReturnValue(UseAnim.BLOCK);
        }
    }

    @Inject(method = "getUseDuration", at = @At("HEAD"), cancellable = true)
    private void getUseDuration(ItemStack stack, LivingEntity livingEntity, CallbackInfoReturnable<Integer> cir) {
        if (stack.getItem() instanceof SwordItem) {
            cir.setReturnValue(72000);
        }
    }
}

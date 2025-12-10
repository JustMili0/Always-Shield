package net.justmili.mixin;

import net.minecraft.world.item.component.Consumable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Consumable.class)
public class NoShieldDelay {
    @Inject(method = "consumeTicks", at = @At("HEAD"), cancellable = true)
    private void removeShieldDelay(CallbackInfoReturnable<Integer> cir) {
        //TODO: find a way to limit this to only ShieldItem
        cir.setReturnValue(0);
    }
}

package net.justmili.mixin;

import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(LivingEntity.class)
public class NoShieldDelay {
    @ModifyConstant(method = { "getBlockingItem" }, constant = { @Constant(intValue = 5) })
    private int removeShieldDelay(int constant) {
        return 0;
    }
}

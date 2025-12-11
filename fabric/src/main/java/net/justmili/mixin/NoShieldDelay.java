package net.justmili.mixin;

import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(LivingEntity.class)
public class NoShieldDelay {
    @ModifyConstant(method = "getItemBlockingWith", constant = @Constant(intValue = 5))
    private int removeShieldDelay(int constant) {
        return 0;
    }
}
package net.diamonddev.iamspeed.mixin;

import net.diamonddev.iamspeed.IAmSpeedMod;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {

	@Shadow public abstract void setNoDrag(boolean noDrag);


	@Inject(at = @At("HEAD"), method = "tick")
	private void iamspeed$tickNoDrag(CallbackInfo info) {
		this.setNoDrag(IAmSpeedMod.DRAG);
	}
}

package net.diamonddev.iamspeed.mixin;

import net.minecraft.server.MinecraftServer;
import net.minecraft.world.GameRules;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import java.util.function.BiConsumer;

@Mixin(GameRules.BooleanRule.class)
public interface BooleanRuleInvoker {
    @Invoker("create")
    static GameRules.Type<GameRules.BooleanRule> invokeCreate(boolean initialValue, BiConsumer<MinecraftServer, GameRules.BooleanRule> changeCallback) {
        throw new AssertionError();
    }
}

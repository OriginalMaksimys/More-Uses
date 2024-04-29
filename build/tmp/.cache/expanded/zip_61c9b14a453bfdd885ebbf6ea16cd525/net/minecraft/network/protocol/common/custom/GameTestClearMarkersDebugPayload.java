package net.minecraft.network.protocol.common.custom;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;

public record GameTestClearMarkersDebugPayload() implements CustomPacketPayload {
    public static final ResourceLocation ID = new ResourceLocation("debug/game_test_clear");

    public GameTestClearMarkersDebugPayload(FriendlyByteBuf p_294413_) {
        this();
    }

    @Override
    public void write(FriendlyByteBuf p_294656_) {
    }

    @Override
    public ResourceLocation id() {
        return ID;
    }
}

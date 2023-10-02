package com.Yuki_Spike.rthaumcraft.tag;

import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.common.util.LazyOptional;

public class PlayerAspectProvider implements ICapabilityProvider, INBTSerializable<CompoundTag> {
    public static Capability<PlayerAspect> PLAYER_ASPECT = CapabilityManager.get(new CapabilityToken<PlayerAspect>() { });

    private PlayerAspect aspect = null;
    private final LazyOptional<PlayerAspect> optional = LazyOptional.of(this::createPlayerAspect);

    private PlayerAspect createPlayerAspect() {
        if(this.aspect == null) {
            this.aspect = new PlayerAspect();
        }
        return this.aspect;
    }

    @Override
    public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
        if(cap == PLAYER_ASPECT) {
            return optional.cast();
        }

        return LazyOptional.empty();
    }

    @Override
    public CompoundTag serializeNBT() {
        CompoundTag nbt = new CompoundTag();
        createPlayerAspect().saveNBTData(nbt);
        return nbt;
    }

    @Override
    public void deserializeNBT(CompoundTag nbt) {
        createPlayerAspect().loadNBTData(nbt);
    }
}
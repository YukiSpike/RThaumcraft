package com.Yuki_Spike.rthaumcraft.tag;

import net.minecraft.nbt.CompoundTag;

public class PlayerAspect {
    private int aspect;
    private final int MIN_ASPECT = 0;
    private final int MAX_ASPECT = 99999;

    public int getAspect() {
        return aspect;
    }

    public void addAspect(int add) {
        this.aspect = Math.min(aspect + add, MAX_ASPECT);
    }

    public void subAspect(int sub) {
        this.aspect = Math.max(aspect - sub, MIN_ASPECT);
    }

    public void copyFrom(PlayerAspect source) {
        this.aspect = source.aspect;
    }

    public void saveNBTData(CompoundTag nbt) {
        nbt.putInt("thirst", aspect);
    }

    public void loadNBTData(CompoundTag nbt) {
        aspect = nbt.getInt("aspect");
    }
}
package com.barentine.api.enums;

public enum ArmType {
    ARM_STAY(1),
    ARM_NIGHT_STAY(4),
    ARM_AWAY(0);

    private final int value;

    ArmType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

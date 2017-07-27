package com.barentine.api.enums;

/*
10200 - Not Armed
10201 - Armed Away
10202 - Armed Away (Bypassed)
10203 - Armed Stay
10204 - Armed Stay (Bypassed)
10218 - Armed Night Stay
10219 - Armed Night Stay (Bypassed)
 */
public enum ArmingState {
    NONE(10200),
    ARMED_AWAY(10201),
    ARMED_AWAY_BYPASS(10202),
    ARMED_STAY(10203),
    ARMED_STAY_BYPASS(10204),
    ARMED_NIGHT_STAY(10218),
    ARMED_NIGHT_STAY_BYPASS(10219);

    private final int value;

    ArmingState(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static ArmingState fromValue(final int value) {

        if(value == NONE.getValue()) {
            return NONE;
        } else if (value == ARMED_AWAY.getValue()) {
            return ARMED_AWAY;
        } else if (value == ARMED_AWAY_BYPASS.getValue()) {
            return ARMED_AWAY_BYPASS;
        } else if (value == ARMED_STAY.getValue()) {
            return ARMED_STAY;
        } else if (value == ARMED_STAY_BYPASS.getValue()) {
            return ARMED_STAY_BYPASS;
        } else if (value == ARMED_NIGHT_STAY.getValue()) {
            return ARMED_NIGHT_STAY;
        } else if (value == ARMED_NIGHT_STAY_BYPASS.getValue()) {
            return ARMED_NIGHT_STAY_BYPASS;
        }

        return null;
    }
}

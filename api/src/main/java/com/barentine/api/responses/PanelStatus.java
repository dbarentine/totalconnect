package com.barentine.api.responses;

import com.barentine.api.enums.ArmingState;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PanelStatus {
    private boolean lowBattery;
    private boolean acLoss;
    private ArmingState armingState;

    @JsonProperty
    public boolean isLowBattery() {
        return lowBattery;
    }

    public PanelStatus setLowBattery(boolean lowBattery) {
        this.lowBattery = lowBattery;
        return this;
    }

    @JsonProperty
    public boolean isAcLoss() {
        return acLoss;
    }

    public PanelStatus setAcLoss(boolean acLoss) {
        this.acLoss = acLoss;
        return this;
    }

    @JsonProperty
    public ArmingState getArmingState() {
        return armingState;
    }

    public PanelStatus setArmingState(ArmingState armingState) {
        this.armingState = armingState;
        return this;
    }
}

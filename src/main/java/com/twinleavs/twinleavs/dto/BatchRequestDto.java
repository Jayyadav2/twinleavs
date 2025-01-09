package com.twinleavs.twinleavs.dto;

import java.time.LocalDate;

public class BatchRequestDto {
    private Integer mrp;
    private Integer sp;
    private Integer purchasePrice;
    private Integer availableQuantity;
    private LocalDate inwardedOn;
    private Long gtinId;

    // Getters and Setters
    public Integer getMrp() {
        return mrp;
    }

    public void setMrp(Integer mrp) {
        this.mrp = mrp;
    }

    public Integer getSp() {
        return sp;
    }

    public void setSp(Integer sp) {
        this.sp = sp;
    }

    public Integer getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Integer purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public LocalDate getInwardedOn() {
        return inwardedOn;
    }

    public void setInwardedOn(LocalDate inwardedOn) {
        this.inwardedOn = inwardedOn;
    }

    public Long getGtinId() {
        return gtinId;
    }

    public void setGtinId(Long gtinId) {
        this.gtinId = gtinId;
    }
}

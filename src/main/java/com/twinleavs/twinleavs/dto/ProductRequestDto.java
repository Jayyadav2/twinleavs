package com.twinleavs.twinleavs.dto;

import java.time.LocalDate;

public class ProductRequestDto {
    private String productName;
    private LocalDate createdOn;

    // Getters and Setters
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
    }
}

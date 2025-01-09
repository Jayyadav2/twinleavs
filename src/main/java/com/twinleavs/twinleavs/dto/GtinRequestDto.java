package com.twinleavs.twinleavs.dto;

public class GtinRequestDto {private String gtin;
    private Long productId;

    // Getters and Setters
    public String getGtin() {
        return gtin;
    }

    public void setGtin(String gtin) {
        this.gtin = gtin;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}

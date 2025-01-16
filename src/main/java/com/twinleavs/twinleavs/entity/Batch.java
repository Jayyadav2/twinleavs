package com.twinleavs.twinleavs.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Setter
@Getter
public class Batch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long batchId;

    private Integer mrp;
    private Integer sp;
    private Integer purchasePrice;
    private Integer availableQuantity;
    private LocalDate inwardedOn;

    @ManyToOne
    @JoinColumn(name = "gtinId")  // Foreign key column referring to Gtin
    private Gtin gtin;  // Reference to the Gtin entity, not a String


    public Gtin getGtin() {
        return gtin;
    }

    public void setGtin(Gtin gtin) {
        this.gtin = gtin;
    }
}


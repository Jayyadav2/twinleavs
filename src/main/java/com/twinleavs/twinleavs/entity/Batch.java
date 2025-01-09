package com.twinleavs.twinleavs.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
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
    private Gtin gtin;


}

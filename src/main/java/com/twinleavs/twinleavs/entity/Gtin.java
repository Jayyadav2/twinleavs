package com.twinleavs.twinleavs.entity;

import jakarta.persistence.*;

@Entity
public class Gtin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String gtin;
    @ManyToOne
    private Product product;
}

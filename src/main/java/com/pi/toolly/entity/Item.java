package com.pi.toolly.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String barcode;

    private String name;

    private Long itemgroup_id;

    private BigDecimal qty;

    private BigDecimal qtyC1;

    private BigDecimal qtyC2;

}

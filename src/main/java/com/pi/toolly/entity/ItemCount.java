package com.pi.toolly.entity;

import org.hibernate.mapping.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "item_count")
public class ItemCount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "total_qty")
    private Double totalQty;

    @Column(name = "total_sell_price")
    private Double totalSellPrice;

    @Column(name = "total_cost_price")
    private Double totalCostPrice;
}

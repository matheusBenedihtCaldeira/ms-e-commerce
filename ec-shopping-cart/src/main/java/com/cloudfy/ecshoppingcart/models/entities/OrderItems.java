package com.cloudfy.ecshoppingcart.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "tb_order_items")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItems implements Serializable {
    private static final long serialVersion = 1L;
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "product_id")
    private Product product;
    private Integer Quantity;
}
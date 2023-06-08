package com.example.Buoi6_Products.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    private Long productId;
    private String productName;
    private Double price;
    private String imageProduct;
    private int quantity;
}
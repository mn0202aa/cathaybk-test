package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "currency_comparison")
public class CurrencyComparisonDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "currency", unique = true)
    private String currency;

    @Column(name = "chinese_name")
    private String chineseName;
}

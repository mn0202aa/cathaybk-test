package com.example.demo.entity.repository;

import com.example.demo.entity.CurrencyComparisonDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyComparisonRepository extends JpaRepository<CurrencyComparisonDo, Long> {

    CurrencyComparisonDo findByCurrency(String currency);
}

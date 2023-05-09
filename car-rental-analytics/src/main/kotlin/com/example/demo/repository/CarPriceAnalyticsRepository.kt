package com.example.demo.repository

import com.example.demo.entity.CarModelPriceEntity
import org.springframework.data.jpa.repository.JpaRepository

interface CarPriceAnalyticsRepository : JpaRepository<CarModelPriceEntity, Long> {
}
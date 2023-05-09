package com.example.demo.repository

import com.example.demo.entity.BrandAnalyticsEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
interface BrandAnalyticsRepository : JpaRepository<BrandAnalyticsEntity, Long> {

    fun findByBrand(brand: String) : Optional<BrandAnalyticsEntity>
}
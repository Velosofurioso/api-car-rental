package com.example.demo.repository

import com.example.demo.entity.CarModelAnalyticsEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
interface CarModelAnalyticsRepository : JpaRepository<CarModelAnalyticsEntity, Long> {

    fun findByModel(model: String) : Optional<CarModelAnalyticsEntity>
}
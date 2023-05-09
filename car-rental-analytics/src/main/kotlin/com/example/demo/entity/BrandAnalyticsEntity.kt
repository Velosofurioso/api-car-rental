package com.example.demo.entity

import jakarta.persistence.Entity
import jakarta.persistence.Table
import jakarta.persistence.Id
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType

@Entity
@Table(name = "brand_analytics")
data class BrandAnalyticsEntity (

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private var id : Long? = null,

    private var brand: String = "",

    private var posts: Long? = null

)
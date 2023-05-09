package com.example.demo.entity

import jakarta.persistence.Entity
import jakarta.persistence.Table
import jakarta.persistence.Id
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType

@Entity
@Table(name = "car_model_price")
data class CarModelPriceEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private var id : Long? = null,

    private var model: String = "",

    private var price: Double? = null

)

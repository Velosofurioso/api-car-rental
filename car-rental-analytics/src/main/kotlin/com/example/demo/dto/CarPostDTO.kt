package com.example.demo.dto

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude
data class CarPostDTO(

    val model: String = "",
    val brand: String = "",
    val price: String = "",
    val description: String = "",
    val engineVersion: String = "",
    val city: String = "",
    val createdDate: String = "",
    val ownerId: Long = 0,
    val ownerName: String = "",
    val ownerType: String = "",
    val contact: String = ""
)

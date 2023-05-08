package com.lvb.studys.kotlin.api.carrental.client

import com.lvb.studys.kotlin.api.carrental.dto.CarPostDTO
import com.lvb.studys.kotlin.api.carrental.dto.OwnerPostDTO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

@Component
class CarPostStoreClient @Autowired constructor(
    private val restTemplate: RestTemplate
) {

    private val USER_STORE_SERVICE_URI = "http://localhost:8080/user"
    private val POST_STORE_SERVICE_URI = "http://localhost:8080/sales"


    fun carForSaleClient(): List<CarPostDTO> {
        val responseEntity = restTemplate.getForEntity("$POST_STORE_SERVICE_URI/cars", Array<CarPostDTO>::class.java)
        return responseEntity.body?.toList() ?: listOf(CarPostDTO())
    }

    fun ownerPostsClient(newUser: OwnerPostDTO): OwnerPostDTO? = restTemplate.postForEntity(USER_STORE_SERVICE_URI, newUser, OwnerPostDTO::class.java).body

    fun changeCarForSaleClient(carPostDTO: CarPostDTO, id: String) = restTemplate.put("$POST_STORE_SERVICE_URI/car/$id", carPostDTO, CarPostDTO::class.java)

    fun deleteCarForSaleClient(id: String) = restTemplate.delete("$POST_STORE_SERVICE_URI/car/$id")

}
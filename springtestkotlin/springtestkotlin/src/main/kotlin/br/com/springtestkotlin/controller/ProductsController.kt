package br.com.springtestkotlin.controller

import br.com.springtestkotlin.entities.Products
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.util.*
import kotlin.collections.ArrayList

@RestController
class ProductsController {
    private val array = arrayListOf(Products(
        UUID.fromString("cd3adda3-b5bc-4182-89ba-fc3ebaf2e8e3"),
        "Camisa",
        103.99
    ),
        Products(
            UUID.fromString("bdb8c379-0ca5-42a7-8213-d289d79cc65e"),
            "Calça",
            149.99
        ),
        Products(
            UUID.fromString("b1ad2be7-40d5-4d8a-be23-f10a12b39943"),
            "Tênis",
            209.99
        ),
        Products(
            UUID.fromString("0a558a19-11a8-45b8-b885-655e7c6d2d06"),
            "Chinelo",
            40.00
        ),
        Products(
            UUID.fromString("f398f4cb-fd75-43fe-954d-a52638b70108"),
            "Boné",
            55.50
        ),
        Products(
            UUID.fromString("92b105cc-7545-4001-8f80-baa87436cb21"),
            "Bermuda",
            70.00
        ),
        Products(
            UUID.fromString("687128af-1807-4e90-a716-9ebe80a433c1"),
            "Meia 10x",
            50.00
        ),
        Products(
            UUID.fromString("d920f913-002d-42fa-a9ea-e6ff4760799a"),
            "Touca",
            25.50
        ))

    @GetMapping("/products")
    fun ping(): ArrayList<Products> {
        return array
    }

    @GetMapping("/products/{productId}")
    fun findProduct(@PathVariable productId: String): Products? {
        val id = UUID.fromString(productId)
        return array.find { it.id == id }
    }
}
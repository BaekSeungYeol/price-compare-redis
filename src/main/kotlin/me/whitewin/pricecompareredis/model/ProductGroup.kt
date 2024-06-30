package me.whitewin.pricecompareredis.model

data class ProductGroup(
    val productGroupId: String, // FPG0001
    val productList: List<Product> // [{d1fc1031-da1c-40da-9cd1-e9fef3f2a336, 25000}, {...}]
)
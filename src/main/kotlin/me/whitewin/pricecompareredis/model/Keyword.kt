package me.whitewin.pricecompareredis.model

data class Keyword(
    val keyword: String, // 유아용품 - 하기스귀저기(FPG0001), A사 딸랑이(FPG0002)
    val productGroupList: List<ProductGroup> // [{"FPG0001", [{d1fc1031-da1c-40da-9cd1-e9fef3f2a336, 25000},, {...}]
)
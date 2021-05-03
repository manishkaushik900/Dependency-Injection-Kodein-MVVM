package com.demo.mvvmkotlin.data.model


data class Quote(
    val quoteText: String,
    val quoteAuthor: String
) {

    override fun toString(): String {
        return "$quoteText- $quoteAuthor"
    }

}
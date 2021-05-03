package com.demo.mvvmkotlin.ui.quotes

import androidx.lifecycle.ViewModel
import com.demo.mvvmkotlin.data.model.Quote
import com.demo.mvvmkotlin.data.repository.QuoteRepository

// QuoteRepository dependency will again be passed in the
// constructor using dependency injection
class QuotesViewModel(private val quoteRepository: QuoteRepository)
    : ViewModel() {

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)

    fun getQuotes() = quoteRepository.getQuotes()
}
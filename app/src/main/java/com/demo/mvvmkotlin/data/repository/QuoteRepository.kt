package com.demo.mvvmkotlin.data.repository

import androidx.lifecycle.LiveData
import com.demo.mvvmkotlin.data.model.Quote

interface QuoteRepository {
    fun addQuote(quote: Quote)
    fun getQuotes(): LiveData<List<Quote>>
}
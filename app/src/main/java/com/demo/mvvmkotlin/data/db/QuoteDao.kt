package com.demo.mvvmkotlin.data.db

import androidx.lifecycle.LiveData
import com.demo.mvvmkotlin.data.model.Quote

interface QuoteDao {
    fun addQuote(quote: Quote)
    fun getQuotes():LiveData<List<Quote>>
}
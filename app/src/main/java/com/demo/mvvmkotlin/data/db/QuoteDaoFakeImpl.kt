package com.demo.mvvmkotlin.data.db

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.demo.mvvmkotlin.data.model.Quote

class QuoteDaoFakeImpl : QuoteDao {

    private val quoteList = mutableListOf<Quote>()

    // MutableLiveData is from the Architecture Components Library
    // LiveData can be observed for changes
    private val quotes = MutableLiveData<List<Quote>>()

    init {
        quotes.value = quoteList
    }

    override fun addQuote(quote: Quote) {
        quoteList.add(quote)
        // After adding a quote to the "database",
        // update the value of MutableLiveData
        // which will notify its active observers
        quotes.value = quoteList
    }

    override fun getQuotes() = quotes as LiveData<List<Quote>>

}
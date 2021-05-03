package com.demo.mvvmkotlin.data.repository

import com.demo.mvvmkotlin.data.db.QuoteDao
import com.demo.mvvmkotlin.data.model.Quote

class QuoteRepositoryImpl(private val quoteDao: QuoteDao)
    : QuoteRepository {
    override fun addQuote(quote: Quote) {
        quoteDao.addQuote(quote)
    }

    override fun getQuotes() = quoteDao.getQuotes()
}
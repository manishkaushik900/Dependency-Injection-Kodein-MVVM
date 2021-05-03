package com.demo.mvvmkotlin.data.db

class DatabaseFakeImpl :Database {
    override val quoteDao: QuoteDao = QuoteDaoFakeImpl()
}
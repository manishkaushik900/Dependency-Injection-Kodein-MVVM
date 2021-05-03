package com.demo.mvvmkotlin

import android.app.Application
import com.demo.mvvmkotlin.data.db.Database
import com.demo.mvvmkotlin.data.db.DatabaseFakeImpl
import com.demo.mvvmkotlin.data.db.QuoteDao
import com.demo.mvvmkotlin.data.repository.QuoteRepository
import com.demo.mvvmkotlin.data.repository.QuoteRepositoryImpl
import com.demo.mvvmkotlin.databinding.ActivityMainBinding.bind
import com.demo.mvvmkotlin.ui.quotes.QuotesViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

class QuotesApplication : Application(), KodeinAware {
    override val kodein = Kodein.lazy {
        bind<Database>() with singleton { DatabaseFakeImpl() }
        bind<QuoteDao>() with singleton { instance<Database>().quoteDao }
        bind<QuoteRepository>() with singleton { QuoteRepositoryImpl(instance()) }
        bind() from provider { QuotesViewModelFactory(instance()) }
    }
}
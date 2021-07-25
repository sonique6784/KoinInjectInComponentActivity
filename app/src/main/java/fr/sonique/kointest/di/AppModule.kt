package fr.sonique.kointest.di

import fr.sonique.kointest.di.toinject.DummyInject
import fr.sonique.kointest.di.toinject.DummyInjectImpl
import org.koin.dsl.module

val appModule = module {

    single<DummyInject> {
        DummyInjectImpl()
    }
}

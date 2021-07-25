package fr.sonique.kointest

import android.app.Application
import fr.sonique.kointest.di.appModule
import org.koin.android.BuildConfig
import org.koin.core.component.KoinComponent
import org.koin.core.logger.Level
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application(), KoinComponent {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            if (BuildConfig.DEBUG) {
                androidLogger(Level.DEBUG)
            }
            androidContext(this@App)
            modules(appModule)
        }
    }
}
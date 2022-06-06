package org.wit.placemark.main

import android.app.Application
import org.wit.placemark.models.PlacemarkStore
import org.wit.placemark.models.PlacemarkMemStore
import timber.log.Timber

class PlacemarkXApp : Application() {

    lateinit var placemarkStore: placemarkStore: PlacemarkStore

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        placemarkStore = PlacemarkMemStore()
        Timber.i("DonationX Application Started")
    }
}
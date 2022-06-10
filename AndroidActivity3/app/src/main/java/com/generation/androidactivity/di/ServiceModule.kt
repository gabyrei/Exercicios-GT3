package com.generation.androidactivity.di

import com.generation.androidactivity.HiltAndroidApp
import com.generation.androidactivity.api.Repository
import com.google.android.material.datepicker.SingleDateSelector


@HiltAndroidApp
@InstallIn(SingletonComponent::class)
object ServiceModule {

  @Singleton
  @Provides

  fun returnRepository(): Repository{
      return Repository()
  }

}


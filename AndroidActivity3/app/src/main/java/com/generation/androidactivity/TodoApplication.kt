package com.generation.androidactivity

import android.app.Application
import com.google.android.material.progressindicator.BaseProgressIndicator

@HiltAndroidApp
class TodoApplication : Application() {
}

annotation class HiltAndroidApp

package com.example.marsphotos

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import com.example.marsphotos.ui.MarsPhotosApp
import com.example.marsphotos.ui.theme.MarsPhotosTheme
import com.example.marsphotos.worker.RefreshMarsWorker

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        val workRequest =
            OneTimeWorkRequestBuilder<RefreshMarsWorker>()
                .build()

        WorkManager.getInstance(applicationContext)
            .enqueue(workRequest)

        Log.d("MainActivity", "WorkManager dijalankan")

        setContent {
            MarsPhotosTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    MarsPhotosApp()
                }
            }
        }
    }
}
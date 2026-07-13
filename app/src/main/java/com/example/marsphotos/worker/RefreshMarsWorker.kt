package com.example.marsphotos.worker

import android.content.Context
import android.util.Log
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters

class RefreshMarsWorker(
    appContext: Context,
    workerParams: WorkerParameters
) : CoroutineWorker(appContext, workerParams) {

    companion object {
        const val TAG = "RefreshMarsWorker"
    }

    override suspend fun doWork(): Result {
        Log.d(TAG, "Worker mulai dijalankan")

        return try {

            // Simulasi proses sinkronisasi
            Thread.sleep(2000)

            Log.d(TAG, "Result.success()")

            Result.success()

        } catch (e: Exception) {

            Log.e(TAG, "Result.failure()", e)

            Result.failure()
        }
    }
}
# Tugas 12 Android - Repository Pattern & WorkManager

## Identitas

- **Nama:** Alan Sutrisno Putra
- **NIM:** 452024611030

---

## Deskripsi

Project ini merupakan implementasi **Repository Pattern** dan **WorkManager** pada aplikasi Mars Photos yang dikembangkan menggunakan Kotlin dan Jetpack Compose.

---

## Fitur

- Menampilkan daftar foto Mars dari REST API.
- Menggunakan **Repository Pattern** sebagai penghubung antara ViewModel dan sumber data.
- Menggunakan **WorkManager** untuk menjalankan background task menggunakan `CoroutineWorker`.
- Worker berhasil dijalankan dan menghasilkan `Result.success()`.

---

## Screenshot Aplikasi

> Tambahkan screenshot aplikasi di sini.

---

## Screenshot Logcat

> Tambahkan screenshot Logcat yang menunjukkan:

```
Worker mulai dijalankan
Result.success()
Worker result SUCCESS
```

---

## Penjelasan Repository Pattern

Repository Pattern digunakan sebagai lapisan abstraksi antara ViewModel dan sumber data. Dengan pola ini, ViewModel tidak perlu mengetahui apakah data berasal dari REST API maupun database lokal. Repository bertugas menyediakan data kepada ViewModel sehingga struktur aplikasi menjadi lebih rapi, mudah dipelihara, dan mudah dikembangkan apabila di masa mendatang aplikasi menggunakan lebih dari satu sumber data, seperti kombinasi Room Database dan Retrofit.

Selain meningkatkan modularitas, Repository Pattern juga memudahkan proses pengujian (testing) karena sumber data dapat diganti menggunakan implementasi lain tanpa mengubah kode pada ViewModel.

---

## WorkManager

WorkManager digunakan untuk menjalankan proses background menggunakan `CoroutineWorker`. Worker dibuat pada kelas `RefreshMarsWorker` dan dijalankan menggunakan `OneTimeWorkRequest`. Hasil eksekusi Worker berhasil ditampilkan pada Logcat dengan status `Result.success()` yang menunjukkan bahwa proses background berhasil dijalankan.

---

## Teknologi

- Kotlin
- Jetpack Compose
- Retrofit
- Repository Pattern
- WorkManager
- CoroutineWorker
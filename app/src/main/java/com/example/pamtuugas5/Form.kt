package com.example.pamtuugas5
import androidx.compose.runtime.*

@Composable
fun FormBiodata() {
    var namaDepan by remember { mutableStateOf("") }
    var namaBelakang by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
}
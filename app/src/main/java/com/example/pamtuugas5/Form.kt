package com.example.pamtuugas5
import androidx.compose.runtime.*

@Composable
fun FormBiodata() {
    var namaDepan by remember { mutableStateOf("") }
    var namaBelakang by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var tglLahir by remember { mutableStateOf("") }
    var experience by remember { mutableStateOf("") }
    var isAndroidSelected by remember { mutableStateOf(false) }
    var isUiUxSelected by remember { mutableStateOf(false) }
    var isWebSelected by remember { mutableStateOf(false) }

    Box(modifier = modifier) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(260.dp)
                .background(colorResource(id = R.color.background_screen))
        ) {
            Image(
                painter = painterResource(id = R.drawable.copland),
                contentDescription = null,
                modifier = Modifier.fillMaxSize()
            )
        }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(top = 190.dp)
                .verticalScroll(rememberScrollState()),
            shape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp),
            colors = CardDefaults.cardColors(
                containerColor = colorResource(id = R.color.background_card)
            ),
            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
        ) {
}
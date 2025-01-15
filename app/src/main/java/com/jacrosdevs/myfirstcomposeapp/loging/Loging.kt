package com.jacrosdevs.myfirstcomposeapp.loging

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(
    widthDp = 50,
    heightDp = 50,
    showBackground = true,
    showSystemUi = true,
    device = Devices.PIXEL_4,
    /**
     * locale=para traducir
     * device Devices.PIXEL_4 para ver comos se ve en ese dsipositvo especifico
     */

    )
@Composable
fun Example(modifier: Modifier = Modifier) {
    Greeting(name = "Android")
}
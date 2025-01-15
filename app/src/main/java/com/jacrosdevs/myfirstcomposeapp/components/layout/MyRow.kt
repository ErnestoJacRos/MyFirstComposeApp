package com.jacrosdevs.myfirstcomposeapp.components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun MyRow(modifier: Modifier = Modifier) {

    Row(
        modifier = modifier.fillMaxSize()
            .horizontalScroll(rememberScrollState())
    ) {
        Text("Hola1", modifier = Modifier.background(Color.Red))
        Text("Hola2", modifier = Modifier.background(Color.Magenta))
        Text("Hola3", modifier = Modifier.background(Color.Blue))
        Text("Hola1", modifier = Modifier.background(Color.Red))
        Text("Hola2", modifier = Modifier.background(Color.Magenta))
        Text("Hola3", modifier = Modifier.background(Color.Blue))
        Text("Hola1", modifier = Modifier.background(Color.Red))
        Text("Hola2", modifier = Modifier.background(Color.Magenta))
        Text("Hola3", modifier = Modifier.background(Color.Blue))
        Text("Hola1", modifier = Modifier.background(Color.Red))
        Text("Hola2", modifier = Modifier.background(Color.Magenta))
        Text("Hola3", modifier = Modifier.background(Color.Blue))

    }
}
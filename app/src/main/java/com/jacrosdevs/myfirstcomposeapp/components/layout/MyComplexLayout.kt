package com.jacrosdevs.myfirstcomposeapp.components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview


@Preview(showBackground = true)
@Composable
fun MyComplexlayout(modifier: Modifier = Modifier) {
    Column {
        Box(modifier = Modifier
            .weight(1f)
            .fillMaxWidth()
            .background(Color.Red)) {}
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Green),
        ) {
            Row() {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .background(Color.DarkGray)
                        .fillMaxHeight()
                ) {
                    //Text("Hola1")
                }
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .background(Color.Blue)
                        .fillMaxHeight()
                ) {
                    //Text("Sara")
                }

            }
        }
        Box(modifier = Modifier
            .weight(1f)
            .fillMaxWidth()
            .background(Color.Cyan)) {}
    }
}
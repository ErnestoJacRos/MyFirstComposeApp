package com.jacrosdevs.myfirstcomposeapp

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true)
@Composable
fun MyTexts(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            text = "Pepe"
        )
        Text(
            text = "Pepe Rojo",
            color = Color.Red
        )
        Text(
            text = "Pepe",
            fontSize = 26.sp
        )

        Text(
            text = "Textstyle",
            fontSize = 26.sp,
            fontStyle = FontStyle.Italic
        )

        Text(
            text = "Font Weight",
            fontWeight = FontWeight.ExtraBold,
            fontSize = 28.sp,
            fontStyle = FontStyle.Italic
        )

        Text(
            text = "Letter Spacing",
            letterSpacing = 20.sp
        )
        
        Text(
            text = "Text Decoration",
            textDecoration = TextDecoration.LineThrough,
            letterSpacing = 20.sp
        )
        Text(
            text = "Text Decoration Two",
            textDecoration = TextDecoration.LineThrough + TextDecoration.Underline,
            fontSize = 36.sp
        )
        var secuencia by rememberSaveable { mutableStateOf(0) }
        Text(

            text = "Da click ve las veces que haz dado click aqui: $secuencia",
            textDecoration = TextDecoration.Underline,
            fontSize = 24.sp,
            color = Color.Blue,
            modifier = Modifier.padding(16.dp)
                .clickable { secuencia++ }
        )

        Text(
            text = "Align Align Align Align Align Align Align Align Align Align Align Align",
            fontSize = 24.sp,
            color = Color.Red,
            modifier = Modifier.fillMaxWidth()
                .background(Color.Blue)
                .padding(16.dp),
            textAlign = TextAlign.Center,
            maxLines = 1, // todo el texto siempre va estar en una linea
            overflow = TextOverflow.Ellipsis //pone puntos suspensivos para indicar que hay mas texto
        )


    }


}
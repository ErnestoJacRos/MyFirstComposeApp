package com.jacrosdevs.myfirstcomposeapp.state

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun MyState(modifier: Modifier = Modifier) {
    //si usamos el rememberSaveable es para que sobreviva el estado a la hora de girar la pantalla
    //tiene que ver con el ciclo de vida de la app
    var number by rememberSaveable { mutableIntStateOf(0) }
    Column(modifier = modifier) {
        StateExample1(number){ number++ }
        StateExample2(  number = number){number ++}
    }

}

@Composable
fun StateExample1(number: Int, onClick: () -> Unit) {

    Text("Pulsame: $number", modifier = Modifier.clickable { onClick() })

}

@Composable
fun StateExample2(number: Int, onClick: () -> Unit) {

    Text("Pulsame: $number", modifier = Modifier.clickable {onClick()})

}
package com.jacrosdevs.myfirstcomposeapp.components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Preview(showBackground = true)
@Composable
fun MyBasicConstraintLayout(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        //creamos varias variables para referenciar a los elementos
        val(boxRed, boxBlue, boxGray, boxCyan, boxGreen) = createRefs()


        Box(modifier = Modifier.size(150.dp).background(Color.Red).constrainAs(boxRed){
            top.linkTo(boxBlue.bottom)
            start.linkTo(boxBlue.end)
        })
        Box(modifier = Modifier.size(150.dp).background(Color.Green).constrainAs(boxGreen){
            top.linkTo(boxBlue.bottom)
            end.linkTo(boxBlue.start)
        })
        Box(modifier = Modifier.size(150.dp).background(Color.Gray).constrainAs(boxGray){
            bottom.linkTo(boxBlue.top)
            start.linkTo(boxBlue.end)
        })
        Box(modifier = Modifier.size(150.dp).background(Color.Cyan).constrainAs(boxCyan){
           bottom.linkTo(boxBlue.top)
            end.linkTo(boxBlue.start)

        })

        Box(modifier = Modifier.size(150.dp).background(Color.Blue).constrainAs(boxBlue){
            bottom.linkTo(parent.bottom)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            start.linkTo(parent.start)
        })
    }
}
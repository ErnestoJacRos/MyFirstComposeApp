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
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout

@Preview(showBackground = true)
@Composable
fun ExerciseConstraint(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (boxRed, boxBlue, boxGray, boxCyan, boxGreen, boxBlack, boxMagenta, boxYellow, boxDarkGray) = createRefs()

        Box(modifier = Modifier
            .size(175.dp)
            .background(Color.DarkGray)
            /**/.constrainAs(boxDarkGray) {
                top.linkTo(boxBlue.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            })  
        Box(modifier = Modifier
            .size(75.dp)
            .background(Color.Red)
            .constrainAs(boxRed) {
                top.linkTo(boxBlue.bottom)
                start.linkTo(boxBlue.end)
            })
        Box(modifier = Modifier
            .size(75.dp)
            .background(Color.Green)
            .constrainAs(boxGreen) {
                top.linkTo(boxBlue.bottom)
                end.linkTo(boxBlue.start)
            })
        Box(modifier = Modifier
            .size(75.dp)
            .background(Color.Gray)
            .constrainAs(boxGray) {
                bottom.linkTo(boxBlue.top)
                start.linkTo(boxBlue.end)
            })
        Box(modifier = Modifier
            .size(75.dp)
            .background(Color.Cyan)
            .constrainAs(boxCyan) {
                bottom.linkTo(boxBlue.top)
                end.linkTo(boxBlue.start)

            })

        Box(modifier = Modifier
            .size(75.dp)
            .background(Color.Blue)
            .constrainAs(boxBlue) {
                bottom.linkTo(parent.bottom)
                end.linkTo(parent.end)
                top.linkTo(parent.top)
                start.linkTo(parent.start)
            })

        Box(modifier = Modifier
            .size(175.dp)
            .background(Color.Black)
            .constrainAs(boxBlack) {
                bottom.linkTo(boxCyan.top)
                end.linkTo(boxCyan.end)
            })

        Box(modifier = Modifier
            .size(175.dp)
            .background(Color.Yellow)
            .constrainAs(boxYellow) {
                bottom.linkTo(boxGray.top)
                start.linkTo(boxGray.start)
            })



        Box(modifier = Modifier
            .size(75.dp)
            .background(Color.Magenta)
            .constrainAs(boxMagenta) {
                start.linkTo(boxBlack.end)
                bottom.linkTo(boxBlack.bottom)
                top.linkTo(boxBlack.top)
            })
    }

}
@Preview(showBackground = true, name = "My View constraint")
@Composable
fun ConstraintExampleGuide(modifier: Modifier = Modifier) {
    ConstraintLayout (Modifier.fillMaxSize()){
        //Solo sirve en constraint layout
        val boxRedTwo = createRef()
        //el 0.1 representa el 10% de la pantalla
        val topGuide = createGuidelineFromTop(0.1f)

        Box(Modifier
            .size(150.dp)
            .background(Color.Red)
            .constrainAs(boxRedTwo) {
                top.linkTo(topGuide)
            })

    }
}

@Preview(showBackground = true, name = "My View constraint Second")
@Composable
fun ConstraintBarrier(modifier: Modifier = Modifier) {
    ConstraintLayout(Modifier.fillMaxSize()) {
        val (boxRed, boxYellow, boxCyan) = createRefs()
        val barrier = createEndBarrier(boxRed, boxYellow)

        Box(Modifier
            .size(65.dp)
            .background(Color.Red)
            .constrainAs(boxRed) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
            })

        Box(Modifier
            .size(200.dp)
            .background(Color.Yellow)
            .constrainAs(boxYellow) {
                top.linkTo(boxRed.bottom, margin = 40.dp)
                start.linkTo(parent.start, margin = 32.dp)
            })


        Box(Modifier
            .size(70.dp)
            .background(Color.Cyan)
            .constrainAs(boxCyan) {
                start.linkTo(barrier)
            })
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ConstraintChain(modifier: Modifier = Modifier) {
    ConstraintLayout(Modifier.fillMaxSize()) {
        val (boxRed, boxYellow, boxCyan) = createRefs()

        Box(Modifier.size(100.dp).background(Color.Red).constrainAs(boxRed){
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(boxYellow.top)
        })
        Box(Modifier.size(100.dp).background(Color.Yellow).constrainAs(boxYellow){
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(boxRed.bottom )
            bottom.linkTo(boxCyan.top)
        })
        Box(Modifier.size(100.dp).background(Color.Cyan).constrainAs(boxCyan){
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(boxYellow.bottom)
            bottom.linkTo(parent.bottom)
        })

        createVerticalChain(boxCyan, boxYellow, boxRed, chainStyle = ChainStyle.Spread)
    }
}
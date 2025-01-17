package com.jacrosdevs.myfirstcomposeapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showSystemUi = true)
@Composable
fun MyTextFieldParent(modifier: Modifier = Modifier) {
    var user by remember { mutableStateOf("") }
    var value by remember { mutableStateOf("") }
    Column(modifier = modifier) {
        MyTextField(value = user) { user = it }
        MySecondTextField(value = value) { value = it }
        MyAdvanceTextField(value = value) { value = it }
        MyPasswordTextField(value = value) { value = it }
        Spacer(modifier = Modifier.height(20.dp))
        MyOutlinedTextField (value = value) { value = it }
    }
}


@Composable
fun MyTextField(value: String, onValueChange: (String) -> Unit) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        readOnly = value.isEmpty(),
        label = { Text(text = "Write here") }
    )
}

@Composable
fun MySecondTextField(value: String, onValueChange: (String) -> Unit) {
    TextField(
        value = value,
        onValueChange = { onValueChange(it) },
        placeholder = {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .background(Color.Red)
            )
        }
    )
}

@Composable
fun MyAdvanceTextField(value: String, onValueChange: (String) -> Unit) {

    TextField(value = value, onValueChange = {
        if (it.contains("a")) {
            onValueChange(it.replace("a", "4"))

        } else {
            onValueChange(it)
        }
    })

}

@Composable
fun MyPasswordTextField(value: String, onValueChange: (String) -> Unit) {
    var passwordHidden by rememberSaveable { mutableStateOf(true) }
    TextField(
        value = value,
        onValueChange = { onValueChange(it) },
        singleLine = true,
        label = { Text(text = "Introduce tu contrasenha") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        visualTransformation = if (passwordHidden) PasswordVisualTransformation() else VisualTransformation.None,
        trailingIcon = {
            Text(
                text = if (passwordHidden) "Mostrar" else "Ocultar",
                modifier = Modifier.clickable {
                    passwordHidden = !passwordHidden
                }
            )
        }
    )
}

@Composable
fun MyOutlinedTextField(value: String, onValueChange: (String) -> Unit) {
//    OutlinedTextField(
//        value = value,
//        onValueChange = {
//            onValueChange(it)
//        }
//    )
    BasicTextField(value = value, onValueChange = {onValueChange(it)},
        modifier = Modifier.fillMaxWidth().background(Color.Red))
}
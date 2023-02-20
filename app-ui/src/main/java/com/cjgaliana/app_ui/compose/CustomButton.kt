package com.cjgaliana.app_ui.compose

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CustomButton(modifier: Modifier = Modifier, text: String) {
    Button(modifier = modifier, onClick = {
        // no-op
    }) {
        Text(text = text)
    }
}

@Preview
@Composable
fun CustomButtonPreview() {
    CustomButton(text = "Hello from Compose Preview")
}
package com.cjgaliana.app_ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import app.cash.paparazzi.DeviceConfig.Companion.PIXEL_5
import app.cash.paparazzi.Paparazzi
import com.android.ide.common.rendering.api.SessionParams
import com.cjgaliana.app_ui.compose.CustomButton
import org.junit.Rule
import org.junit.Test

class PaparazziTest {
    @get:Rule
    val paparazzi = Paparazzi(
        deviceConfig = PIXEL_5,
        renderingMode = SessionParams.RenderingMode.V_SCROLL,
    )

    @Test
    fun launchComposable() = testContent {
        CustomButton(text = "Hello from paparazzi")
    }

    // Function to render the Composable using the right theme with white background
    private fun testContent(content: @Composable () -> Unit) {
        paparazzi.snapshot {
            Box(Modifier.background(Color.White)) {
                content()
            }
        }
    }
}
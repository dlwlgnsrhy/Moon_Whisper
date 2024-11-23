package com.example.moonwhisperapp.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun MoonWhisperAppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = MaterialTheme.colorScheme.copy(
            primary = PrimaryColor,
            secondary = SecondaryColor,
            background = BackgroundColor
        ),
        typography = AppTypography,
        content = content
    )
}
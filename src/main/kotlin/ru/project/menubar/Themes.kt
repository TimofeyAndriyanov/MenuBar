package ru.project.menubar

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

fun Modifier.styleDefaultItem(): Modifier {
    val modifier = this
        .defaultMinSize(
            minWidth = 150.dp,
            minHeight = 50.dp
        )
        .clip(
            shape = RoundedCornerShape(0.dp)
        )
    return modifier
}

fun Modifier.styleDefaultMenuBar(): Modifier {
    val modifier = this
        .fillMaxWidth()
        .height(50.dp)
        .border(
            width = 1.dp,
            color = Color.Black
        )
    return modifier
}
package ru.project.menubar.styles

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.jetbrains.skia.FontWidth

interface MenuBarStyle {

    fun background(
        menuBar: Color,
        itemMenu: Color
    ): Modifier

    fun itemStyle(
        itemColor: Color
    ): Modifier

    fun border(
        width: Dp,
        shape: Shape,
        color: Color
    ): Modifier

    fun defaultMinSize(
        minWidth: Dp,
        minHeight: Dp
    ): Modifier
}

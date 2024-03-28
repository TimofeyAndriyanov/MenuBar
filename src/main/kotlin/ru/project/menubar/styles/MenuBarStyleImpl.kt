package ru.project.menubar.styles

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp

class MenuBarStyleImpl(
    private val modifier: Modifier = Modifier
): MenuBarStyle {
    override fun background(menuBar: Color, itemMenu: Color): Modifier {
        TODO("Not yet implemented")
    }

    override fun itemStyle(itemColor: Color): Modifier {
        TODO("Not yet implemented")
    }

    override fun border(
        width: Dp,
        shape: Shape,
        color: Color
    ) = modifier.border(
        width = width,
        shape = shape,
        color = color
    )

    override fun defaultMinSize(
        minWidth: Dp,
        minHeight: Dp
    ) = modifier.defaultMinSize(
        minHeight = minHeight,
        minWidth = minWidth
    )

}
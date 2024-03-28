package ru.project.menubar

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.positionInParent
import androidx.compose.ui.layout.positionInRoot
import androidx.compose.ui.layout.positionInWindow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.rememberWindowState

@Composable
fun menuBar(
    modifier: Modifier = Modifier.styleDefaultMenuBar(),
    items: @Composable RowScope.() -> Unit
) {
    Row(
        modifier = modifier,
        content = items
    )
}

@Composable
fun itemMenu(
    title: String,
    modifier: Modifier = Modifier.styleDefaultItem(),
    onClick: () -> Unit
) {
    Button(
        modifier = modifier,
        content = {
            Text(
                text = title,
                style = TextStyle(
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp
                )
            )
        },
        colors = ButtonDefaults.buttonColors(
           backgroundColor = Color.White
        ),
        onClick = onClick
    )
}

@Composable
fun pullOutList(
    items: @Composable ColumnScope.() -> Unit,
    title: String,
    modifier: Modifier = Modifier.styleDefaultItem()
) {
    val mutableExpanded = remember { mutableStateOf(false) }
    val mutableOffSet = remember { mutableStateOf(Offset(0F, 0F)) }

    Button(
        onClick = {
            mutableExpanded.value = true

        },
        content = {
            Text(
                text = title,
                style = TextStyle(
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp
                )
            )
        },
        modifier = modifier.onGloballyPositioned {
            mutableOffSet.value = it.positionInParent()
        },
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.White
        )
    )

    DropdownMenu(
        expanded = mutableExpanded.value,
        onDismissRequest = {
            mutableExpanded.value = false
        },
        content = items,
        offset = DpOffset(
            x = (mutableOffSet.value.x + 10F).dp,
            y = 5.dp
        )
    )
}
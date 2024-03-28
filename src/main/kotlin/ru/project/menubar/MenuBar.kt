package ru.project.menubar

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

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
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.White
        )
    )
    DropdownMenu(
        expanded = mutableExpanded.value,
        onDismissRequest = {
            mutableExpanded.value = false
        },
        content = items
    )
}
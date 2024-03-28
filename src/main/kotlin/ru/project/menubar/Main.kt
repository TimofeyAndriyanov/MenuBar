package ru.project.menubar

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
fun app() {
    Column {
        menuBar(
            items = {
                pullOutList(
                    title = "Файлы",
                    items = {
                        itemMenu(
                            title = "Создать",
                            onClick = {

                            }
                        )
                        itemMenu(
                            title = "Открыть",
                            onClick = {

                            }
                        )
                        itemMenu(
                            title = "Сохранить",
                            onClick = {

                            }
                        )
                        itemMenu(
                            title = "Сохранить как",
                            onClick = {

                            }
                        )
                        itemMenu(
                            title = "Параметры",
                            onClick = {

                            }
                        )
                        itemMenu(
                            title = "Выйти",
                            onClick = {

                            }
                        )
                    }
                )
                pullOutList(
                    title = "Вид",
                    items = {
                        itemMenu(
                            title = "item 1",
                            onClick = {

                            }
                        )
                        itemMenu(
                            title = "item 2",
                            onClick = {

                            }
                        )
                    }
                )
            }
        )
    }
}

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "MenuBar",
        content = {
            app()
        },
    )
}

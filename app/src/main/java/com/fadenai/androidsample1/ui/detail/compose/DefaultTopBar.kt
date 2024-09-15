package com.fadenai.androidsample1.ui.detail.compose

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.fadenai.androidsample1.ui.theme.AppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DefaultTopBar(
    title: String,
    back: (() -> Unit)? = null
) {
    TopAppBar(
        title = { Text(text = title) },
        navigationIcon = {
            if (back != null) {
                IconButton(onClick = { back.invoke() }) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Back button"
                    )
                }
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
private fun PreviewDefaultTopBar() {
    AppTheme {
        DefaultTopBar(title = "Title") {}
    }
}
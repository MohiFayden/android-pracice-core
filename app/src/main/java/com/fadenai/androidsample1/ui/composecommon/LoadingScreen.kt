package com.fadenai.androidsample1.ui.composecommon

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fadenai.androidsample1.ui.theme.AppTheme

@Composable
fun LoadingProgress(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxWidth(),
        contentAlignment = Alignment.TopCenter
    ) {
        CircularProgressIndicator()
    }
}

@Composable
fun LoadingProgressFullScreen(modifier: Modifier = Modifier) {

    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        CircularProgressIndicator()
    }
}

//----------------- Preview ------------

@Preview(showBackground = true)
@Composable
private fun PreviewLoadingProgress() {
    AppTheme {
        LoadingProgress(
            modifier = Modifier.padding(vertical = 16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewLoadingProgressFullScreen() {
    AppTheme {
        LoadingProgressFullScreen()
    }
}
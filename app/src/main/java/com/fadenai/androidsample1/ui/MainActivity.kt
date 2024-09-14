package com.fadenai.androidsample1.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.fadenai.androidsample1.ui.home.HomeScreen
import com.fadenai.androidsample1.ui.theme.AppTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            AppTheme {
                HomeScreen()
            }
        }
    }
}
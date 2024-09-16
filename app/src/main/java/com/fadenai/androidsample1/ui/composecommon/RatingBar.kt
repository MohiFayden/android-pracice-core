package com.fadenai.androidsample1.ui.composecommon

import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.fadenai.androidsample1.ui.theme.AppTheme

@Composable
fun RatingBar(
    modifier: Modifier = Modifier,
    rating: Double
) {
    Row(
        modifier = modifier
    ) {
        (1..5).forEach { step ->
            val fill = step <= rating.toInt()
            Icon(
                imageVector = Icons.Filled.Star,
                contentDescription = "Rating bar",
                tint = if (fill) Color(0xFFFFD700) else Color.LightGray
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewRatingBar(){
    AppTheme {
        RatingBar(
            modifier = Modifier,
            rating = 4.0
        )
    }
}
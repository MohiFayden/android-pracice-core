package com.fadenai.androidsample1.ui.home.compose

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.fadenai.androidsample1.data.entity.CourseEntity
import com.fadenai.androidsample1.data.mock.mockCourseListEntity
import com.fadenai.androidsample1.ui.theme.AppTheme

@Composable
fun HomeScreenContent(
    courseList: List<CourseEntity>
) {

    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {

        items(courseList) { item ->
            Text(
                text = item.title
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewHomeScreenContent() {
    AppTheme {
        HomeScreenContent(courseList = mockCourseListEntity)
    }
}
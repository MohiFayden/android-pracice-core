package com.fadenai.androidsample1.data.mock

import com.fadenai.androidsample1.data.entity.CourseEntity
import com.fadenai.androidsample1.data.network.CourseJM

/**
 * Warning: mockCourseListEntity and mockCourseListJM should have the same data and size as they are using in unit tests.
 */
val mockCourseListEntity: List<CourseEntity> = listOf(
    CourseEntity(
        id = 1,
        title = "Introduction to Machine Learning",
        img = "https://picsum.photos/200/300",
        category = "Data Science",
        instructor = "Andrew Ng",
        rating = 4.8,
        numRatings = 12500,
        enrollment = 150000,
        duration = 12,
        tags = listOf("Machine Learning", "AI", "Data Science")
    ),
    CourseEntity(
        id = 2,
        title = "Data Structures and Algorithms",
        img = "https://picsum.photos/200/300",
        category = "Computer Science",
        instructor = "Robert Sedgewick",
        rating = 4.7,
        numRatings = 9800,
        enrollment = 90000,
        duration = 10,
        tags = listOf("Algorithms", "Data Structures", "Programming")
    )
)

val mockCourseListJM: List<CourseJM> = listOf(
    CourseJM(
        id = 1,
        title = "Introduction to Machine Learning",
        img = "https://picsum.photos/200/300",
        category = "Data Science",
        instructor = "Andrew Ng",
        rating = 4.8,
        numRatings = 12500,
        enrollment = 150000,
        duration = 12,
        tags = listOf("Machine Learning", "AI", "Data Science")
    ),
    CourseJM(
        id = 2,
        title = "Data Structures and Algorithms",
        img = "https://picsum.photos/200/300",
        category = "Computer Science",
        instructor = "Robert Sedgewick",
        rating = 4.7,
        numRatings = 9800,
        enrollment = 90000,
        duration = 10,
        tags = listOf("Algorithms", "Data Structures", "Programming")
    )
)

const val mockCourseListJson = """
    [
  {
    "id": 1,
    "title": "Introduction to Machine Learning",
    "category": "Data Science",
    "img": "https://picsum.photos/200/300",
    "instructor": "Andrew Ng",
    "rating": 4.8,
    "numRatings": 12500,
    "enrollment": 150000,
    "duration": 12,
    "tags": ["Machine Learning", "AI", "Data Science"]
  },
  {
    "id": 2,
    "title": "Data Structures and Algorithms",
    "category": "Computer Science",
    "img": "https://picsum.photos/200/300",
    "instructor": "Robert Sedgewick",
    "rating": 4.7,
    "numRatings": 9800,
    "enrollment": 90000,
    "duration": 10,
    "tags": ["Algorithms", "Data Structures", "Programming"]
  },
  {
    "id": 3,
    "title": "Web Development Bootcamp",
    "category": "Web Development",
    "img": "https://picsum.photos/200/300",
    "instructor": "Angela Yu",
    "rating": 4.6,
    "numRatings": 15000,
    "enrollment": 200000,
    "duration": 14,
    "tags": ["HTML", "CSS", "JavaScript"]
  },
  {
    "id": 4,
    "title": "Deep Learning Specialization",
    "category": "Data Science",
    "img": "https://picsum.photos/200/300",
    "instructor": "Andrew Ng",
    "rating": 4.9,
    "numRatings": 20000,
    "enrollment": 250000,
    "duration": 16,
    "tags": ["Deep Learning", "Neural Networks", "AI"]
  },
  {
    "id": 5,
    "title": "Android App Development",
    "category": "Mobile Development",
    "img": "https://picsum.photos/200/300",
    "instructor": "Philipp Lackner",
    "rating": 4.7,
    "numRatings": 5000,
    "enrollment": 75000,
    "duration": 8,
    "tags": ["Android", "Kotlin", "Jetpack Compose"]
  },
  {
    "id": 6,
    "title": "Introduction to Psychology",
    "category": "Humanities",
    "img": "https://picsum.photos/200/300",
    "instructor": "Paul Bloom",
    "rating": 4.5,
    "numRatings": 8000,
    "enrollment": 100000,
    "duration": 6,
    "tags": ["Psychology", "Behavior", "Mind"]
  },
  {
    "id": 7,
    "title": "Financial Markets",
    "category": "Finance",
    "img": "https://picsum.photos/200/300",
    "instructor": "Robert Shiller",
    "rating": 4.6,
    "numRatings": 7000,
    "enrollment": 85000,
    "duration": 7,
    "tags": ["Finance", "Economics", "Investment"]
  },
  {
    "id": 8,
    "title": "The Science of Well-Being",
    "category": "Personal Development",
    "img": "https://picsum.photos/200/300",
    "instructor": "Laurie Santos",
    "rating": 4.8,
    "numRatings": 16000,
    "enrollment": 300000,
    "duration": 10,
    "tags": ["Happiness", "Well-Being", "Psychology"]
  },
  {
    "id": 9,
    "title": "Cloud Computing Basics",
    "category": "Information Technology",
    "img": "https://picsum.photos/200/300",
    "instructor": "Vivek Sriram",
    "rating": 4.4,
    "numRatings": 4500,
    "enrollment": 60000,
    "duration": 5,
    "tags": ["Cloud Computing", "AWS", "Azure"]
  },
  {
    "id": 10,
    "title": "Graphic Design Masterclass",
    "img": "https://picsum.photos/200/300",
    "category": "Design",
    "instructor": "Lindsay Marsh",
    "rating": 4.6,
    "numRatings": 6000,
    "enrollment": 70000,
    "duration": 9,
    "tags": ["Graphic Design", "Photoshop", "Illustrator"]
  }
]
"""
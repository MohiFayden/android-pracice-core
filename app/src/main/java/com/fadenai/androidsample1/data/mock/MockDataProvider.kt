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
        rating = 3.7,
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
        rating = 3.7,
        numRatings = 9800,
        enrollment = 90000,
        duration = 10,
        tags = listOf("Algorithms", "Data Structures", "Programming")
    )
)

val mockCompleteListEntity = listOf(
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
    ),
    CourseEntity(
        id = 3,
        title = "Web Development Bootcamp",
        img = "https://picsum.photos/200/300",
        category = "Web Development",
        instructor = "Angela Yu",
        rating = 4.6,
        numRatings = 15000,
        enrollment = 200000,
        duration = 14,
        tags = listOf("HTML", "CSS", "JavaScript")
    ),
    CourseEntity(
        id = 4,
        title = "Deep Learning Specialization",
        img = "https://picsum.photos/200/300",
        category = "Data Science",
        instructor = "Andrew Ng",
        rating = 4.9,
        numRatings = 20000,
        enrollment = 250000,
        duration = 16,
        tags = listOf("Deep Learning", "Neural Networks", "AI")
    ),
    CourseEntity(
        id = 5,
        title = "Android App Development",
        img = "https://picsum.photos/200/300",
        category = "Mobile Development",
        instructor = "Philipp Lackner",
        rating = 4.7,
        numRatings = 5000,
        enrollment = 75000,
        duration = 8,
        tags = listOf("Android", "Kotlin", "Jetpack Compose")
    ),
    CourseEntity(
        id = 6,
        title = "Introduction to Psychology",
        img = "https://picsum.photos/200/300",
        category = "Humanities",
        instructor = "Paul Bloom",
        rating = 4.5,
        numRatings = 8000,
        enrollment = 100000,
        duration = 6,
        tags = listOf("Psychology", "Behavior", "Mind")
    ),
    CourseEntity(
        id = 7,
        title = "Financial Markets",
        img = "https://picsum.photos/200/300",
        category = "Finance",
        instructor = "Robert Shiller",
        rating = 4.6,
        numRatings = 7000,
        enrollment = 85000,
        duration = 7,
        tags = listOf("Finance", "Economics", "Investment")
    ),
    CourseEntity(
        id = 8,
        title = "The Science of Well-Being",
        img = "https://picsum.photos/200/300",
        category = "Personal Development",
        instructor = "Laurie Santos",
        rating = 4.8,
        numRatings = 16000,
        enrollment = 300000,
        duration = 10,
        tags = listOf("Happiness", "Well-Being", "Psychology")
    ),
    CourseEntity(
        id = 9,
        title = "Cloud Computing Basics",
        img = "https://picsum.photos/200/300",
        category = "Information Technology",
        instructor = "Vivek Sriram",
        rating = 4.4,
        numRatings = 4500,
        enrollment = 60000,
        duration = 5,
        tags = listOf("Cloud Computing", "AWS", "Azure")
    ),
    CourseEntity(
        id = 10,
        title = "Graphic Design Masterclass",
        img = "https://picsum.photos/200/300",
        category = "Design",
        instructor = "Lindsay Marsh",
        rating = 4.6,
        numRatings = 6000,
        enrollment = 70000,
        duration = 9,
        tags = listOf("Graphic Design", "Photoshop", "Illustrator")
    ),
    CourseEntity(
        id = 11,
        title = "Introduction to Blockchain",
        img = "https://picsum.photos/200/300",
        category = "Cryptography",
        instructor = "Daniel Krawisz",
        rating = 4.3,
        numRatings = 3000,
        enrollment = 50000,
        duration = 6,
        tags = listOf("Blockchain", "Cryptography", "Bitcoin")
    ),
    CourseEntity(
        id = 12,
        title = "Game Development with Unity",
        img = "https://picsum.photos/200/300",
        category = "Game Development",
        instructor = "Rick Davidson",
        rating = 4.2,
        numRatings = 4500,
        enrollment = 60000,
        duration = 12,
        tags = listOf("Unity", "C#", "Game Development")
    ),
    CourseEntity(
        id = 13,
        title = "Advanced React",
        img = "https://picsum.photos/200/300",
        category = "Web Development",
        instructor = "Maximilian Schwarzmüller",
        rating = 3.5,
        numRatings = 4000,
        enrollment = 80000,
        duration = 8,
        tags = listOf("React", "JavaScript", "Web Development")
    ),
    CourseEntity(
        id = 14,
        title = "AWS Certified Solutions Architect",
        img = "https://picsum.photos/200/300",
        category = "Cloud Computing",
        instructor = "Adrian Cantrill",
        rating = 4.8,
        numRatings = 15000,
        enrollment = 120000,
        duration = 14,
        tags = listOf("AWS", "Cloud", "Certification")
    ),
    CourseEntity(
        id = 15,
        title = "Cybersecurity Essentials",
        img = "https://picsum.photos/200/300",
        category = "Information Technology",
        instructor = "Chuck Easttom",
        rating = 4.1,
        numRatings = 4000,
        enrollment = 50000,
        duration = 10,
        tags = listOf("Cybersecurity", "Network Security", "Ethical Hacking")
    ),
    CourseEntity(
        id = 16,
        title = "Introduction to Guitar",
        img = "https://picsum.photos/200/300",
        category = "Music",
        instructor = "Justin Guitar",
        rating = 3.9,
        numRatings = 3500,
        enrollment = 40000,
        duration = 7,
        tags = listOf("Guitar", "Music", "Beginner")
    ),
    CourseEntity(
        id = 17,
        title = "Digital Marketing Mastery",
        img = "https://picsum.photos/200/300",
        category = "Marketing",
        instructor = "Seth Godin",
        rating = 4.7,
        numRatings = 12000,
        enrollment = 95000,
        duration = 9,
        tags = listOf("Digital Marketing", "SEO", "Branding")
    ),
    CourseEntity(
        id = 18,
        title = "Photography for Beginners",
        img = "https://picsum.photos/200/300",
        category = "Photography",
        instructor = "John Greengo",
        rating = 3.7,
        numRatings = 2500,
        enrollment = 30000,
        duration = 5,
        tags = listOf("Photography", "Camera", "Lighting")
    ),
    CourseEntity(
        id = 19,
        title = "Excel for Data Analysis",
        img = "https://picsum.photos/200/300",
        category = "Data Science",
        instructor = "Leila Gharani",
        rating = 4.5,
        numRatings = 5000,
        enrollment = 70000,
        duration = 6,
        tags = listOf("Excel", "Data Analysis", "Spreadsheet")
    ),
    CourseEntity(
        id = 20,
        title = "Public Speaking Essentials",
        img = "https://picsum.photos/200/300",
        category = "Personal Development",
        instructor = "Chris Anderson",
        rating = 4.2,
        numRatings = 4500,
        enrollment = 55000,
        duration = 6,
        tags = listOf("Public Speaking", "Communication", "Confidence")
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
    "category": "Design",
    "img": "https://picsum.photos/200/300",
    "instructor": "Lindsay Marsh",
    "rating": 4.6,
    "numRatings": 6000,
    "enrollment": 70000,
    "duration": 9,
    "tags": ["Graphic Design", "Photoshop", "Illustrator"]
  },
  {
    "id": 11,
    "title": "Introduction to Blockchain",
    "category": "Cryptography",
    "img": "https://picsum.photos/200/300",
    "instructor": "Daniel Krawisz",
    "rating": 4.3,
    "numRatings": 3000,
    "enrollment": 50000,
    "duration": 6,
    "tags": ["Blockchain", "Cryptography", "Bitcoin"]
  },
  {
    "id": 12,
    "title": "Game Development with Unity",
    "category": "Game Development",
    "img": "https://picsum.photos/200/300",
    "instructor": "Rick Davidson",
    "rating": 4.2,
    "numRatings": 4500,
    "enrollment": 60000,
    "duration": 12,
    "tags": ["Unity", "C#", "Game Development"]
  },
  {
    "id": 13,
    "title": "Advanced React",
    "category": "Web Development",
    "img": "https://picsum.photos/200/300",
    "instructor": "Maximilian Schwarzmüller",
    "rating": 3.5,
    "numRatings": 4000,
    "enrollment": 80000,
    "duration": 8,
    "tags": ["React", "JavaScript", "Web Development"]
  },
  {
    "id": 14,
    "title": "AWS Certified Solutions Architect",
    "category": "Cloud Computing",
    "img": "https://picsum.photos/200/300",
    "instructor": "Adrian Cantrill",
    "rating": 4.8,
    "numRatings": 15000,
    "enrollment": 120000,
    "duration": 14,
    "tags": ["AWS", "Cloud", "Certification"]
  },
  {
    "id": 15,
    "title": "Cybersecurity Essentials",
    "category": "Information Technology",
    "img": "https://picsum.photos/200/300",
    "instructor": "Chuck Easttom",
    "rating": 4.1,
    "numRatings": 4000,
    "enrollment": 50000,
    "duration": 10,
    "tags": ["Cybersecurity", "Network Security", "Ethical Hacking"]
  },
  {
    "id": 16,
    "title": "Introduction to Guitar",
    "category": "Music",
    "img": "https://picsum.photos/200/300",
    "instructor": "Justin Guitar",
    "rating": 3.9,
    "numRatings": 3500,
    "enrollment": 40000,
    "duration": 7,
    "tags": ["Guitar", "Music", "Beginner"]
  },
  {
    "id": 17,
    "title": "Digital Marketing Mastery",
    "category": "Marketing",
    "img": "https://picsum.photos/200/300",
    "instructor": "Seth Godin",
    "rating": 4.7,
    "numRatings": 12000,
    "enrollment": 95000,
    "duration": 9,
    "tags": ["Digital Marketing", "SEO", "Branding"]
  },
  {
    "id": 18,
    "title": "Photography for Beginners",
    "category": "Photography",
    "img": "https://picsum.photos/200/300",
    "instructor": "John Greengo",
    "rating": 3.7,
    "numRatings": 2500,
    "enrollment": 30000,
    "duration": 5,
    "tags": ["Photography", "Camera", "Lighting"]
  },
  {
    "id": 19,
    "title": "Excel for Data Analysis",
    "category": "Data Science",
    "img": "https://picsum.photos/200/300",
    "instructor": "Leila Gharani",
    "rating": 4.5,
    "numRatings": 5000,
    "enrollment": 70000,
    "duration": 6,
    "tags": ["Excel", "Data Analysis", "Spreadsheet"]
  },
  {
    "id": 20,
    "title": "Public Speaking Essentials",
    "category": "Personal Development",
    "img": "https://picsum.photos/200/300",
    "instructor": "Chris Anderson",
    "rating": 4.2,
    "numRatings": 4500,
    "enrollment": 55000,
    "duration": 6,
    "tags": ["Public Speaking", "Communication", "Confidence"]
  }
]
"""
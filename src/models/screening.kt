package models

data class Screening(
    val id: Int,
    val filmId: Int,
    val date: String,
    val time: String,
    val screenNumber: Int
)
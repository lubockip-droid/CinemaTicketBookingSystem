package models

data class Booking(
    val id: Int,
    val userId: Int,
    val screeningId: Int,
    val numberOfTickets: Int
)
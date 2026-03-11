README

# Cinema Ticket Booking System 

This project is an Object-Oriented Programming (OOP) assessment: designing and implementing a simple cinema ticket booking system in Kotlin.  
The system allows users to browse films, view screenings, manage bookings, and apply special offers.

---

## Project Structure

The repository uses a **feature-branch workflow** to support collaboration between three students:

- **main** → Stable, integrated version of the project
- **feature/part-a** → Part A (Piotr)
- **feature/part-b** → Part B (Janesz)
- **feature/part-c** → Part C (Milen)

Each of us works only on our assigned branch and then we submit a Pull Request when our parts are complete.

---

##  Collaboration initial tasks

### 1. **Fork this repository**
Milen and Janesz: please fork the repo to your own GitHub account.

### 2. **Clone your fork**
```bash
git clone <your-fork-url>
```
##  Part A : workflow initial tasks
### 1. Creating the structure
1.1 — Inside src, create three new folders:
- models
- services
- utilities
  
1.2 — Inside models.kt create data models:
* film, 
* screening,
* user
* booking

1.3 — Fill each data models with basic classes:

* film:
  data class Film(
  val id: Int,
  val title: String,
  val genre: String,
  val durationMinutes: Int
  )
data class Film with a unique ID, title, genre and duration

* screening:data class Screening(
  val id: Int,
  val filmId: Int,
  val date: String,
  val time: String,
  val screenNumber: Int
  )
  data class Screening with: film id, date, time and screenNumber
Attention: there is id in film.kt but film id in screening.kt - A film doesn’t need to know which screenings exist.
A Screening must know which film it belongs to (a one‑to‑many relationship One Film  →  Many Screenings
) direction of the link is:Screening → Film eg: Film(id = 1, title = "Avatar", ...)
and Screening(id = 10, filmId = 1, date = "2026-03-11", time = "18:00", screenNumber = 2) so filmId = 1 means: “This screening is showing the film with ID 1.” 
 
* user:data class User(
  val id: Int,
  val name: String,
  val email: String
  ) data class User with unique user id, name and email.

* booking: data class Booking(
  val id: Int,
  val userId: Int,
  val screeningId: Int,
  val numberOfTickets: Int
  )

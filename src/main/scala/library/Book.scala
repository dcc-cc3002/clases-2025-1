package library

import java.time.LocalDate

class Book(
  override val title: String, 
  override val releaseDate: LocalDate
) extends Item

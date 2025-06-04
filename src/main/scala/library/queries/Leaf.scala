package library.queries
import library.{Item, Library}

import java.time.LocalDate

class NameEq(name: String) extends Query {
  override def execute(library: Library): List[Item] =
    library.items.filter(_.title == name)
}

class Released(date: LocalDate) extends Query {
  override def execute(library: Library): List[Item] =
    library.items.filter(_.releaseDate == date)
}

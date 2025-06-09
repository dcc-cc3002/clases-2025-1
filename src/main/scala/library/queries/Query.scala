package library.queries

import library.{Item, Library}

trait Query {
  def execute(library: Library): List[Item]
}

package com.rRickson
package approaches.elegantObject.dto.person

class Main {
  def main(): Unit = {
    //    Entity response
    val person1 = PersonEntity("1", "Alice", "Active")
    val person2 = PersonEntity("2", "Bob", "Blocked")

    val person = new Person(person1)

    print(person.canLogin)

  }
}

package com.rRickson
package approaches.elegantObject.raw.person

import com.rRickson.approaches.elegantObject.traits.{Active, Blocked}

class main {

  def main(): Unit = {
    val person1 = new User("Alice", new Active)
    val person2 = new User("Bob", new Blocked)

    println(person1.canLogin)
    println(person2.canLogin)
  }
}

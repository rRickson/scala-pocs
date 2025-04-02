package com.rRickson
package approaches.elegantObject.raw.person

import com.rRickson.approaches.elegantObject.traits.{Active, Blocked}

class main {

  def main(): Unit = {
    val card1 = new User("Alice", new Active)
    val card2 = new User("Bob", new Blocked)

    println(card1.canLogin)
    println(card2.canLogin)
  }
}

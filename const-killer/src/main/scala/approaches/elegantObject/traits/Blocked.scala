package com.rRickson
package approaches.elegantObject.traits

final class Blocked extends Status {
  override def value(): String = "blocked"

  override def canEnter: Boolean = true
}
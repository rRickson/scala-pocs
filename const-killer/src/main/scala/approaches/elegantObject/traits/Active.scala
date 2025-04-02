package com.rRickson
package approaches.elegantObject.traits

final class Active extends Status {
  override def value(): String = "active"

  override def canEnter: Boolean = true
}
package com.rRickson
package approaches.elegantObject.traits

final class Inactive extends Status {
  override def value(): String = "expired"

  override def canEnter: Boolean = false
}
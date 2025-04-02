package com.rRickson
package approaches.elegantObject.raw.person

import com.rRickson.approaches.elegantObject.traits.Status

final class User (
  private val name: String,
  private val status: Status
) {
  def canLogin: Boolean = status.canEnter
  def currentStatus(): String = status.value()
  override def toString: String =
    s"User(name=$name,  status=${status.value()})"
}

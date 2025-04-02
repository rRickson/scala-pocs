package com.rRickson
package approaches.elegantObject.dto.person

import approaches.elegantObject.traits.{Status,Active,Blocked,Inactive}

final class Person(private val entity: PersonEntity) {
  private val statusObj: Status = entity.status match {
    case "active"  => new Active
    case "blocked" => new Blocked
    case "inactive" => new Inactive
    case other     => throw new IllegalArgumentException(s"Unknown status: $other")
  }

  def canLogin: Boolean = statusObj.canEnter
  def currentStatus(): String = statusObj.value()

  def toEntity: PersonEntity = entity
}
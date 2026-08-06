package net.scalax.simple.append.support
package collectioncount22
package typeparameter22

sealed trait NatList
case class Successor[A, B <: NatList](head: A, tail: B) extends NatList
case object NatZero                                     extends NatList

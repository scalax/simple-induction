package net.scalax.simple.append.support

sealed trait NatList
case class Successor[A, B <: NatList](head: A, tail: B) extends NatList
case object NatZero                                     extends NatList

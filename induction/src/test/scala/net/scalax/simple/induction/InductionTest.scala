package net.scalax.simple.append.support

import org.scalatest._
import flatspec._
import matchers._

class ExampleSpec extends AnyFlatSpec with should.Matchers {

  "Two NatList" should "Merge in a NatList." in {
    val nat1 = Successor(3, Successor("bar", Successor('e', NatZero)))
    val nat2 = Successor("foo", Successor(8L, Successor(7, NatZero)))

    val func = InductionDemo.nextAlias[Char, Int].nextAlias[String, Long].nextAlias[Int, String]

    val nat3         = func.current(nat1, nat2)
    val nat3Compaare = Successor(3 -> "foo", Successor("bar" -> 8L, Successor('e' -> 7, NatZero)))

    nat3 should be(nat3Compaare)

    nat3.head._1 should be(3)
    nat3.head._2 should be("foo")

    nat3.tail.head._1 should be("bar")
    nat3.tail.head._2 should be(8L)

    nat3.tail.tail.head._1 should be('e')
    nat3.tail.tail.head._2 should be(7)
  }

}

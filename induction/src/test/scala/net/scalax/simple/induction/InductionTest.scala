package net.scalax.simple.append.support
package collectioncount22
package typeparameter22

import org.scalatest._
import flatspec._
import matchers._

class ExampleSpec extends AnyFlatSpec with should.Matchers {

  "Two NatList" should "Merge in a NatList." in {
    val nat1 = Successor(3, Successor("bar", Successor('e', NatZero)))
    val nat2 = Successor("foo", Successor(8L, Successor(7, NatZero)))

    val func = InductionDemo.nextAliaas[Char, Int].nextAliaas[String, Long].nextAliaas[Int, String]

    val nat3         = func.current(nat1, nat2)
    val nat3Compaare = Successor(3 -> "foo", Successor("bar" -> 8L, Successor('e' -> 7, NatZero)))

    nat3 should be(nat3Compaare)
    nat3.tail.head._2 should be(8L)
    nat3.tail.tail.head._1 should be('e')
  }

}

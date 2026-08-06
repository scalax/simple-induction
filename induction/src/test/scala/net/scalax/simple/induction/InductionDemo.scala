package net.scalax.simple.append.support
package collectioncount22
package typeparameter22

import net.scalax.simple.append.support.collectioncount22.typeparameter22.InductionAlias.M22

trait InductionDemo[Z1 <: NatList, Z2 <: NatList, Z3 <: NatList]
    extends SimpleAppender[
      InductionAlias.M22,
      NatList,
      NatList,
      NatList,
      Any,
      Any,
      Any,
      Any,
      Any,
      Any,
      Any,
      Any,
      Any,
      Any,
      Any,
      Any,
      Any,
      Any,
      Any,
      Any,
      Any,
      Any,
      Any,
      InductionAlias.SuccAlias1,
      InductionAlias.SuccAlias2,
      InductionAlias.SuccAlias3,
      InductionAlias.AnySuccAlias,
      InductionAlias.AnySuccAlias,
      InductionAlias.AnySuccAlias,
      InductionAlias.AnySuccAlias,
      InductionAlias.AnySuccAlias,
      InductionAlias.AnySuccAlias,
      InductionAlias.AnySuccAlias,
      InductionAlias.AnySuccAlias,
      InductionAlias.AnySuccAlias,
      InductionAlias.AnySuccAlias,
      InductionAlias.AnySuccAlias,
      InductionAlias.AnySuccAlias,
      InductionAlias.AnySuccAlias,
      InductionAlias.AnySuccAlias,
      InductionAlias.AnySuccAlias,
      InductionAlias.AnySuccAlias,
      InductionAlias.AnySuccAlias,
      InductionAlias.AnySuccAlias,
      InductionAlias.AnySuccAlias,
      Z1,
      Z2,
      Z3,
      Any,
      Any,
      Any,
      Any,
      Any,
      Any,
      Any,
      Any,
      Any,
      Any,
      Any,
      Any,
      Any,
      Any,
      Any,
      Any,
      Any,
      Any,
      Any
    ] { Self =>
  override def next[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
    : InductionDemo[Successor[T1, Z1], Successor[T2, Z2], Successor[(T1, T2), Z3]] =
    new InductionDemo[Successor[T1, Z1], Successor[T2, Z2], Successor[(T1, T2), Z3]] {
      override def current: (Successor[T1, Z1], Successor[T2, Z2]) => Successor[(T1, T2), Z3] = (a, b) =>
        Successor((a.head, b.head), Self.current(a.tail, b.tail))
    }

  def nextAliaas[T1, T2]: InductionDemo[Successor[T1, Z1], Successor[T2, Z2], Successor[(T1, T2), Z3]] =
    Self.next[T1, T2, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any]
}

object InductionDemo extends InductionDemo[NatZero.type, NatZero.type, NatZero.type] {
  override def current: (NatZero.type, NatZero.type) => NatZero.type = (a, b) => a
}

object InductionAlias {
  type M22[
    A1 <: NatList,
    A2 <: NatList,
    A3 <: NatList,
    A4,
    A5,
    A6,
    A7,
    A8,
    A9,
    A10,
    A11,
    A12,
    A13,
    A14,
    A15,
    A16,
    A17,
    A18,
    A19,
    A20,
    A21,
    A22
  ] = (A1, A2) => A3

  type SuccAlias1[
    A1,
    A2,
    A3,
    A4,
    A5,
    A6,
    A7,
    A8,
    A9,
    A10,
    A11,
    A12,
    A13,
    A14,
    A15,
    A16,
    A17,
    A18,
    A19,
    A20,
    A21,
    A22,
    Succ <: NatList
  ] = Successor[A1, Succ]

  type SuccAlias2[
    A1,
    A2,
    A3,
    A4,
    A5,
    A6,
    A7,
    A8,
    A9,
    A10,
    A11,
    A12,
    A13,
    A14,
    A15,
    A16,
    A17,
    A18,
    A19,
    A20,
    A21,
    A22,
    Succ <: NatList
  ] = Successor[A2, Succ]

  type SuccAlias3[
    A1,
    A2,
    A3,
    A4,
    A5,
    A6,
    A7,
    A8,
    A9,
    A10,
    A11,
    A12,
    A13,
    A14,
    A15,
    A16,
    A17,
    A18,
    A19,
    A20,
    A21,
    A22,
    Succ <: NatList
  ] = Successor[(A1, A2), Succ]

  type AnySuccAlias[
    A1,
    A2,
    A3,
    A4,
    A5,
    A6,
    A7,
    A8,
    A9,
    A10,
    A11,
    A12,
    A13,
    A14,
    A15,
    A16,
    A17,
    A18,
    A19,
    A20,
    A21,
    A22,
    Succ <: Any
  ] = Any
}

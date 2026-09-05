package net.scalax.simple.append.support

import net.scalax.simple.append.support.collectioncount7.typeparameter5.SimpleAppender

trait InductionDemo[Z1 <: NatList, Z2 <: NatList, Z3 <: NatList]
    extends SimpleAppender[
      InductionAlias.M22,
      NatList,
      NatList,
      NatList,
      Nothing,
      Nothing,
      Nothing,
      Nothing,
      InductionAlias.SuccAlias1,
      InductionAlias.SuccAlias2,
      InductionAlias.SuccAlias3,
      InductionAlias.AnySuccAlias,
      InductionAlias.AnySuccAlias,
      InductionAlias.AnySuccAlias,
      InductionAlias.AnySuccAlias,
      Z1,
      Z2,
      Z3,
      Nothing,
      Nothing,
      Nothing,
      Nothing
    ] { Self =>
  override final def next[T1, T2, T3, T4, T5]: InductionDemo[Successor[T1, Z1], Successor[T2, Z2], Successor[(T1, T2), Z3]] =
    new InductionDemo[Successor[T1, Z1], Successor[T2, Z2], Successor[(T1, T2), Z3]] {
      override def current: (Successor[T1, Z1], Successor[T2, Z2]) => Successor[(T1, T2), Z3] = (a, b) =>
        Successor((a.head, b.head), Self.current(a.tail, b.tail))
    }

  def nextAlias[T1, T2]: InductionDemo[Successor[T1, Z1], Successor[T2, Z2], Successor[(T1, T2), Z3]] =
    Self.next[
      T1,
      T2,
      Nothing,
      Nothing,
      Nothing
    ]
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
    A7
  ] = (A1, A2) => A3

  type SuccAlias1[
    A1,
    A2,
    A3,
    A4,
    A5,
    Succ <: NatList
  ] = Successor[A1, Succ]

  type SuccAlias2[
    A1,
    A2,
    A3,
    A4,
    A5,
    Succ <: NatList
  ] = Successor[A2, Succ]

  type SuccAlias3[
    A1,
    A2,
    A3,
    A4,
    A5,
    Succ <: NatList
  ] = Successor[(A1, A2), Succ]

  type AnySuccAlias[
    A1,
    A2,
    A3,
    A4,
    A5,
    Succ <: Nothing
  ] = Nothing
}

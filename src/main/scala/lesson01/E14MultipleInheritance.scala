package lesson01

/**
 *
 */

trait A {
  def foo()
}

trait B {
  def foo() {
    println("Hello. I am B")
  }
}

class C extends A {
  override def foo() {
    println("Hello. I am C")
  }
}

class E14MultipleInheritance extends C with B with A {
  override def foo() = {
    super.foo
    super[C].foo
    println("And me! :)")
  }
}

object E14MultipleInheritance extends App {
  val me: E14MultipleInheritance = new E14MultipleInheritance
  me.foo
}

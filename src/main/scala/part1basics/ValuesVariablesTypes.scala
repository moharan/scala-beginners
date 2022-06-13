package part1basics

object ValuesVariablesTypes extends App {
  // VALS ARE IMMUTABLE, COMPILER CAN INFER TYPES
  val x: Int = 42
  println(x)

  val aString: String = "Hello"
  val anotherString: String = "GoodBye"
  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 1234
  val aLong: Long = 1234567899999L
  val aFloat: Float = 2.0F
  val aDouble: Double = 3.14

  // VARIABLES ARE MUTABLE
  var aVariable: Int = 4
  aVariable = 5
}

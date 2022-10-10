package part1basics

object Expressions extends App {

  // expression
  val x = 1 + 2
  println(x)

  // mathematic expression
  println(2+3*4)

  // boolean
  println(1 == x)
  println(!(1== x))

  var aVariable = 2
  aVariable += 3
  println(aVariable)

  // instrucciones (DO) vs expresiones (VALUE)

  // IF
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue) // ()

  // CODE BLOCKS

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

}

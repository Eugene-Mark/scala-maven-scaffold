import org.scalatest.{BeforeAndAfter, FunSuite}

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CalculatorTest extends FunSuite with BeforeAndAfter{
  test("Can add two numbers if it's not over upper limit"){
    val res = Calculator.add(1,2)
    assert(res == 3)
  }
}
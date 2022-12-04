package dayone

import org.scalatest.matchers.must.Matchers
import org.scalatest.wordspec.AnyWordSpec

class DayOneSpec extends AnyWordSpec with Matchers {

  "X must be 2" in {

    val x = 1 + 1

    x mustBe 2

  }

}

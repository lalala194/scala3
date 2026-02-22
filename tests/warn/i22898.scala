package tests.warn.i22898

import java.time.ZoneId
import java.time.ZoneOffset

object Tester {
  val abstractSealedJavaClass: ZoneId = null
  val result = abstractSealedJavaClass match {
    case _: ZoneOffset => () // warn
  }
}

/*******************************************************************************
 * Copyright(c) 2011-1012 Ubeeko
 * All rights reserved.
 *
 * Created: 22/07/12
 * Author: ivan
 ******************************************************************************/
package fr.frain.example

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite
import com.weiglewilczek.slf4s.Logging

@RunWith(classOf[JUnitRunner])
class MainTest extends FunSuite with Logging {

  test("dumb test") {
    logger.debug("Enter dumb test")
    assert(true, "It's allright")
  }

}

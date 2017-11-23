package com.gu.support.workers.model

import scala.collection.mutable.ListBuffer

case class RequestInfo(encrypted: Boolean, testUser: Boolean, failed: Boolean, messages: ListBuffer[String] = ListBuffer.empty) {
  def appendMessage(message: String) = {
    messages += message
    this
  }
}
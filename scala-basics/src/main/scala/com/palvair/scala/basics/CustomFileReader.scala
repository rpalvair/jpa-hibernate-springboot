package com.palvair.scala.basics

import java.io.FileNotFoundException

import scala.io.Source

/**
  * Created by widdy on 22/02/2016.
  */
class CustomFileReader {

  def readFile(fileName: String): Unit = {
    val source: Source = this.getSource(fileName)
    if (source != null) {
      val lines = source.getLines()
      for (line <- lines) {
        println("line = [" + line + "]")
      }
    }
  }

  def getSource(fileName: String): Source = {
    var source: Source = null
    val url = getClass.getClassLoader.getResource(fileName)
    if (url != null) {
      source = Source.fromURL(url)
    } else {
      try {
        source = Source.fromFile(fileName)
      } catch {
        case e: FileNotFoundException => {
          println("exception = " + e.getLocalizedMessage)
        }
      }
    }
    source
  }
}

object CustomFileReader extends App {

  val fileReader = new CustomFileReader
  fileReader.readFile("file.txt")

}



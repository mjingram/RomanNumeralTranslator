package com.skilldistillery.numeraltranslator

import java.util.Scanner

object Main {
  def main(args: Array[String]): Unit = {
    val input = new Scanner(System.in)
    println("Enter a number: ")
    var word: String = input.nextLine()
    println(Main.translateWord(word))
  }

  def translateWord(word: String): String = {
    var num: Int = 0
    try {
      num = word.toInt
    } catch {
      case e: Exception => 0
    }
    val sb = new StringBuilder();

    while (num != 0) {
      if (num >= 1000) {
        sb ++= "M"
        num -= 1000
      }
      else if (num >= 900) {
        sb ++= "CM"
        num -= 900
      }
      else if (num >= 500) {
        sb ++= "D"
        num -= 500
      }
      else if (num >= 400) {
        sb ++= "CD"
        num -= 400
      }
      else if (num >= 100) {
        sb ++= "C"
        num -= 100
      }
      else if (num >= 90) {
        sb ++= "XC"
        num -= 90
      } else if (num >= 50) {
        sb ++= "L"
        num -= 50
      }
      else if (num >= 40) {
        sb ++= "XL"
        num -= 40
      } else if (num >= 10) {
        sb ++= "X"
        num -= 10
      }
      else if (num >= 9) {
        sb ++= "IX"
        num -= 9
      }
      else if (num >= 5) {
        sb ++= "V"
        num -= 5
      }
      else if (num >= 4) {
        sb ++= "IV"
        num -= 4
      }
      else if (num >= 1) {
        sb ++= "I"
        num -= 1
      }


    }
    return sb.toString()
  }

}

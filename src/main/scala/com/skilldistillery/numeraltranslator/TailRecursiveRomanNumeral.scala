package com.skilldistillery.numeraltranslator

import java.util.Scanner
import scala.annotation.tailrec

object TailRecursiveRomanNumeral {
  def main(args: Array[String]): Unit = {
    val input = new Scanner(System.in)
    println("Enter a number: ")
    val word: String = input.nextLine()
    println(s"Roman numeral translation of $word is: ")
    println(TailRecursiveRomanNumeral.translateWord(word))
  }
  def translateWord(word: String): String = {
    var num: Int = 0
    try {
      num = word.toInt
    } catch {
      case e: Exception => 0
    }
    val sb = new StringBuilder()
    val romanNumber = romanNumeral(num, sb)
    romanNumber
  }


  @tailrec
  def romanNumeral(num: Int, sb: StringBuilder): String={
    if(num == 0) sb.toString
    else if (num >= 1000) {
      sb ++= "M"
      romanNumeral((num-1000), sb)
    }
    else if (num >= 900) {
      sb ++= "CM"
      romanNumeral((num-900), sb)
    }
    else if (num >= 500) {
      sb ++= "D"
      romanNumeral((num-500), sb)
    }
    else if (num >= 400) {
      sb ++= "CD"
      romanNumeral((num-400), sb)
    }
    else if (num >= 100) {
      sb ++= "C"
      romanNumeral((num-100), sb)
    }
    else if (num >= 90) {
      sb ++= "XC"
      romanNumeral((num-90), sb)
    } else if (num >= 50) {
      sb ++= "L"
      romanNumeral((num-50), sb)
    }
    else if (num >= 40) {
      sb ++= "XL"
      romanNumeral((num-40), sb)
    }
    else if (num >= 10) {
      sb ++= "X"
      romanNumeral((num-10), sb)
    }
    else if (num >= 9) {
      sb ++= "IX"
      romanNumeral((num-9), sb)
    }
    else if (num >= 5) {
      sb ++= "V"
      romanNumeral((num-5), sb)
    }
    else if (num >= 4) {
      sb ++= "IV"
      romanNumeral((num-4), sb)
    }
    else {
      sb ++= "I"
      romanNumeral((num-1), sb)
    }
  }
}

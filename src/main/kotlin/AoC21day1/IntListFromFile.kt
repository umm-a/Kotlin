package AoC21day1

import java.io.File

class IntListFromFile {
    fun getIntList(pathName: String): List<Int> {
        var list = ArrayList<Int>()
      try {
          File(pathName).forEachLine { list.add(it.toInt()) }
      } catch (e:Exception){
          println("myep, not only numbers in this file!")
      }
      return list
    }
}
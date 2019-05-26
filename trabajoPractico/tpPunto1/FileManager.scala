package tpPunto1

import scala.io.Source
import scala.collection.Map

class AutomataFile(val lines:Array[String]) {
  
  def removeBlank(a: Array[String]): Array[String] = {
    for (i <- 0 to a.length - 1) {
      a(i) = a(i).trim()
    }
    a
  }
  
  def getAlphabet: Array[String] = {
    removeBlank(lines(0).split(","))
  }
  
  def getCantState: Int = {
    lines(1).toInt
  }
  
  def getFinalStates: Array[String] = {
    removeBlank(lines(2).split(","))
  }
  
  def getTransitionFunction: Map[String, Map[String, String]] = {
    /* recursive function to get all transaction functions */
    var transitionFunctions = transitionFunction(3)
    transitionFunctions
  }
  
  def transitionFunction(a: Int, map: Map[String, Map[String, String]] = Map.empty[String, Map[String , String]]): Map[String, Map[String, String]] = {
    if(a < lines.length) {
      val tf = lines(a).split(",")
      
      println(a + " - " + tf)
      
      val initialState = tf(0).trim()
      val transition = tf(1).replace(" ", "").split("->");
      
      println("\tinitialState: " + initialState + " - transition: " + transition)
      
      val imput = transition(0)
      val finalState = transition(1)
      
      println("\t\timput: " + imput + " - finalState: " + finalState)
      
      if((map get initialState).equals(None)){
        val submap = Map(imput -> finalState)
        map + ("initialState" -> submap)
        
        println("\t\t\tsubmap: " + submap)
        println("\t\t\tmap: " + (map get "a").toString())
      }
      else {
        val submap = map.apply(initialState)
        submap + (imput -> finalState)
        println("else - Fin")
      }
      
      transitionFunction(a + 1, map)
    } else {
      println("other else - end")
      map
    }
  }
}

object FileManager{
  
  def getAutomataFile(a: String) = { 
    var lines = Source.fromFile(a).getLines.toArray 
    new AutomataFile(lines)
  }
}
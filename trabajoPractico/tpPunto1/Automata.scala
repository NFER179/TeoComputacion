package tpPunto1

import scala.collection.Map

class Automata(val alphabetic: Array[String], val states: Int, val finalStates: Array[String], 
    var functionTransition: Map[String, Map[String, String]]) {
  
  def procesar(w: String): Boolean = {
    val inputs = w.toSeq
    
    val finalState = applyTransitionFunction("1", inputs)
    
    if(finalStates.contains(finalState.toString()))
      true
    else
      false
  }
  
  def applyTransitionFunction(a: String, b: Seq[Char]): Int = {
    if(b.isEmpty)
      a.toInt
    else {
      val transition = functionTransition get a
      val nextState = transition get b.head.toString()
      applyTransitionFunction(nextState, b.tail)
    }
  }
  
}
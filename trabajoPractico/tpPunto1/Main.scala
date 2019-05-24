package tpPunto1

import java.io._
import scala.io.Source

object Punto1 {
  
  def main(args: Array[String]): Unit = {
      
    /* write */
    /*val file = new File("trabajoPractico/tpPunto1/file.txt")
    val bw = new BufferedWriter(new FileWriter(file))
    bw.write("helllo word")
    bw.close()*/
    
    /* read */
    val fileName = "trabajoPractico/tpPunto1/file.txt"
    
    /* Get automata attributes */
    val automataAttributes = FileManager.getAutomataFile(fileName)
    
    /* Get Alphabet */
    val aAlphabet = automataAttributes.getAlphabet
    /* Get States */
    val aStates = automataAttributes.getCantState
    /* Get Final States */
    val aFinalStates = automataAttributes.getFinalStates
    /* Get function transition */
    val aFunctionTransition = automataAttributes.getTransitionFunction
    
    val kv = Map("test" -> "hola")
    val kv2 = Map("test2" -> "hola2")
    var test = Map("nicolas" -> kv)
    
    test += ("n" -> kv2)
    
    println(test get "nicolas")
    println(test get "n")
    
    val automata = new Automata(aAlphabet, aStates, aFinalStates, aFunctionTransition)
    
    //println(automata.procesar("a"));
  }
}
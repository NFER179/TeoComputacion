package tpPunto2

class MainP2 {
  def main (args: Array[String]): Unit = {
    
    val cinta = new Cinta("array".toCharArray())
    
    /* Generate map of transitions */
    
    
    /* Run MaquinaTuring */
    val mt = new MaquinaTuring(Map())
    mt.procesar(new Estado('i', false), cinta)
  }
}
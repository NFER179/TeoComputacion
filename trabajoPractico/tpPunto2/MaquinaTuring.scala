package tpPunto2

final class MaquinaTuring (transiciones: Map[(Estado, Char), (Estado, Char, Direccion)]) {
  
  def procesar(inicio: (Estado, Cinta)): (Estado, Cinta) = {
    /* Lanza el proceso y de la maquina y devuelva el estado final de la maquina y de la cinta. */
    /* tengo que recorrer la Cinta arrancando con el estado inicial y   */
    /*recorrer todo esto "transaciones get (Estado, Cinta.getChar())" hasta que el estado sea final*/ 
    (new Estado('a', false), new Cinta(Array('a', 'r', 'r', 'a', 'y')))
  }
}
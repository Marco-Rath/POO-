
package paquete;


public class principal {
    public static void main(String[] args) {
        
 //elementos de prueba
        Elemento[] elementos = {
            new Elemento(1, 1),//primera= peso , segunda=beneficio
            new Elemento(2, 2),
            new Elemento(4, 10),
            new Elemento(1, 2),
            new Elemento(12, 4)
                 };
 
        Mochila m_base = new Mochila(15, elementos.length);//objeto del tipo mochila que vendria a ser la base
                            //  espacio maximo              //mandar el array con los elementos de la linea 9-14
        Mochila m_opt = new Mochila(15, elementos.length);
        //llamar al metodo 
        llenarMochila(m_base, elementos, false, m_opt);
 
        System.out.println(m_opt);
    }
    public static void llenarMochila(Mochila m_base, Elemento[] elementos, boolean llena, Mochila m_opt) {
                                    //parametris, base numero de elementos,indicar si esta llena , respuesta 
      //si esta llena
      if (llena) {
          //compruebo si tiene mas beneficio que otra
          if (m_base.getBeneficio() > m_opt.getBeneficio()) {
               //beneficio de la mochila es > a de la mochila optima
              Elemento[] elementosMochBase = m_base.getElementos();//cambio de posicion
                             //insertando datos de la mochila base al array de elementos
              m_opt.clear();//elimina los datos que tiene la mochila optima
 
              //metemos los elementos
              for (Elemento e : elementosMochBase) {
                  if (e != null) { //no debe haber elementos nulos
                      m_opt.aniadirElemento(e);//los archiva los elementos en la mochila optima
                  }
 
              }
 
          }
 
      } else {
          //Recorre los elementos
          for (int i = 0; i < elementos.length; i++) {
              //si existe el elemento
              if (!m_base.existeElemento(elementos[i])) {//verifica si hay 2 elementos iguales
                  //Si el peso de la mochila se supera, indicamos que esta llena
                  if (m_base.getPesoMaximo() > m_base.getPeso() + elementos[i].getPeso()) {
                      m_base.aniadirElemento(elementos[i]); //añadimos
                      llenarMochila(m_base, elementos, false, m_opt);//si es falto lo inserta en la mochila
                      m_base.eliminarElemento(elementos[i]); // lo eliminamos
                  } else {
                      llenarMochila(m_base, elementos, true, m_opt);//indicamos que la mochila esta llena
                  }
 
              }
 
          }
 
      }
 
  }
    
}

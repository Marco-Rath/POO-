package linkedlistt;

import java.util.LinkedList;//importamos la clase de linkedlist

import java.util.Scanner;//importamos  la clase de Scanner para poder ingresar datos primitivos
public class prueba {
  
 

     
 
    public static void main(String[] args) {
        LinkedList<String> lista1 = new LinkedList<String>();//linkedlist usamos como una lista de tipo cadena de caracteres
        Scanner teclado = new Scanner(System.in);// declaramos la variable como dato primitivo
         int o ;
         //creamos una lista para seleccionar
         do{
         System.out.println("1)Ingresa elementos a la lista");
         System.out.println("2)mostrar lista");
         System.out.println("3)eliminar elemento de la lista");
         System.out.println("4)buscar un elemento de la lista");
         System.out.println("5)tamaño de la lista");
         System.out.println("6)salir");
         o = teclado.nextInt();
         switch(o){
     case 1:
         //lista dentro de una lista
                 int op;
                 do{
                System.out.println("1)Ingresa al inicio");
                System.out.println("2)Ingresa al final");
                 System.out.println("3)salir");
                 op = teclado.nextInt();
                 switch(op){
                     case 1:
                        
                         System.out.println("ingrese los caracteres");
                         String s = teclado.nextLine();//nexline para la entrada de datos por teclado
                         lista1.addFirst(s = teclado.nextLine());////addfirst sirve para ingresar datos al inicio de la lista
                               //adfirst =agregar primero

                          break;
                       
                     case 2:
                         System.out.println("ingrese los caracteres");
                          String n = teclado.nextLine();
                         lista1.addLast(n= teclado.nextLine());//addlast sirve para el ingreso de datos al final de la lista
                         break;
                 }
                 }while(op!=3);//salida
                 break;
     case 2:
            System.out.println(lista1);//muestra los datos almacenados 
            //linkedlist <> lista1 ;
              break;
      case 3:
                 int op1;
                 do{
                System.out.println("1)eliminar al inicio");
                System.out.println("2)eliminar al final");
                 System.out.println("3)salir");
                 op1 = teclado.nextInt();
                 switch(op1){
                     case 1:
                        lista1.removeFirst();//removefirst sirve para eliminar el primer elemeto ingresado de la lista
                        //removeFirst=remover el primero
                         System.out.println("el nodo del inicio fue eliminado");
                          break;
                       
                     case 2:
                         lista1.removeLast();//removelast sirve para borrar el ultimo elemento de la lista
                         //removelast=remover el ultimo 
                         System.out.println("el nodo del inicio fue eliminado");
                         break; 
                 
      
                 }
                 }while(op1!=3);//salida
                 break;
           
      case 4:
               int ans = 0;
                         System.out.println( "ingrese el valor a buscar ");
                         String bus = teclado.nextLine();//crear variable de cadena de caracter ingresado por el teclado 
                         System.out.println(bus = teclado.nextLine());//visible en la pantalla
                          for (int i = 0; i < lista1.size(); i++) {//size sirve para definir de una forma la matriz
  
                          // Extracción de cada elemento en
                          // la lista enlazada
                          
  
                             // para luego Comprobando si el elemento extraído es igual a
                          // el elemento a buscar
                          if ( lista1.get(i) == bus) {//get sirve para buscar o recuperar un elemento 
  
                              // Asignación del índice de la
                            // elemento a responder
                                ans = i;//su posicion
                              System.out.println("el elemento esta en la posicion "+ans);
                               break;
                           } }
                           System.out.println("el elemento no ha sido encontrado");
                         
                          break;

      case 5:
          System.out.println("el tamaño de la lista es "+lista1.size());
         }
         
    }while(o!=6);//salida
         
   
      
       
}}

package grafo;

import java.util.*;//se usa para importar funciones que han sido exportadas desde un módulo externo
public class Grafo {//la clase creada con el nombre Grafo
private int A[][];//se crea un arreglo bidimensional representada con la variable A
private int B[][];

public Grafo() { //constructor:tiene el mismo nombre de la clase
this.A= new int [6][6];//usamos this, para conseguir una referencia al objeto asociado.
this.B= new int [6][6];//la palabra new la usamos para crear un objeto tipo A(matriz),asimismo asignamos el tamaño de la matriz
}

public void Introducir()//creamos un metodo de acceso publico con el nombre Introduccion de tipo void
        //en este metodo se introduciran los elementos a la matriz
{
Scanner valores = new Scanner(System.in);//sacnner:es una variable que nos permite obtener la entrada de  datos simples que puede ser de tipo char, byte, short, int,etc
//System.in: es un parametro que indica al objeto scanner que reciba los datos introducidos por el usuario
int tam=0;//declaramos a tam como entero y le asignamos el valor de 0

for (int i=1;i<=5;i++)//
{
System.out.println("Da el numero de vertices adyasentes al vertice "+i+":");
//Las variables internas de la clase System out tienen acceso a los métodos de la clase PrintStream
//La clase PrintStream proporciona tres métodos para poder visualizar en este caso usamos el metodo println()
tam = valores.nextInt();//asignamos el valor entero introducido por el usuario a la variable tam


if(tam!=0 && tam<=5)//es una codicion en el cual nos indica que tam tiene que ser diferente de 0 y <=5 ñpara poder entrar
{
System.out.println("Da los vertices adyasentes:");
for(int j=1;j<=tam;j++)
{
int dato=valores.nextInt();//asignamos el valor entero introducido por el usuario a la variable dato
A[i][dato]=1;
}
}
else//se introduce en el caso de que la condicion del if sea falsa
{
if(tam>5)
System.out.println("No pueden ser el numero dado");
}


}
}

public void Muestra()//creamos un metodo de acceso publico con el nombre Muestra de tipo void
        //en este metodo se mostrara la matriz de adyacencia al usuario
{
System.out.println("\nEsta es la matriz de adyacencia");
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{

System.out.print(""+A[i][j]);
}
System.out.print("\n");//  /n: es un salto de linea
}
}

public void Conexo()//creamos un metodo de acceso publico con el nombre Conexo de tipo void
{
//El grafo será conexo si existe un camino desde cualquier nodo del grafo hasta cualquier otro.
boolean ban; //declaramos a ban de tipo booleano
int cont=0;//creamos un contador
for(int i=1;i<=5;i++)
{
ban=false;
for(int j=1;j<=5;j++)
{
if (A[i][j]==1)
ban=true;
}

if (ban==true)//recorre cada vertice y analiza si tiene conexion con otro vertice 
cont=cont+1;
}

if (cont==5)//al ser solo 5 vertices ,por lo menos cada vertice debe estar conectado con un vertice para ser conexo
System.out.println("\nEl grafo SI es Conexo");
else//de lo contrario el algoritmo mostrara que no es conexo
System.out.println("\nEL grafo NO es Conexo");
}

public void Grado()//creamos un metodo de acceso publico con el nombre Grado de tipo void
{
int c[]=new int [6];//creamos un objeto de tipo array (unidimensional) de tamaño 6 con la variable c
int cont=0;//creamos un contador

for(int i=1;i<=5;i++)
{
cont=0;
for(int j=1;j<=5;j++)
{
if (A[i][j]==1 || A[j][i]==1)
cont=cont+1;//contara la cantidad de conexiones que tiene cada vertice
}
c[i]=cont;//dicha cantidad se estara introduciendo en el array
}

for(int i=1;i<=5;i++)
{
System.out.println("grado total del vertice "+i+" es: "+c[i]);
}
}

public void Multiplica(int x)//creamos un metodo de acceso publico con el nombre Multiplica de tipo void
{
int c[][]=new int[6][6];
int j, i, k;
if (x<=2)//multiplicacion de la misma matriz
{
for(i=1; i<=5; i++)
{
for(j=1; j<=5;j++)
{
for(k=1; k<=5; k++)

{
B[i][j]=B[i][j]+(A[i][k]*A[k][j]);
}
}
}
}
else//multiplicacion de dos matrizes diferentes
{
for(i=1; i<=5; i++)
{
for(j=1; j<=5;j++)
{
for(k=1; k<=5; k++)
{
c[i][j]=c[i][j]+(A[i][k]*B[k][j]);
}
}
}
this.B=c;
}
}

public void Camino(int i, int j)//creamos un metodo de acceso publico con el nombre Camino de tipo void
{
boolean ban=false;
int cont=0;//creamos un contador

while(ban==false && cont<5)//mientras la variable ban sea falso y el contador sea menor a 5
{
cont=cont+1;//se almacenara la longitud del camino con cada vuelta que realice el while
if (cont==1)
{
if(A[i][j]==1)//si la longitud de los 2 vertices es de 1
{
System.out.println("El camino de "+i+" a "+j+" es de longitud: "+cont);
ban=true;//condicion para salir del while cuando encuentre un camino
}
}
else
{
Multiplica(cont);//llamara al metodo multiplica e introducira la variable cont 
if(B[i][j]!=0)//se detendra hasta que encuente al vertice incial(i) con el vertice final(j)
{
System.out.println("El camino de "+i+" a "+j+" es de longitud: "+cont);
ban=true;
}
}
}
if (ban==false)//en el caso de que ninguna condicion se cumpla,mostrara al usuario que no hay camino
System.out.println("NO existe camino de "+i+" a "+j);
}

public static void main (String[] args)//es el metodo principal 
{
Scanner scan = new Scanner(System.in);
int o=0;//creamos una variable como opcion(o) de tipo entero y le asigamos el 0

do//creamos un bucle que ejecuta una sentencia especificada, hasta que la condición de comprobación se evalúa como falsa. 
{
Grafo G=new Grafo();
G.Introducir();
G.Muestra();
G.Conexo();

G.Grado();
System.out.println("Desea buscar un camino en este grafo \n1.-SI\n2.-NO");
int op=scan.nextInt();
if(op==1)//creamos otra variable opcion
{
System.out.println("De el vertice de partida");
int i=scan.nextInt();
System.out.println("De el vertice a llegar");
int j=scan.nextInt();
G.Camino(i,j);
}

System.out.println("^*****GRAFO EVALUADO*****");
System.out.println("\nDesea introducir otro grafo \n1.-SI\n2.-NO");
o=scan.nextInt();
}while(o==1);//sentecia especifica
}
}
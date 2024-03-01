import java.util.Scanner;
/**
* Tarea de documentacion de java doc JOSE SANTIAGO RODRIGUEZ TOCA
* Es un programa que simula una calculadora basica donde el usuario podra ingresar 2 valores y tendra un menu para poder elegir la operacion que quiere hacer con ellos
@author: Jose Santiago Rodriguez Toca
@date: 01-03-24
*/
public class Calculadora {
public static void main (String[] args){
/** 
* Inicializamos unas variables que nos permitiran guardar la informacion que el usuario introduzco mediante el teclado para poder hacer las operaciones
* Ademas Instanciamos un varible que es de tipo Scanner que es la que permite insertar mediante el teclado 
*/
    Scanner leer = new Scanner(System.in);
    int opcion;
    int n1;
    int n2;
    int resultado ;
/**
* Hacemos un mini menu el cual mostrara las opciones de esta calculadora 
* Seran las operaciones basicas sumar, restar, dividir y multiplicar
* Ademas el scanner que permitira al usuario elegir que quiere hacer 
*/
    System.out.println("Elige una operacion");
    System.out.println("1) -Suma");
    System.out.println("2) -Resta");
    System.out.println("3) -Multiplicacion");
    System.out.println("4) -Dividir");
    opcion = leer.nextInt();
/**
* Pediremos al usuario que introduzca los valores de las variables n1 y n2 para las operaciones 
*/
    System.out.println("Escribe el primer numero");
    n1 = leer.nextInt();
    System.out.println("Escribe el segundo numero");
    n2 = leer.nextInt();
/**
* Se utiliza el switch dependiendo de caso seleccione el usuario se ejecute un codigo o otro.  
*/
    switch(opcion){
        /**
         * En caso de la que la opcion sea 1 se ejectura una suma entre n1 y n2 y el resultado se guardara en la variable resultado para al final mostrarlo mediante el System.out.println(resultado) y terminado el codigo hacemos un break; para que no siga el codigo.
         */
        case 1: 
        resultado = n1 + n2;
        System.out.println("El resultado de sumar"+n1 + "y" +n2 + "es: " +resultado);
        break;
        /**
         * En caso de la que la opcion sea 2 se ejectura una resta entre n1 y n2 y el resultado se guardara en la variable resultado para al final mostrarlo mediante el System.out.println(resultado) y terminado el codigo hacemos un break; para que no siga el codigo.
         */
        case 2: 
        resultado = n1- n2;
        System.out.println("El resultado de restar"+n1 + "y" +n2 + "es: " +resultado);
        break;
        /**
         * En caso de la que la opcion sea 3 se ejectura una multiplicacion entre n1 y n2 y el resultado se guardara en la variable resultado para al final mostrarlo mediante el System.out.println(resultado) y terminado el codigo hacemos un break; para que no siga el codigo.
         */
        case 3: 
        resultado = n1 * n2;
        System.out.println("El resultado de multiplicar"+n1 + "y" +n2 + "es: " +resultado);
        break;
        /**
         * En caso de la que la opcion sea 4 se ejectura una dividir entre n1 y n2 y el resultado se guardara en la variable resultado para al final mostrarlo mediante el System.out.println(resultado) y terminado el codigo hacemos un break; para que no siga el codigo.
         */
        case 4: 
        resultado = n1 / n2;
        System.out.println("El resultado de dividir"+n1 + "y" +n2 + "es: " +resultado);
        break;
        /**
         * En caso de que no se seleccione ningun numero que esta establecido en el menu salta el caso Default
         */
        default: 
        System.out.println("Caso default");
        break;
    }

}
}
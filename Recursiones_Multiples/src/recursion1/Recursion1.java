
package recursion1;

public class Recursion1 {
    
    static int cont = 1 ;
    /*
    Logica de la multiplicra
       a = 5 y b = 4 
       5 + Multiplicar(5 , 3);
       5 + 5 + Multiplicar(5 , 2);
       5´ + 5 + 5 + Multiplicar(5 , 1);
       5 + 5 + 5 + 5 + Multiplicar(5 , 0);
       final tenemos---> 5 + 5 + 5+ 5 + 0 = 20 
       
    */
 
    public static int Multiplicar (int a, int b)
    {
        if ( b == 0)
            return 0;
        else 
            return a + Multiplicar(a, (b - 1));
        
    }
    /*
        a = 4 y b = 3  resultado = 12 
       
    4 + Multiplicar_constante(4, 3, (2) );
    4 + 4 + Multiplicar_constante(4, 3, (3) );
    4 + 4 + 4 + Multiplicar_constante(4, 3, (4) );
    test final es 4 + 4 + 4 + 0 = 12 
    */
    
    public static int Multiplicar_constante (int a , int b, int cont)
    {
        if (b < cont)
            return 0;
        else 
            return  a + Multiplicar_constante(a, b, (cont + 1) );
    }
    /*
        a = 3 
        
         3  +  Sumar (2);
         3 + 2 + Sumar (1);
         3 + 2 + 1 Sumar (0);
         final del test ---> 3 +2 + 1 + 0 = 6 
    
    */
    public static int Sumar (int a)
    {
        if (a == 0)
            return 0;
        else 
            return a + Sumar(a-1);
        
    }
    /*
       4! 4 * 3 * 2 * 1  = 4 * 3!
       4 * Factorial (3);
       4 * 3 * Factorial (2);
       4 * 3 * 2 * Factorial(1);
       final del test  -->  4 * 3 * 2 * 1 = 24
         
    */
    public static int Factorial(int a)
    {
        if ( a <= 1 )
            return 1;
        else 
            return a * Factorial(a-1);
        
    }
    /*
        tengamos una base 2 y una potencia de 2 --->  2 * 2 = 4
         2  * Potencia( 2 , 1);
        2 * 2 * Potencia (2 , 0);
        test final --> 2 * 2 * 1  = 4;
    */
    public static int Potencia (int a, int n)
    {
        if ( n == 0)
            return 1 ;
        else if ( n > 0 )
            return a * Potencia(a, n-1);
        else 
            return 0;
    }
    /*
       vamos a dividir 4 /2 = 2 a = 4, b = 2;
       1 + Dividir(2,2);
       1 + 1 + Dividir(0,2);
        final del test --> 1 + 1 + 0 = 2
    */
    public static int Dividir (int a,int b)
    {
        if ( a < b)
            return 0;
        else 
            return 1 + Dividir((a-b), b);
    }
    public static void main(String[] args) {
        System.out.println(" Resulatdo de la multiplicacion : " + Multiplicar(4,3));
        System.out.println(" Resulatdo de la  sumatoria  : " + Sumar(3));
        System.out.println(" Resulatdo del Factorial  : " + Factorial(3));
        System.out.println(" Resulatdo de Potencia     : " + Potencia(2, 4));
         System.out.println(" Resulatdo de Division     : " + Dividir(8, 4));
         System.out.println(" Resulatdo de Multiplicacion con contador : " + Multiplicar_constante(4, 8, cont));
    }
    
}

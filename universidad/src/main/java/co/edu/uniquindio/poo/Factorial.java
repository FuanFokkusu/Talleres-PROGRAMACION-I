package co.edu.uniquindio.poo;

public class Factorial {

    public static int factorial(int num){

        int resultado = 1;

        for(int i =1; i<=num; i++){

            resultado*=i;
        }

        return resultado;

    }

    public static void imprimir(int num, int resultado){

        System.out.println("El factorial del numero " + num + " es: " + resultado);

    }

    public static void main(String[] args) {
        int num = 6;
        imprimir(num, factorial(num));
    }

}

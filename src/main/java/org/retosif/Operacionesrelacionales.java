package org.retosif;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Operacionesrelacionales {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try {
            System.out.println("ingrese un número");
            int num1=scanner.nextInt();
            System.out.println("Ingrese un segundo número");
            int num2=scanner.nextInt();
            comparar(num1,num2);
        }catch (InputMismatchException e){
            System.out.println("Debe ingresar solamente números");

        }finally {
            scanner.close();
        }

    }

    public static void comparar(int numero1, int numero2) {
        if (numero1<numero2){
            System.out.println("el número 2: "+numero2+" es mayor que el número 1: "+numero1);
        } else if (numero1>numero2) {
            System.out.println("el número 1: "+numero1+" es mayor que el número 2: "+numero2);
        }else {
            System.out.println("los números son iguales");
        }


    }
}

package org.retosif;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Restos {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try {
            System.out.println("Escribe un número");
            int numero1= scanner.nextInt();
            System.out.println("Selecciona una operación; +, -, *, /");
            String operador=scanner.next();
            System.out.println("Escribe un número");
            int numero2=scanner.nextInt();
            realizarOperacion(numero1, numero2, operador);
        } catch (InputMismatchException e){//una cláusula que se utiliza dentro de un bloque try-catch para manejar específicamente las excepciones de tipo InputMismatchException. Esta excepción se lanza cuando un usuario intenta ingresar un tipo de dato que no coincide con el tipo esperado por el programa, como por ejemplo, ingresar una cadena de texto cuando se espera un número entero
            System.out.println("Por favor, ingresa un número válido");
        } finally {
            scanner.close();
        }

    }
    public static void realizarOperacion(int num1, int num2, String op){
        switch (op){
            case "+":
                System.out.println("la suma es "+(num1+num2));
                break;
            case "-":
                System.out.println("La resta es "+(num1-num2));
                break;
            case "*":
                System.out.println("La multiplacación es "+(num1*num2));
                break;
            case "/":
                if (num2 !=0){
                    System.out.println("La división es "+(num1/num2));
                }else {
                    System.out.println("No se puede dividir entre 0");
                }
                break;
            default:
                System.out.println("No es una opción valida");
                break;

        }


    }
}

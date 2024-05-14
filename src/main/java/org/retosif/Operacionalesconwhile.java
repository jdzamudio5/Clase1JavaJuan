package org.retosif;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Operacionalesconwhile {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            try {
                System.out.println("\"Ingrese un número (o escriba 'exit' para salir):");
                String input=scanner.nextLine();
                if (input.toLowerCase().equals("exit")){
                    break;
                }
                int numero1=Integer.parseInt(input);
                System.out.println("Ingrese un segundo número");
                int numero2=Integer.parseInt(scanner.nextLine());

                operaciones(numero1, numero2);
            }catch (NumberFormatException e){
                System.out.println("Debes ingresar solo números enteros");
            }
        }
        scanner.close();
    }

    public static void operaciones(int num1, int num2) {
        if (num1>num2){
            System.out.println("El número 1: " + num1 + " es mayor que el número 2: " + num2);
        } else if (num1<num2) {
            System.out.println("El número 2: " + num2 + " es mayor que el número 1: " + num1);
        } else {
            System.out.println("Los números con iguales");
        }

    }
}

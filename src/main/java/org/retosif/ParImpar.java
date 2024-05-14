package org.retosif;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            try {
                System.out.println("*******\nPrograma para validar si un número es par o impar\n**********");
                System.out.println("Ingrese un número entero");
                String input=scanner.nextLine();
                if (input.toLowerCase().equals("exit")){
                    break;
                }
                int numero1=Integer.parseInt(input);
                validarpar(numero1);

            }catch (NumberFormatException e){
                System.out.println("ERROR!!!!!\n------Ingresar solo números enteros------\n");
            }


        }
        scanner.close();

    }

    public static void validarpar(int num1) {
        if (num1%2==0){
            System.out.println("--> "+num1+" es par");
        }else {
            System.out.println("--> "+num1+" es impar");
        }


    }
}

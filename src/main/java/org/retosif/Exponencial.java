package org.retosif;

import java.util.Scanner;

public class Exponencial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            try {
                System.out.println("Programa Potencia de un número");
                System.out.println("Ingrese un número a realizar la potenciación o escriba exit para finalizar programa");
                String entrada=scanner.nextLine();
                if (entrada.toLowerCase().equals("exit")){
                    break;
                }
                int num1=Integer.parseInt(entrada);
                System.out.println("Ingrese el exponente");

                int expon=Integer.parseInt(scanner.nextLine());

                double resultado=exponencial(num1,expon);
                System.out.println(resultado);
            }catch (NumberFormatException e){
                System.out.println("ERROR!!!!!\n------Ingresar solo números enteros------\n");
            }
        }
        scanner.close();
    }
    public static double exponencial(int base, int exp){
        if (exp==0){
            return 1.0;
        } else if (exp>0) {
            return Math.pow(base,exp);
        }else {
            return 1/Math.pow(base,-exp);
        }


    }
}

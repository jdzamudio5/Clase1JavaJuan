package org.retosif;

import java.util.Scanner;

public class Matricula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Programa para validar si se puede matricular");
                System.out.println("Por favor ingrese su Sexo (m o f) o exit para salir");
                String entrada = scanner.nextLine();
                if (entrada.toUpperCase().equals("EXIT")) {
                    break;
                }
                System.out.println("Ingrese su edad");
                int edad = Integer.parseInt(scanner.nextLine());
                System.out.println("Ingrese su nota");
                double nota = Double.parseDouble(scanner.nextLine());


                System.out.println("Resultado "+validaMatricula(entrada, edad, nota));
            } catch (NumberFormatException e) {

                System.out.println("Error, en edad y notas ingrese solo números");

            }

        }
        scanner.close();

    }

    public static String validaMatricula(String sex, int eda, double not) {
        String calificacion="";
        if (sex.equalsIgnoreCase("m") || sex.equalsIgnoreCase("f")&&not>=5 && eda>=18){
            calificacion = "aceptada";

        }else {
            calificacion="no aceptada";
        }

        return calificacion;
    }
}


/*switch (eda){
            case 18:
                if (sex.equalsIgnoreCase("m") || sex.equalsIgnoreCase("f")){
                    if (not>=5){
                        calificacion = "aceptada";
                    }
                }
                break;
            default:

                break;
        }*/
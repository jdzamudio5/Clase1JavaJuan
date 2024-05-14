package org.retosif;
import java.util.Scanner;
public class LetraMayuscula {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Ingrese una letra o escriba exit para salir");
            String letra=scanner.nextLine();
            if (letra.length()!=1){
                if (letra.toLowerCase().equals("exit")){
                    break;
                }
                System.out.println("Solo debe ingresar una letra");
            }else {
                validarMayucula(letra);
            }
        }
    }
    public static void validarMayucula(String letra){
        if ((letra.compareTo("A")>=0)&&(letra.compareTo("Z")<=0)||letra.equals("Ñ")){
            System.out.println("La letra ingresada es mayúscula");
        }else {
            System.out.println("La letra no es mayúscula");
        }
    }
}

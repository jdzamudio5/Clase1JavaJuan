package org.condicionales;

public class Main {
    public static void main(String[] args) {
        int edad=14;
        /*if (edad>18){
            System.out.println("Puedo Ingresar");

        }else{
            System.out.println("No puede ingresar");
        }*/

        if (edad>15 & edad<18){
            System.out.println("Puede ingresar a la zona familiar");
        } else if (edad>=18 & edad<=24) {
            System.out.println("Puede ingresar a la zona rosa");

        } else if (edad>24) {
            System.out.println("Puede ingresar a la zona VIP");

        }else {
            System.out.println("No puede ingresar");
        }

    }
}

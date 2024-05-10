package org.semaforo;

public class Main {
    public static void main(String[] args) {
        String semaforo;
        semaforo="AmaRillO";
        if (semaforo.toLowerCase().equals("verde")){
            System.out.println("puede pasar");
        } else if (semaforo.toLowerCase().equals("amarillo")) {
            System.out.println("preparese para detenerse");
        } else if (semaforo.toLowerCase().equals("rojo")) {
            System.out.println("Deténgase");
        }else {
            System.out.println("Error, vuelva a intentarlo!");
        }
    }
}

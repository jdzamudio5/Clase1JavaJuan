package org.example;

public class Main2 {
    public static void main(String[] args) {
        String helloWord="Este es mi primer hola mundo";
        System.out.println(helloWord.length());//Indica cuantos caracteres ocupa o longitud
        System.out.println(helloWord.toLowerCase());//lo convierte todo a minuscula ideal para enviar emails
        System.out.println(helloWord.toUpperCase());// lo convierte a mayúscula
        int a=5;
        System.out.println(helloWord.indexOf("mi"));//Indica la posición de lo que estoy buscando
        String helloWord2="y voy muy bien";
        System.out.println(helloWord.concat(Integer.toString(a)));//concatenamos y hacemos un casteo de Int a String
    }
}

package org.example;

public class Main {
    public static void main(String[] args) {
        String nombre;
        nombre="Juan";
        int numero;
        numero=0;
        System.out.println(numero);
        System.out.println(nombre);
        float k;
        boolean b;
        char c;
        k=5.5f;//Es un dato tipo float y siempre debe ir una F a Final
        c='a';

        String k2=Float.toString(k);//permite pasar de float a String--Se llama Caster
        String union=nombre+" "+c+k2;
        System.out.println(union);
    }
}

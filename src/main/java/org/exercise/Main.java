package org.exercise;

public class Main {
    public static void main(String[] args) {
        int x,y,z, sum, rest, mult, mod=0;
        String palabra1, palabra2;
        x=3;
        y=5;
        z=4;
        sum=x+y+z;
        System.out.println(sum);
        rest=x-y-z;
        System.out.println(rest);
        mult=x*y*z;
        System.out.println(mult);
        mod=3%5;
        System.out.println(mod);

        boolean a,b,c;
        a=x>y;// x es mayor a Y. Si es verdad verdadero, sino falso
        b=x!=y;//!= siginifica diferente es decir x es diferente de y, si es cierto es true sino false
        c=x==y;//== es para validar si son iguales y solo datos númericos. No funciona con String
        System.out.println(a);
        System.out.println(b);
        palabra2="dos";
        palabra1="uno";
        c=palabra2.equals(palabra1);//equals para comparar si son iguales o no en string
        System.out.println(c);
    }
}

package org.retosif;

import javax.swing.*;

public class IfAnidado {
    public static void main(String[] args) {
        float nota;
        while (true){
            try {
                String entrada= JOptionPane.showInputDialog("Ingrese su nota o digite exit() para finalizar").toLowerCase();
                if (entrada.equals("exit()")){
                    break;
                }
                nota=Float.parseFloat(entrada);

                if (nota>=6){
                    if (nota<8){
                        JOptionPane.showMessageDialog(null,"Pasó el curso con promedio basico");
                    } else if (nota>=8 && nota<9) {
                        JOptionPane.showMessageDialog(null,"Pasó el curso con promedio alto");
                    }else if(nota>=9 && nota<=10) {
                        JOptionPane.showMessageDialog(null,"Pasó el curso con honores");
                    }else {
                        JOptionPane.showMessageDialog(null,"Nota no valida");
                    }

                }else if (nota>=0 && nota<6){
                    JOptionPane.showMessageDialog(null,"Pierde el curso");
                }else {
                    JOptionPane.showMessageDialog(null,"Nota no Valida. Ingrese un número entre 0 y 10");
                }
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Error!!! \nIngrese su nota o exit() para salir");


        }

        }
    }
}

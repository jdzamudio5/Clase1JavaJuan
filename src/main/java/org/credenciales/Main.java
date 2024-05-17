package org.credenciales;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){

            String usuario= JOptionPane.showInputDialog("Ingrese su usuario o exit para salir");//scanner.nextLine();
            if (usuario.toLowerCase().equals("exit")){
                break;
            }

            String password=JOptionPane.showInputDialog("Ingrese su Contraseña");
            boolean acceso=ingreso(usuario,password);
            if (acceso){
                JOptionPane.showMessageDialog(null, "Acceso concedido");

            }else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");

            }
        }
        scanner.close();
    }
    public static boolean ingreso(String user, String pass){

        if (user.equalsIgnoreCase("occidente")&&pass.equals("Occidente*2023")){
            return true;

        }else {
            return false;

        }

    }
}

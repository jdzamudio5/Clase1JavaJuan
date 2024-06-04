package org.credenciales;

import javax.swing.*;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static final String USERNAME="occidente";
    private static final String PASSWORD="Occidente*2023";

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){

            String usuario= JOptionPane.showInputDialog("Ingrese su usuario o exit para salir");//scanner.nextLine();
            if (usuario.equalsIgnoreCase("exit")||usuario==null){
                break;
            }

            String password=JOptionPane.showInputDialog("Ingrese su Contraseña");
            if (password==null){
                break;
            }
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
        if (Objects.equals(user, USERNAME)&&Objects.equals(pass,PASSWORD)){
            return true;
        }else {
            return false;
        }

    }
}

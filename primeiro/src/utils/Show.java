package utils;

import entities.Usuario;

import javax.swing.*;
import java.util.ArrayList;

public class Show {

    public static void showMessage(String message){
        JOptionPane.showMessageDialog(null, message, "USUÁRIO", JOptionPane.WARNING_MESSAGE);
    }
    public static void showInfo(Usuario user) {
        String message = "NOME: " + user.getNome() + "\n" +
                "QUANT ELEMENTS: " + user.sizeElements() + "";
        JOptionPane.showMessageDialog(null, message, "USUÁRIO", JOptionPane.WARNING_MESSAGE);
    }

    public static void showElements(Usuario user) {
        String message = "";
        for (int i = 0; i < user.sizeElements(); i++) {
            message += ((i + 1) + " - " + user.getElement(i).getNome() + "\n");
        }
        JOptionPane.showMessageDialog(null, message, "ELEMENTOS", JOptionPane.WARNING_MESSAGE);
    }

    public static void showUsers(ArrayList<Usuario> users) {
        String message = "";
        for (int i = 0; i < users.size(); i++) {
            message += ((i + 1) + " - " + users.get(i).getNome() + "\n");
        }
        JOptionPane.showMessageDialog(null, message, "ELEMENTOS", JOptionPane.WARNING_MESSAGE);
    }
}

package utils;

import entities.Elemento;
import entities.Usuario;

import javax.swing.*;
import java.util.ArrayList;

public class Inputs {
    public static String inputText(String message) {
        return JOptionPane.showInputDialog(null, message, "INPUT", JOptionPane.QUESTION_MESSAGE);
    }

    public static int inputNum(String message) {
        String input = JOptionPane.showInputDialog(null, message, "INPUT", JOptionPane.QUESTION_MESSAGE);
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
            return inputNum(message);
        }
    }

    public static int deleteElement(ArrayList<Elemento> elements) {
        String message = "";
        for (int i = 0; i < elements.size(); i++) {
            message += ((i + 1) + " - " + elements.get(i).getNome() + "\n");
        }
        String input = JOptionPane.showInputDialog(null, message, "INPUT", JOptionPane.QUESTION_MESSAGE);
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
            return deleteElement(elements);
        }
    }

    public static int deleteUser(ArrayList<Usuario> users) {
        String message = "";
        for (int i = 0; i < users.size(); i++) {
            message += ((i + 1) + " - " + users.get(i).getNome() + "\n");
        }
        String input = JOptionPane.showInputDialog(null, message, "INPUT", JOptionPane.QUESTION_MESSAGE);
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
            return deleteUser(users);
        }
    }

    public static int selectUser(ArrayList<Usuario> users) {
        String message = "Escolha um usuário: \n";
        for (int i = 0; i < users.size(); i++) {
            message += ((i + 1) + " - " + users.get(i).getNome() + "\n");
        }
        String input = JOptionPane.showInputDialog(null, message, "INPUT", JOptionPane.QUESTION_MESSAGE);
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
            return deleteUser(users);
        }
    }
}


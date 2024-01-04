package app;

import entities.Usuario;
import utils.*;

import java.util.ArrayList;
import java.util.Calendar;


public class Main {
    /*public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        while (true) {
            switch (Inputs.inputNum(
                    "1 - Criar Usuário\n" +
                            "2 - Excluir Usuário\n" +
                            "3 - Listar Usuários\n" +
                            "4 - Opções de Usuário\n" +
                            "5 - Sair")) {
                case 1:
                    String nome = Inputs.inputText("Digite o nome do usuário: ");
                    Usuario user = new Usuario(nome);
                    usuarios.add(user);
                    break;
                case 2:
                    if (usuarios.isEmpty()) {
                        Show.showMessage("Lista de usuários vazia!");
                    } else {
                        int indexDelete = Inputs.deleteUser(usuarios);
                        if (indexDelete > 0 && indexDelete <= usuarios.size()) {
                            usuarios.remove(indexDelete - 1);
                            Show.showMessage("Usuário excluído com sucesso!");
                        } else {
                            Show.showMessage("O número escolhido não corresponde a nenhum usuário.");
                        }
                    }
                    break;
                case 3:
                    if (usuarios.isEmpty()) {
                        Show.showMessage("Lista de usuários vazia!");
                    } else {
                        Show.showUsers(usuarios);
                    }
                    break;
                case 4:
                    if (usuarios.isEmpty()) {
                        Show.showMessage("Lista de usuários vazia!");
                    } else {
                        int indexSelect = Inputs.selectUser(usuarios);
                        if (indexSelect > 0 && indexSelect <= usuarios.size()) {
                            switch (Inputs.inputNum(
                                    "1 - Criar Elemento\n" +
                                            "2 - Excluir Elemento\n" +
                                            "3 - Listar Elementos\n")) {
                                case 1:
                                    String nomeElement = Inputs.inputText("Digite o nome do elemento: ");
                                    usuarios.get(indexSelect - 1).addElement(nomeElement);
                                    Show.showMessage("Elemento criado!");
                                    break;
                                case 2:
                                    if (usuarios.get(indexSelect - 1).sizeElements() == 0) {
                                        Show.showMessage("Lista de usuários vazia!");
                                    } else {
                                        int indexDelete = Inputs.deleteElement(usuarios.get(indexSelect - 1).getElementos());
                                        if (indexDelete > 0 && indexDelete <= usuarios.get(indexSelect - 1).sizeElements()) {
                                            usuarios.get(indexSelect - 1).removeElement(indexDelete - 1);
                                            Show.showMessage("Elemento excluído com sucesso!");
                                        } else {
                                            Show.showMessage("O número escolhido não corresponde a nenhum elemento.");
                                        }
                                    }
                                    break;
                                case 3:
                                    Show.showElements(usuarios.get(indexSelect - 1));
                                    break;
                                default:
                                    break;
                            }
                        } else {
                            Show.showMessage("O número escolhido não corresponde a nenhum usuário.");
                        }
                    }
                    break;
                case 5:
                    Show.showMessage("Saiu!");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Nenhuma das opções foi escolhida!");
                    break;
            }
        }
    }*/
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c);
        System.out.println(c.getWeekYear());
    }
}

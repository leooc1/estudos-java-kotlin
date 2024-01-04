package entities;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private ArrayList<Elemento> elementos = new ArrayList<>();

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addElement(String nome) {
        Elemento elemento = new Elemento(nome);
        this.elementos.add(elemento);
    }

    public void removeElement(int index){
        this.elementos.remove(index);
    }

    public int sizeElements() {
        return this.elementos.size();
    }

    public Elemento getElement(int index) {
        return elementos.get(index);
    }

    public ArrayList<Elemento> getElementos(){
        return this.elementos;
    }
}

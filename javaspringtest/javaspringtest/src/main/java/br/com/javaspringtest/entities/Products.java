package br.com.javaspringtest.entities;

import org.apache.tomcat.util.json.JSONParser;

import java.util.UUID;

public class Products {
    private UUID id;
    private String nome;
    private Double price;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    public Products(UUID id, String nome, Double price) {
        this.id = id;
        this.nome = nome;
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":\"" + id +"\""+
                ", \"nome\":\"" + nome + "\"" +
                ", \"price\":" + price +
                '}';
    }
}

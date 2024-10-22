package com.mycompany.array;

import java.util.ArrayList;

public class Array {
    
    // Função para adicionar itens na lista de compras
    public static void adicionarItensFeira() {
        // Criando um array dinâmico (ArrayList) para armazenar os itens
        ArrayList<String> listaDeCompras = new ArrayList<>();

        // Adicionando itens à lista
        listaDeCompras.add("Bananas");
        listaDeCompras.add("Maçãs");
        listaDeCompras.add("Tomates");
        listaDeCompras.add("Alface");
        listaDeCompras.add("Cenouras");
        listaDeCompras.add("bancada de pastel");
        listaDeCompras.add("melancia");

        // Imprimindo os itens da lista de compras
        System.out.println("Itens na lista de compras da feira:");
        for (String item : listaDeCompras) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        // Chamando a função para adicionar e mostrar os itens
        adicionarItensFeira();
    }
}

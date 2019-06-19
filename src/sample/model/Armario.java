package sample.model;

import java.util.ArrayList;
import java.util.Collections;

public class Armario {
    private ArrayList<Item> items;
    private String tipoItem;
    private int tamanho;

    public Armario(String tipoItem,int tamanho){
        this.tipoItem = tipoItem;
        this.tamanho = tamanho;
    }

    public void adicionarItem(Item item){
        this.items.add(item);
        Collections.sort(this.items);
    }
    public void removerItem(Item item){
        this.items.remove(item);
        Collections.sort(this.items);
    }

}

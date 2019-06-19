package sample.model;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import java.util.Observable;

public class Quarto {

    private ObservableList<Armario> armarios;
    private Quarto instaceOf;

    public Quarto getInstaceOf() {
        if(instaceOf == null)
            instaceOf = new Quarto();
        return instaceOf;
    }

    private Quarto(){
        for(int a=0;a<10;a++){
            armarios.add(new Armario("k7",100));
        }
        for(int a=0;a<10;a++){
            armarios.add(new Armario("vinil",150));
        }
        for(int a=0;a<10;a++){
            armarios.add(new Armario("cd",200));
        }
    }
}

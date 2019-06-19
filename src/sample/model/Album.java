package sample.model;

import java.util.ArrayList;

public class Album {
     private String nome;
     private String ano_de_lancamento;
     private int numero_de_musicas;
     private ArrayList<Musica> musicas;
     private AutorBanda autor_banda;


    public Album( String nome, String ano_de_lancamento, ArrayList<Musica> musicas, AutorBanda autor_banda) {
        this.setAno_de_lancamento(ano_de_lancamento);
        this.musicas = musicas;
        this.setNumero_de_musicas(this.musicas.size());
        this.setAutor_banda(autor_banda);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno_de_lancamento() {
        return ano_de_lancamento;
    }

    public void setAno_de_lancamento(String ano_de_lancamento) {
        this.ano_de_lancamento = ano_de_lancamento;
    }

    public int getNumero_de_musicas() {
        return numero_de_musicas;
    }

    public void setNumero_de_musicas(int numero_de_musicas) {
        this.numero_de_musicas = numero_de_musicas;
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void addMusicas(Musica musicas) {
        this.musicas.add(musicas);
    }

    public AutorBanda getAutor_banda() {
        return autor_banda;
    }

    public void setAutor_banda(AutorBanda autor_banda) {
        this.autor_banda = autor_banda;
    }
}

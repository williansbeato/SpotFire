package sample;

public class Album {
     private String nome;
     private String ano_de_lancamento;
     private String numero_de_musicas;
     private String musicas;
     private String autor_banda;


    public Album( String nome, String ano_de_lancamento, String numero_de_musicas, String musicas, String autor_banda) {
        this.setAno_de_lancamento(ano_de_lancamento);
        this.setNumero_de_musicas(numero_de_musicas);
        this.setMusicas(musicas);
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

    public String getNumero_de_musicas() {
        return numero_de_musicas;
    }

    public void setNumero_de_musicas(String numero_de_musicas) {
        this.numero_de_musicas = numero_de_musicas;
    }

    public String getMusicas() {
        return musicas;
    }

    public void setMusicas(String musicas) {
        this.musicas = musicas;
    }

    public String getAutor_banda() {
        return autor_banda;
    }

    public void setAutor_banda(String autor_banda) {
        this.autor_banda = autor_banda;
    }
}

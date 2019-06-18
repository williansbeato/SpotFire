package sample;

public class Musica {


    private String nome;
    private String compositores;
    private int duracao;


    public Musica(String nome, String compositores, int duracao) {
        this.setNome(nome);
        this.setCompositores(compositores);
        this.setDuracao(duracao);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCompositores() {
        return compositores;
    }

    public void setCompositores(String compositores) {
        this.compositores = compositores;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}

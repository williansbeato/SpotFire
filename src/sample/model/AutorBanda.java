package sample.model;

public class AutorBanda {
   private String nome;
   private String cidade_de_origem;
   private String ano_de_nascimento;


    public AutorBanda(String nome, String cidade_de_origem, String ano_de_nascimento) {
        this.setNome(nome);
        this.setCidade_de_origem(cidade_de_origem);
        this.setAno_de_nascimento(ano_de_nascimento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade_de_origem() {
        return cidade_de_origem;
    }

    public void setCidade_de_origem(String cidade_de_origem) {
        this.cidade_de_origem = cidade_de_origem;
    }

    public String getAno_de_nascimento() {
        return ano_de_nascimento;
    }

    public void setAno_de_nascimento(String ano_de_nascimento) {
        this.ano_de_nascimento = ano_de_nascimento;
    }
}

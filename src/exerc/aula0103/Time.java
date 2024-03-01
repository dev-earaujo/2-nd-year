package exerc.aula0103;

public class Time {

    private String nome;

    private int pontos;

    public Time(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public void addVitoria() {
        pontos = pontos + 3;
    }

    public void addEmpate(){
        pontos++;
    }
}

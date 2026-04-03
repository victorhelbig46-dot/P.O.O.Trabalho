// Classe Participante
import java.util.ArrayList;
import java.util.List;

public class Participante {
    private String nome;
    private List<Aposta> apostas = new ArrayList<>();
    private int pontuacao = 0;

    public Participante(String nome) {
        this.nome = nome;
    }

    public void registrarAposta(Aposta aposta) {
        apostas.add(aposta);
    }

    public void atualizarPontuacao() {
        for (Aposta aposta : apostas) {
            pontuacao += aposta.calcularPontuacao();
        }
    }

    public int getPontuacao() { return pontuacao; }
    public String getNome() { return nome; }
}

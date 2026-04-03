// Classe Grupo
import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private String nome;
    private List<Participante> participantes = new ArrayList<>();

    public Grupo(String nome) {
        this.nome = nome;
    }

    public void adicionarParticipante(Participante p) {
        if (participantes.size() < 5) {
            participantes.add(p);
        } else {
            System.out.println("Máximo de 5 participantes atingido!");
        }
    }

    public void mostrarClassificacao() {
        participantes.sort((p1, p2) -> p2.getPontuacao() - p1.getPontuacao());
        for (Participante p : participantes) {
            System.out.println(p.getNome() + " - " + p.getPontuacao() + " pontos");
        }
    }
}

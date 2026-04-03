import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Criar clubes
        Clube c1 = new Clube("Palmeiras");
        Clube c2 = new Clube("Corinthians");

        // Criar campeonato
        Campeonato camp = new Campeonato("Brasileirão");
        camp.adicionarClube(c1);
        camp.adicionarClube(c2);

        // Criar partida
        Partida p1 = new Partida(c1, c2, LocalDateTime.of(2026, 4, 10, 16, 0));
        camp.adicionarPartida(p1);

        // Criar grupo e participantes
        Grupo grupo = new Grupo("Grupo 1");
        Participante joao = new Participante("João");
        Participante maria = new Participante("Maria");

        grupo.adicionarParticipante(joao);
        grupo.adicionarParticipante(maria);

        // Registrar apostas
        Aposta apostaJoao = new Aposta(p1, new Resultado(2, 1)); // João aposta 2x1
        Aposta apostaMaria = new Aposta(p1, new Resultado(1, 1)); // Maria aposta empate

        joao.registrarAposta(apostaJoao);
        maria.registrarAposta(apostaMaria);

        // Registrar resultado real
        p1.registrarResultado(new Resultado(2, 1)); // Resultado final 2x1

        // Atualizar pontuação
        joao.atualizarPontuacao();
        maria.atualizarPontuacao();

        // Mostrar classificação
        System.out.println("Classificação do grupo:");
        grupo.mostrarClassificacao();
    }
}

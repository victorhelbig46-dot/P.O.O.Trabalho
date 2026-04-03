// Classe Partida
import java.time.LocalDateTime;

public class Partida {
    private Clube clube1;
    private Clube clube2;
    private LocalDateTime dataHora;
    private Resultado resultado;

    public Partida(Clube clube1, Clube clube2, LocalDateTime dataHora) {
        this.clube1 = clube1;
        this.clube2 = clube2;
        this.dataHora = dataHora;
    }

    public void registrarResultado(Resultado resultado) {
        this.resultado = resultado;
    }

    public Resultado getResultado() {
        return resultado;
    }
}

// Classe Aposta
public class Aposta {
    private Partida partida;
    private Resultado resultadoPrevisto;

    public Aposta(Partida partida, Resultado resultadoPrevisto) {
        this.partida = partida;
        this.resultadoPrevisto = resultadoPrevisto;
    }

    public int calcularPontuacao() {
        Resultado real = partida.getResultado();
        if (real == null) return 0;

        boolean acertouResultado = real.getVencedor().equals(resultadoPrevisto.getVencedor());
        boolean acertouPlacar = real.getGolsClube1() == resultadoPrevisto.getGolsClube1()
                             && real.getGolsClube2() == resultadoPrevisto.getGolsClube2();

        if (acertouResultado && acertouPlacar) return 10;
        else if (acertouResultado) return 5;
        else return 0;
    }
}

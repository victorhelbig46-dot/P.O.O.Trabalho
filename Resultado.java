// Classe Resultado
public class Resultado {
    private int golsClube1;
    private int golsClube2;

    public Resultado(int golsClube1, int golsClube2) {
        this.golsClube1 = golsClube1;
        this.golsClube2 = golsClube2;
    }

    public int getGolsClube1() { return golsClube1; }
    public int getGolsClube2() { return golsClube2; }

    public String getVencedor() {
        if (golsClube1 > golsClube2) return "Clube1";
        else if (golsClube2 > golsClube1) return "Clube2";
        else return "Empate";
    }
}

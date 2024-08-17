package strategy;

public class TesteStrategy {
    public static void main(String[] args) {
        Comportamento normal = new ComportamentoNomal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setStrategy(agressivo);
        robo.mover();
        robo.setStrategy(normal);
        robo.mover();
        robo.setStrategy(defensivo);
        robo.mover();
    }
}

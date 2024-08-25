package projetos.strategy;

public class StrategyMain {
    public static void main(String[] args) {
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento normal = new ComportamentoNormal();

        Robo robo = new Robo();
        System.out.println("Normal");
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        System.out.println("Defensivo");
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();

        System.out.println("Agressivo");
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();

        }
}

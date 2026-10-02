public class CaminhandoState implements States {
    @Override
    public void enter(Agent agent) {
        System.out.println(agent.nome + " [Enter]: Iniciou a caminhada para a mina.");
    }

    @Override
    public void execute(Agent agent) {
        Trabalhador t = (Trabalhador) agent;
        t.distancia++; // Contador subindo
        System.out.println(t.nome + " [Execute]: Caminhando... Distância: " + t.distancia);
        
        // Transição: se a distância chegar a 2, muda de estado
        if (t.distancia >= 2) {
            t.changeState(new MinerandoState());
        }
    }

    @Override
    public void leave(Agent agent) {
        System.out.println(agent.nome + " [Leave]: Chegou na mina.");
    }
}
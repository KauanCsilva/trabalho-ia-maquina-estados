public class MinerandoState implements States {
    @Override
    public void enter(Agent agent) {
        System.out.println(agent.nome + " [Enter]: Pegou a picareta.");
    }

    @Override
    public void execute(Agent agent) {
        Trabalhador t = (Trabalhador) agent;
        t.recursos++; // Contador 
        System.out.println(t.nome + " [Execute]: Minerando... Recursos: " + t.recursos);
        
        // Transição: se pegar 3 recursos, volta pra base
        if (t.recursos >= 3) {
            t.changeState(new RetornandoState());
        }
    }

    @Override
    public void leave(Agent agent) {
        System.out.println(agent.nome + " [Leave]: Mochila cheia!");
    }
}
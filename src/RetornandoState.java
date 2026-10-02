public class RetornandoState implements States {
    @Override
    public void enter(Agent agent) {
        System.out.println(agent.nome + " [Enter]: Voltando para a base em segurança.");
    }

    @Override
    public void execute(Agent agent) {
        Trabalhador t = (Trabalhador) agent;
        if (t.distancia > 0) t.distancia--; // Contador =
        System.out.println(t.nome + " [Execute]: Retornando... A distancia da base é: " + t.distancia);
        
        if (t.distancia == 0) {
            t.recursos = 0; // Deposita os recursos
            t.changeState(new CaminhandoState()); 
        }
    }

    @Override
    public void leave(Agent agent) {
        System.out.println(agent.nome + " [Leave]: Chegou na base e guardou os recursos.");
    }
}
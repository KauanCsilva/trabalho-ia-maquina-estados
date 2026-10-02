public class EmAlertaState implements States {
    @Override
    public void enter(Agent agent) {
        System.out.println(agent.nome + " [Enter]: ALERTA VERMELHO!");
        ((TorreDefesa) agent).avisarPerigo(); 
    }

    @Override
    public void execute(Agent agent) {
        System.out.println(agent.nome + " [Execute]: Atirando nos invasores!");
    }

    @Override
    public void leave(Agent agent) {
        System.out.println(agent.nome + " [Leave]: Invasores destruídos.");
    }
}
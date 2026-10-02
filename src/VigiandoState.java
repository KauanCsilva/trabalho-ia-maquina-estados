public class VigiandoState implements States {
    @Override
    public void enter(Agent agent) {
        System.out.println(agent.nome + " [Enter]: Sistema de vigilância ativado.");
    }

    @Override
    public void execute(Agent agent) {
        TorreDefesa t = (TorreDefesa) agent;
        t.ciclosVigia++; // Cilco subindo
        System.out.println(t.nome + " [Execute]: Vigiando... parece estar tudo calmo. (Tempo: " + t.ciclosVigia + ")");
        
        // Transição: depois de 6 ciclos, detecta inimigos 
        if (t.ciclosVigia >= 6) {
            t.changeState(new EmAlertaState());
        }
    }

    @Override
    public void leave(Agent agent) {
        System.out.println(agent.nome + " [Leave]: Inimigo a frente!");
    }
}
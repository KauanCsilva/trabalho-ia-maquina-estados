public abstract class Agent {
    protected States currentState;
    public String nome;

    public Agent(String nome) {
        this.nome = nome;
    }

    // Transação entre o estado atual e o novo estado
    public void changeState(States newState) {
        if (currentState != null) {
            currentState.leave(this);
        }
        currentState = newState;
        currentState.enter(this);
    }

    public void update() {
        if (currentState != null) {
            currentState.execute(this);
        }
    }
}
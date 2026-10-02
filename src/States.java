public interface States {

    void enter(Agent agent);
    void execute(Agent agent);
    void leave(Agent agent);
}
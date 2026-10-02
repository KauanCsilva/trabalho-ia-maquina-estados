public class TorreDefesa extends Agent {
    public int ciclosVigia = 0;
    public GestorJogo gestor;

    public TorreDefesa(String nome, GestorJogo gestor) {
        super(nome);
        this.gestor = gestor;
    }
    
    public void avisarPerigo() {
        gestor.emitirAlerta();
    }
}
public class GestorJogo {
    private Trabalhador trabalhador;
    private TorreDefesa torre;

    public void inicializar() {
        trabalhador = new Trabalhador("Trabalhador");
        torre = new TorreDefesa("Torre", this);

        // Iniciando estados iniciais
        trabalhador.changeState(new CaminhandoState());
        torre.changeState(new VigiandoState());
    }

    
    public void emitirAlerta() {
        System.out.println("\n>>> Comunicado: Comunicação recebida da Torre! Ordenando evacuação do Trabalhador...\n");
        trabalhador.changeState(new RetornandoState());
    }

    public void iniciarLoop() {
        System.out.println("--- Iniciando Simulação ---");
        // loop 8 vezes para simular o comportamento dos agentes
        for (int i = 1; i <= 8; i++) {
            System.out.println("\n--- [CICLO " + i + "] ---");
            trabalhador.update();
            torre.update();
        }
        System.out.println("\n--- Fim da Simulação ---");
    }

    public static void main(String[] args) {
        GestorJogo gestor = new GestorJogo();
        gestor.inicializar();
        gestor.iniciarLoop();
    }
}
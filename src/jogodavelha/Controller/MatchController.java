package jogodavelha;

public class MatchController {
    public class MatchController {
    private final ConsoleView view = new ConsoleView();

    private int vitoriasX = 0;
    private int vitoriasO = 0;
     int empates = 0;

        public void iniciar() {

        }

    private int menuPrincipal() {

    }

    private String lerNomeNaoVazio(String prompt) {
    }

    private boolean desejaRepetir() {

   }

    private void atualizarPlacar(GameResult r) {

    }

    private void exibirResultado(GameResult r) {
    }

        private void exibirPlacar() {
       view.exibirMensagem(String.format("Placar da sessão -> X: %d | O: %d | Empates: %d\n", vitoriasX, vitoriasO, empates));
        }
    }
}

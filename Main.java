import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Jogador, Integer> partidas = new HashMap<>();

        // Simulando jogadores aparecendo em partidas
        Jogador j1 = new Jogador("Alice", 10);
        Jogador j2 = new Jogador("Bob", 15);
        Jogador j3 = new Jogador("Alice", 20); // mesmo nome, pontuação diferente
        Jogador j4 = new Jogador("Carlos", 5);
        Jogador j5 = new Jogador("Bob", 30);   // mesmo nome, pontuação diferente

        // Atualizando contagem de partidas
        atualizarPartidas(partidas, j1);
        atualizarPartidas(partidas, j2);
        atualizarPartidas(partidas, j3);
        atualizarPartidas(partidas, j4);
        atualizarPartidas(partidas, j5);

        // Exibindo ranking
        System.out.println("Ranking de Participações:");
        for (Map.Entry<Jogador, Integer> entry : partidas.entrySet()) {
            System.out.println(entry.getKey().getNome() + " participou de " + entry.getValue() + " partidas.");
        }
    }

    public static void atualizarPartidas(Map<Jogador, Integer> mapa, Jogador jogador) {
        mapa.put(jogador, mapa.getOrDefault(jogador, 0) + 1);
    }
}

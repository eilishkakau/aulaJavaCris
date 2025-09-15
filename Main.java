import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 📝 Entrada do usuário
        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();

        // 🧹 Limpeza e separação das palavras
        String[] palavras = frase.toLowerCase().split("\\s+");

        // 📊 Contagem com HashMap
        Map<String, Integer> contagem = new HashMap<>();

        for (String palavra : palavras) {
            // Remove pontuação, se houver
            palavra = palavra.replaceAll("[^a-záéíóúãõâêîôûç]", "");

            if (!palavra.isEmpty()) {
                contagem.put(palavra, contagem.getOrDefault(palavra, 0) + 1);
            }
        }

        // 📋 Exibindo o resultado
        System.out.println("\nContagem de palavras:");
        System.out.println(contagem);
    }
}

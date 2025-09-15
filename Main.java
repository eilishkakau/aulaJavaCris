import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // 🔹 Usando HashMap (sem ordem garantida)
        Map<String, String> agenda = new HashMap<>();

        // ➕ Adicionando contatos
        agenda.put("Ana", "99999-1111");
        agenda.put("Bruno", "98888-2222");
        agenda.put("Carlos", "97777-3333");

        // 🔍 Verificando se um nome existe
        String nomeConsulta = "Bruno";
        if (agenda.containsKey(nomeConsulta)) {
            System.out.println(nomeConsulta + " está na agenda com o número: " + agenda.get(nomeConsulta));
        } else {
            System.out.println(nomeConsulta + " não está na agenda.");
        }

        // 📋 Listando todos os contatos (sem ordem)
        System.out.println("\nContatos na agenda (HashMap):");
        for (Map.Entry<String, String> entry : agenda.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 🔄 Convertendo para TreeMap para ordenar por nome
        Map<String, String> agendaOrdenada = new TreeMap<>(agenda);

        // 📋 Listando contatos em ordem alfabética
        System.out.println("\nContatos na agenda (TreeMap - ordenado):");
        for (Map.Entry<String, String> entry : agendaOrdenada.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

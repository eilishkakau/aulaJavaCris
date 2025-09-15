import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Produto> produtos = new HashSet<>();

        Produto p1 = new Produto("Caneta", 2.50);
        Produto p2 = new Produto("Caneta", 2.50); // mesmo nome e preço
        Produto p3 = new Produto("Lápis", 1.00);

        produtos.add(p1);
        produtos.add(p2); // tentativa de duplicata
        produtos.add(p3);

        System.out.println("Produtos no conjunto:");
        for (Produto p : produtos) {
            System.out.println(p);
        }

        System.out.println("\nTotal de produtos no conjunto: " + produtos.size());
    }
}

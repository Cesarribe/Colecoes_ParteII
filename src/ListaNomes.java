import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNomes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        List<String> masculinos = new ArrayList<>();
        List<String> femininos = new ArrayList<>();

        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite um nome: ");
            String nome = scanner.nextLine();

            nomes.add(nome);

            System.out.print("Sexo (M - masculino, F - feminino): ");
            String sexo = scanner.nextLine();

            if (sexo.equalsIgnoreCase("M")) {
                masculinos.add(nome);
            } else if (sexo.equalsIgnoreCase("F")) {
                femininos.add(nome);
            } else {
                System.out.println("Sexo inválido para " + nome + ".");
            }

            System.out.print("Deseja adicionar mais nomes? (S - sim, N - não): ");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("N")) {
                continuar = false;
            }
        }

        System.out.println("Nomes do sexo masculino:");
        for (String nome : masculinos) {
            System.out.println(nome);
        }

        System.out.println("Nomes do sexo feminino:");
        for (String nome : femininos) {
            System.out.println(nome);
        }

        scanner.close();
    }
}

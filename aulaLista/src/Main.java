import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BancoDeDados dataBase = new BancoDeDados();
        Scanner leitor = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Listar todas as pessoas");
            System.out.println("2. Buscar pessoa por ID");
            System.out.println("3. Buscar pessoa por nome");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();
            leitor.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.println("\nListando todas as pessoas:");
                    dataBase.obterTodos().forEach(System.out::println);
                    break;
                case 2:
                    System.out.print("\nDigite o ID para buscar: ");
                    try {
                        int id = leitor.nextInt();
                        Pessoa pessoa = dataBase.obterPorId(id);
                        System.out.println("Pessoa encontrada: " + pessoa);
                    } catch (Exception e) {
                        System.out.println("ID não encontrado ou inválido.");
                    }
                    break;
                case 3:
                    System.out.print("\nDigite o nome para buscar: ");
                    String nome = leitor.nextLine();
                    System.out.println("Pessoas encontradas:");
                    dataBase.obterPorNome(nome).forEach(System.out::println);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        leitor.close();
    }
}
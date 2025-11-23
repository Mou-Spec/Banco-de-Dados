public class ListaMain {

    public static void main(String[] args) {
        var banco = new BancoDeDados();
        var pessoas = banco.obterTodos();

        pessoas.forEach((pessoa) -> {
            System.out.println(pessoa.toString());
        });
        System.out.println("----------------------------------");
        var pessoa = banco.obterPorId(1);
        System.out.println(pessoa.toString());

        System.out.println("----------------------------------");

        var pessoaFiltradas = banco.obterPorNome("THia");
        pessoaFiltradas.forEach((p) -> {
            System.out.println(p.toString());
        });

    }

    public void test(Pessoa p) {

    }
}
